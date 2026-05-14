import java.util.*;

public class Demo {
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter array elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if ( arr[j]< arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        System.out.println("sorted array:");
        for( int num:arr){
            System.out.print(num +" ");

        }
    }
}
