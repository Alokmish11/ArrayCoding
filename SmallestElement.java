import java.util.*;
public class SmallestElement {
    public static void main(String[] args){
        int arr1[]={9,0,4,8,2};
        System.out.println(sort(arr1));
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        //return arr[0];// Smallest element
        return arr[arr.length-1];  // Gratest element
    }

    
}
