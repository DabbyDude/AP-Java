import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a word.");
        String str = scanner.nextLine();
        str = str.replaceAll("\\s+","");
        str = str.toLowerCase();
        for(int i = 0; i < str.length() - 1; i++) {
             
            
            if(str.charAt(a) != str.charAt(str.length() - b)) {
                System.out.print("The word you inputed isn't a palindrome.");
                return;
            }
            a++;
            b++;
        }
        System.out.print("Congrats, the word you inputed is a palindrome.");
        scanner.close();
    }
}