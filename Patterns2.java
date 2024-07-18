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
        int i=0;
        while(i < n) {
            int space=0;
            while (space < n - i -1) {
                System.out.print(" ");
                space++;
            }
            int star=n;
            while (star > n - i - 1) {
                System.out.print("*");
                star--;
            }
            System.out.println();
            i++;
        }
    }
}
