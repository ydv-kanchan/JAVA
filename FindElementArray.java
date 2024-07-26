import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        boolean found = false;
        int an=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                found = true;
                an = i;
                break;
            }
        }
        if (found) {
            System.out.println(found + " " + an);
        }
        else {
            System.out.print("element not found");
        }

        sc.close();
    }
}
