import java.util.*;
public class HashTool {
    public static void main(String a[]){

        int [] arr={34,56,820,110,78,34,820,34};

        HashMap < Integer,Integer > map=new HashMap<>();

        //counting frequency
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // printing result
        for(int key:map.keySet()){
            System.out.println(key+" appears "+ map.get(key) + " times");
        }
    }    
}
