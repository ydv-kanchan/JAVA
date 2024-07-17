
public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        int i = 0;
        int k = 0;

        /* 
        
        * * * *
        * * * *
        * * * *
        * * * *
        
         */
        // using for loop
        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // using while loop
        while (i < m) {
            int j = 0;
            while (j < m) {
                System.out.print("* ");
                j++;
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
        
         */
        int o = 5;
        int a = 0;
        while (a < o) {
            int l = 0;
            while (l <= a) {
                System.out.print("* ");
                l++;
            }
            a++;
            System.out.println();
        }

        System.out.println("next pattern:");
        
        int q = 5;
        int row = 0;
        while (row < q) {
            int col = row;
            while (col < q) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        } 
    }
}
