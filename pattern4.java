public class pattern4 {
    public static void main(String args[])
    {
        int n = 5;
        int rn = 2 * n - 1;
        int space = n - 1;
        int star = 1;
        int i = 1;
        while(i<=rn)
        {
            int j = 1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }
            if(i<n)
            {
                star++;
                space--;
            }
            else
            {
                star--;
                space++;
            }
            System.out.println();
            i++;
        }
    }
    
}
