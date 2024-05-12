
public class FindProductSubArray {
    static int product(int arr[]){
        int result=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
           int  product=1;
           for(int k=i;k<=j;k++)
           product*=arr[k];
           result=Math.max(result,product);

        }
        }
    return result; 
}
public static void main(String[] args){
int arr[]={1,2,-3,0,-4,-5};
 System.out.println(product(arr));
}
}