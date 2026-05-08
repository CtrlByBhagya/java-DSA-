import java.util.*;
public class Hashing{
    public static void main(String a[]){
        
        int [] sums={1,2,3,2,2,3,1,4,6,7};  // given array
        int max=10; //fixed size. the max no. of this array can't exceed more than 10
        int [] hash=new int[max+1]; // count box. will keep the count of number each time it is found in the array

        for (int i=0;i<sums.length;i++){ // iterates through the array 
            hash[sums[i]]++;  // increase and stores the count everytime it encounter the value
        }

        for(int i=0;i<hash.length;i++){ // iterates through the hash array which contains the count of each elements 
            System.out.println(i+" "+"appears" +" "+ hash[i]+" "+"times");  //prints the count of each element
        }
    }
}