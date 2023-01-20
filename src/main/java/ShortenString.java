import java.util.Scanner;

public class ShortenString {

    public static String shortenString(String longString, int maxLength) {
        String[] words = longString.split(" ");

        String shortenedString = "";
        int currentLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (currentLength + words[i].length() + 1 <= maxLength) {
                shortenedString += words[i] + " ";
                currentLength += words[i].length() + 1;
            } else {
                break;
            }
        }

        // remove the extra space at the end
        shortenedString = shortenedString.trim();
        if (shortenedString.length() == maxLength) {
            return shortenedString;
        } else {
            return shortenedString + "...";
        }
    }
}

