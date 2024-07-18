//this line import Scanner class from util package, allowing us to use the Scanner class to read input from various sources, such as the keyboard.
import java.util.Scanner; 

public class InputFromUser {
    public static void main(String[] s) {

        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();//take numerical value in num varibale from user
        double dbl = scanner.nextDouble();//take double value in num varibale from user
        scanner.nextLine();
        /*
        After reading the integer (num) and double (dbl) values, the scanner.nextLine(); call is used to consume the newline character left in the input buffer.
        The string input is read correctly using String str = scanner.nextLine(); without an extra scanner.nextLine();.
         */
        String str = scanner.nextLine();//take string value in num varibale from user
        boolean bool = scanner.nextBoolean();//take boolean value in num varibale from user

        System.out.println("this is a number: "+ num);//print num
        System.out.println("this is double: " + dbl);//print double
        System.out.println("this is string: " + str);//print string
        System.out.println("this is a boolean: " + bool);//print boolean

        scanner.close();
    }
}
