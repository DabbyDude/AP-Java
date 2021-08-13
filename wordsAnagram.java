import java.util.Scanner;

public class wordsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two words and I will tell you if they're anagrams or not.");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] input = str.split(" ", 0);
        String firstWord = input[0];
        String secondWord = input[1];
        char c;
        int firstCounter = 0;
        int secondCounter = 0;

        for (int i = 33; i <= 126; i++) {
            for (int j = 0; j < firstWord.length(); j++) {
                c = firstWord.charAt(j);
                if (c == i) {
                    firstCounter++;
                }
            }

            for (int j = 0; j < secondWord.length(); j++) {
                c = secondWord.charAt(j);
                if (c == i) {
                    secondCounter++;
                }
            }
            if (firstCounter == secondCounter) {
                continue;
            }
            System.out.print("They aren't anagrams");
            scanner.close();
            return;
        }
        System.out.println("They are anagrams.");
        scanner.close();
    }
}