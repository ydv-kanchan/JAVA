public class OctalOrInt {
    public static void main(String[] args) {
        int a = 054; //every number staring with 0 and having all digits less than 8 are considered as octal number
        //but it will give error if we will write 0  in front of any other number with any digit more than 0
        // int b = 058; //out of range error
        System.err.println(a);
        // System.out.println(b);

        // range of byte
        byte i = 122; //as 122 is ealisy converter to byte

        // byte j = 140; //error can not convert int to byte, so need to do explicit type casting
        byte j = (byte) 140; // will give -116
        byte k = (byte) 300; //it will be a 9 digit number in binary so we will remove the most left bit and then it will be a positive number when converted to byte
        // byte a = (byte) 
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        for (byte m = 0; m <127; m++) {
            System.out.println(m);
        }
        System.out.println(args.length);

        long l = 8768697988l; // error because without l in end it will be considered as a integer
        System.out.println(l);

        // long n = (long)(436879799877);
        System.out.println(n);
    }
}