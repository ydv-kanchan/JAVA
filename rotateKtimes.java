import java.util.Scanner;

public class rotateKtimes {
  public static void rev(int arr[],int a,int b){
    for(int i=a,j=b;i<j;i++,j--){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    
  }
  public static void main(String[] args) {
    int n,k;
    Scanner ob=new Scanner(System.in);
    n=ob.nextInt();
    k=ob.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=ob.nextInt();
    }
    k=k%n;
    rev(arr,0,n-1);
    rev(arr,0,k-1);
    rev(arr,k,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    ob.close();
  }
}
