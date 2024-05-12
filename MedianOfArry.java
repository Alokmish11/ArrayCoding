import java.util.*;
public class MedianOfArry {
    static void getMedian(int arr[],int n){
        Arrays.sort(arr);
        if(n%2==0){                 // even number 
            int idx1=(n/2)-1;
            int idx2=n/2;
            System.out.print((double)(arr[idx1]+arr[idx2])/2);
        }
        else{
            System.out.println(arr[n/2]);
        }

    }
    public static void main(String[] args){
        int n=5;
        int arr[]={1,2,3,4,5};
        System.out.println("Arry of Median");
        getMedian(arr,n);
    }
    
}

