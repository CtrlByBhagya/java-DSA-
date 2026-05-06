import java.util.*;
public class Hashing{
    public static void main(String a[]){
        
        int [] sums={1,2,3,2,2,3,1,4,6,7};
        int max=10;
        int [] hash=new int[max+1];

        for (int i=0;i<sums.length;i++){
            hash[sums[i]]++;
        }

        for(int i=0;i<hash.length;i++){
            System.out.println(i+" "+"appears" +" "+ hash[i]+" "+"times");
        }
        

    }

}