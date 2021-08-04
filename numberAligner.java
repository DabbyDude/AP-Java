public class numberAligner {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 10; i++) {
            for (int u = 0; u < 10; u++) {
                System.out.print(n + " ");
                if (n < 10) {
                    System.out.print(" ");
                }
                if (n < 100) {
                    System.out.print(" ");
                }
                n++;
            }
            System.out.println("");
        }
    }
}