public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;;
        for(int i=0; i < 20; i++) {
            c = a + b;
            b = a;
            a = c;
            
            System.out.print(a + " ");   
        }
    }
}
