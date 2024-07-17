public class Patterns2 {

    /*
    
    n=4
       *
      **
     ***
    ****
    
     */
    public static void main(String[] a) {
        int n = 5;
        int i;
        for ( i = 0; i < n; i++) {
            int space;
            for (space = 0; space < n - i -1; space++) {
                System.out.print(" ");
            }
            int star;
            for (star = n; star > n - i - 1; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
