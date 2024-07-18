import java.util.Scanner;

public class pattern4 {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wrtie the number: ");
        int n = scanner.nextInt();

        /*
        n=5
                *
              * *
            * * *
          * * * *
        * * * * *
          * * * *
            * * *
              * *
                *
        */
        int space = n - 1;
        int star = 1;
        int i = 1;
        while (i <= 2 * n - 1) {
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            if (i < n) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }
            System.out.println();
            i++;
        }
    scanner.close();
    }
    
}
