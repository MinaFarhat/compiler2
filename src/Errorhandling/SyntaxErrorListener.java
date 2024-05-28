

package Errorhandling;

import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {
    private SymbolTable symbolTable = SymbolTable.getInstance();
    public static SyntaxErrorListener INSTANCE = new SyntaxErrorListener();
    public boolean hasError = false;
    private List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        if (!SymbolTable.REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            symbolTable.hasSyntaxError = true;
        }
        String error = "Error in line " + line + ":" + charPositionInLine + " " + msg;
        symbolTable.write(error, "F:\\Projects\\java\\MinaCom\\src\\Errorhandling\\SyntaxError.txt");
        errors.add(error);
    }

    public boolean hasError() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        for (String error : errors) {
            System.out.println(error);
        }
    }

    public void write(String text, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(text + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
