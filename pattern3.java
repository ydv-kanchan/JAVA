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

        int rn=2*m-1;
        int star=1;
        int k=1;
        while(k<=rn)
        {
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            if(k<n)
            {
                star++;
            }
            else
            {
                star--;
            }
            k++;
            System.out.println();
       }


        scanner.close();
    }
}
