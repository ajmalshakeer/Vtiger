package String_problome;

public class Vtiger_function {
    
     //initializing a method to centralizing the input text
    public  String centralizeString(String words, int maxLength) {
        String[] wordArray = words.split("\\s+");
        StringBuilder formattedText = new StringBuilder();// using the proper string methods
        StringBuilder line = new StringBuilder();

        // Applying the conditions for formatting and alignment of the string
        // along with using some string functions

        for (String word : wordArray) {
            line.append(word).append(" ");

            if (line.length() > maxLength) {
                formattedText.append(centralizeLine(line.toString().trim(), maxLength)).append("\n");
                line.setLength(0);
            }
        }

        if (line.length() > 0) {
            formattedText.append(centralizeLine(line.toString().trim(), maxLength)).append("\n");
        }

        return formattedText.toString(); // converting the formatted text to string and returning it
    }


    //initializing another method to format each line to ensure proper centralization
    private static String centralizeLine(String line, int maxLength) {

        // int leftPadding = 33;    //Setting the desired left padding

        if (line.length() >= maxLength) {
            return line;
        } else {
            int leftPadding = (maxLength - line.length()) / 2; // Calculating the left padding dynamically

            StringBuilder formattedLine = new StringBuilder();

            for (int i = 0; i < leftPadding; i++) {
                formattedLine.append(" "); 

            formattedLine.append(line);

        }
        return formattedLine.toString();
    }
}
}

