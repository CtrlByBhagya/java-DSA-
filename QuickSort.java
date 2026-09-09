import java.util.*;
public class QuickSort {
    // this function performs the quick sort
    static void quickSort(int[] arr,int low, int high){
        // base case
        if(low>high){
            //put pivot into correct place
            int pivotIndex=partion(arr,low,high);
            
            //sort the elements left side of pivot
            quickSort(arr,low,pivotIndex-1);

            //sort the elements right side of pivot
            quickSort(arr,pivotIndex+1,high);
            
        }

    }
    //this funtion places the pivot at it's correct posistion
    static int partion(int[]arr,int low,int high){
        //taking last element pivot
        int pivot=arr[high];
        // i keep track of smaller element
        int i=low-1;

        //j checks every element before the pivot
        for(int j=low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numebr of elements:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("enter the elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort( arr,0,n-1);
        System.out.print("sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }
}