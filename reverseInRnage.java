import java.util.*;
public class reverseInRnage{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int size=ob.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            array[i]=ob.nextInt();
        }
        int n=ob.nextInt();
        int m=ob.nextInt();
        for (int i = n; i < m / 2; i++) {
            int temp = array[i];
            array[i] = array[m- 1 - i];
            array[m - 1 - i] = temp;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        ob.close();
    }

    
}