package String_problome;

public class Vtiger_function {
    
     //initializing a method to centralizing the input text
    public  String centralizeString(String words, int maxLength) {
        String[] wordArray = words.split("\\s+");
        StringBuilder formattedText = new StringBuilder();//using the proper string methods
        StringBuilder line = new StringBuilder();

        int wordCount = 0;

        for (String word : wordArray) {
            line.append(word).append(" ");
            wordCount++;


            //Applying the logic for formatting and alignment the string
            //along with using some string functions
            if (wordCount == 10 || line.length() > maxLength) {
                formattedText.append(centralizeLine(line.toString().trim(), maxLength)).append("\n");
                line.setLength(0);
                wordCount = 0;
            }
        }

        if (line.length() > 0) {
            formattedText.append(centralizeLine(line.toString().trim(), maxLength)).append("\n");
        }

        return formattedText.toString();   //converting the formatted text to string and returning it
    }


    //initializing another method to format each line to ensure proper centralization
    private static String centralizeLine(String line, int maxLength) {

        int leftPadding = 33;    //Setting the desired left padding

        StringBuilder formattedLine = new StringBuilder();

        for (int i = 0; i < leftPadding; i++) {
            formattedLine.append(" ");       // Adding 10 empty spaces for left padding
        }

        formattedLine.append(line);

        return formattedLine.toString();
    }
}
