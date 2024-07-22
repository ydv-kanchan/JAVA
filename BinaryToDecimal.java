import java.util.Scanner;

//if number is given as integer
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = num;

        int decimal = 0;
        int base = 1;
        while (num > 0) {
            int lastdigit = num % 10; // take last digit by dividing number by 10 and taking it's remainder
            num = num / 10; //remove  the last digit from the binary numberl
            decimal = lastdigit * base;
            base = base * 2;
        }
 
        System.out.println("decimal value of "+ n + " is " + decimal);
        sc.close();
    }
}