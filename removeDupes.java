import java.util.Scanner;
import java.util.Vector;

public class removeDupes {
    public static boolean isDupe(Vector<Integer> dupeList, int i) {
        return dupeList.indexOf(i) >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Input as many words you want serperated with by\na space and I'll remove all the duplicates.");
        String str = scanner.nextLine();
        String[] input = str.split(" ", 0);
        Vector<Integer> dupeList = new Vector<>();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    dupeList.add(j);
                }
            }
        }
        scanner.close();
        for (int i = 0; i < input.length; i++) {
            if (!isDupe(dupeList, i)) {
                System.out.print(input[i] + " ");
            }
        }
    }
}
