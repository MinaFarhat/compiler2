import AST.Plur;
import SymbolTable.SymbolTable;
import Visitor.BaseVisitor;
import antlr.dartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import Errorhandling.SyntaxErrorListener;
import Errorhandling.SemanticErrorhandling;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import antlr.dartLexer;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String phpFilePath = "F:\\Projects\\java\\MinaCom\\tyy.php";
        Files.write(Paths.get(phpFilePath), "".getBytes());
        File folder = new File("F:\\Projects\\java\\MinaCom\\test");
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            String source = files[i].getPath();
            CharStream Cs = fromFileName(source);
            dartLexer dartLexer = new dartLexer(Cs);
            CommonTokenStream tokenStream = new CommonTokenStream(dartLexer);
            dartParser dartParser = new dartParser(tokenStream);

            // Set up error handling
            SyntaxErrorListener syntaxErrorListener = SyntaxErrorListener.INSTANCE;
            SemanticErrorhandling semanticErrorListener = SemanticErrorhandling.INSTANCE;
            dartParser.removeErrorListeners();
            dartParser.addErrorListener(syntaxErrorListener);
            dartParser.addErrorListener(semanticErrorListener);

            dartParser.PlurContext tree = dartParser.plur();

            SymbolTable symbolTable = SymbolTable.getInstance();

            if (syntaxErrorListener.hasError()) {
                System.out.println("Syntax error occurred. Please check the error log.");
                syntaxErrorListener.printErrors();
            } else if (semanticErrorListener.hasError()) {
                System.out.println("Semantic error occurred. Please check the error log.");
                semanticErrorListener.printErrors();
            } else {
                Plur d = (Plur) new BaseVisitor().visit(tree);
                String outputFilePath = "F:\\Projects\\java\\MinaCom\\" + files[i].getName() + ".html";
                FileWriter fileWriter = new FileWriter(outputFilePath, false);
                fileWriter.write(d.ToHTML());
                fileWriter.close();

                File outputFile = new File(outputFilePath);
                if (!semanticErrorListener.hasError()) {
                    Desktop.getDesktop().open(outputFile);
                }

                System.out.println("The Parser Output:");
                System.out.println("***********************************************************");
                System.out.println(d);
                System.out.println("***********************************************************");
                System.out.println("The SymbolTable:");
                System.out.println("***********************************************************");
                symbolTable.print();
                System.out.println("***********************************************************");
            }

            if (syntaxErrorListener.hasError() || semanticErrorListener.hasError()) {
                break; // Stop processing other files if errors occur
            }
        }
    }
}
