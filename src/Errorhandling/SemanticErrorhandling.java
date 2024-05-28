package Errorhandling;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorhandling extends BaseErrorListener {
    private SymbolTable symbolTable = SymbolTable.getInstance();
    public static SemanticErrorhandling INSTANCE = new SemanticErrorhandling();
    public boolean hasError = false;
    private List<String> errors = new ArrayList<>();
    public static boolean REPORT_SEMANTIC_ERRORS = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        if (!REPORT_SEMANTIC_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            symbolTable.hasSemanticError = true;
        }
        String error = "Error in line " + line + ":" + charPositionInLine + " " + msg;
        symbolTable.write(error, "F:\\Projects\\java\\MinaCom\\src\\Errorhandling\\SemanticError.txt");
        errors.add(error);
    }

    public boolean hasError() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        if (hasError()) {
            System.out.println("Semantic error occurred. Please check the error log.");
            for (String error : errors) {
                System.out.println(error);
            }
        } else {
            System.out.println("No semantic errors found.");
        }
    }

}
