package String_problome;

public class Vtiger_function {

    // initializing a method to centralize the input text
    public String centralizeString(String words, int maxLength) {
        String[] wordArray = words.split("\\s+");
        StringBuilder formattedText = new StringBuilder();

        // Applying the conditions for formatting and alignment of the string
        // along with using some string functions

        StringBuilder line = new StringBuilder();
        for (String word : wordArray) {
            if (line.length() + word.length() + 1 > maxLength) {
                formattedText.append(centralizeLine(line.toString().trim(), maxLength)).append("\n");
                line.setLength(0);
            }
            line.append(word).append(" ");
        }

        if (line.length() > 0) {
            formattedText.append(centralizeLine(line.toString().trim(), maxLength)).append("\n");
        }

        return formattedText.toString(); // converting the formatted text to string and returning it
    }

    // initializing another method to format each line to ensure proper centralization
    private static String centralizeLine(String line, int maxLength) {
        if (line.length() >= maxLength) {
            return line;
        } else {
            int totalPadding = maxLength - line.length();
            int leftPadding = totalPadding / 2;
            int rightPadding = totalPadding - leftPadding;

            StringBuilder formattedLine = new StringBuilder();

            for (int i = 0; i < leftPadding; i++) {
                formattedLine.append(" ");
            }
            formattedLine.append(line);

            for (int i = 0; i < rightPadding; i++) {
                formattedLine.append(" ");
            }
            return formattedLine.toString();
        }
    }
}
