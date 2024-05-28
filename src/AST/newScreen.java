package AST;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class newScreen {
    private String name;
    private String sendName;

    public newScreen(String name) {
        this.name = name;
    }

    public newScreen(String name,String sendName) {
        this.name = name;
        this.sendName=sendName;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }


    @Override
    public String toString() {
        return name + "("+"\""+sendName+"\""+")" + "," + "\n";
    }

    public String ToHTML() throws IOException {
        if (name == null) {
            return "";
        } else {
            String fileName = "text2." + sendName + ".html";
            String filePath = System.getProperty("user.dir") + "/" + fileName;
            String phpFilePath = "F:\\Projects\\java\\MinaCom\\tyy.php";
            List<String> extractedNames = new ArrayList<>();
            // Read the content of the tyy.php file
            String phpContent = new String(Files.readAllBytes(Paths.get(phpFilePath)));

            // Define the regex pattern for extracting the name
            String pattern = "\\$result\\s*=\\s*'(.+?)';";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(phpContent);

            String extractedElement = "";
            while (matcher.find()) {
                extractedNames.add(matcher.group(1));
            }
            for (String extractedName : extractedNames) {
                if (Objects.equals(extractedName, sendName)) {
                    extractedElement = extractedName;
                }
            }
            String result = "<html>\n" +
                    "<head>\n" +
                    "<title>" + extractedElement + "'s Page</title>\n" +
                    "<style>\n" +
                    "    body {\n" +
                    "        display: flex;\n" +
                    "        flex-direction: column;\n" +
                    "        align-items: center;\n" +
                    "        justify-content: center;\n" +
                    "        height: 100vh;\n" +
                    "        margin: 0;\n" +
                    "    }\n" +
                    "    .appbar {\n" +
                    "        position: fixed;\n" +
                    "        top: 0;\n" +
                    "        left: 0;\n" +
                    "        background-color: #70a7f9;\n" +
                    "        color: white;\n" +
                    "        display: flex;\n" +
                    "        align-items: center;\n" +
                    "        justify-content: center;\n" +
                    "        padding: 30px;\n" +
                    "        width: 100%;\n" +
                    "        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);\n" +
                    "    }\n" +
                    "    .appbar h1 {\n" +
                    "        margin: 0;\n" +
                    "        font-size: 20px;\n" +
                    "        color: #333;\n" +
                    "    }\n" +
                    "    .content {\n" +
                    "        opacity: 0;\n" +
                    "        animation: fade-in 0.5s forwards;\n" +
                    "    }\n" +
                    "    @keyframes fade-in {\n" +
                    "        from { opacity: 0; transform: translateY(20px); }\n" +
                    "        to { opacity: 1; transform: translateY(0); }\n" +
                    "    }\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<div class=\"appbar\">\n" +
                    "    <h1>" + "The Second Screen" + "</h1>\n" +
                    "</div>\n" +
                    "<div class=\"content\">\n" +
                    "    <h1>" + extractedElement + "</h1>\n" +
                    "</div>\n" +
                    "<script>\n" +
                    "    window.addEventListener('load', function() {\n" +
                    "        var content = document.querySelector('.content');\n" +
                    "        content.style.opacity = 1;\n" +
                    "    });\n" +
                    "</script>\n" +
                    "</body>\n" +
                    "</html>";

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(result);
            writer.close();

            return fileName;
        }
    }

}
