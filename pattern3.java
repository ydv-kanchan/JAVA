import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wrtie the number: ");
        int n = scanner.nextInt();

        /*
        n=4
        * * * *
          * * *
            * * 
              *
         */
        int i = 0;
        while (i <= n) {
            int space = 0;
            while (space < i) {
                System.out.print("  ");
                space++;
            }
            int star = n - i;
            while (star >= 0) {
                System.out.print("* ");
                star--;
            }
            System.out.println();
            i++;
        }

        /*
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
        int m = scanner.nextInt();

        int row = 0;
        while (row < m* 2 - 1) {
            while (row <= m) {
                int j = 0;
                System.out.print("* ");
                star++;
            }
        }

        scanner.close();
    }
}
