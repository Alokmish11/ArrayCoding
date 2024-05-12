public class FindEqilbriliumIndex {
     static int equalrightToleft(int arr[],int n){
          int leftSum,rightSum;
          for(int i=0;i<n;i++){
            leftSum=0;
            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            rightSum=0;
            for(int j=i+1;j<n;j++){
                rightSum+=arr[j];
            }
            if (leftSum == rightSum) {
                return i;
          }
     }
     return -1;
    }
     public static void main(String[] args){
        int arr[]={2,3,-1,5,4};
        int n=4;
        System.out.print(equalrightToleft(arr,n));
     }
    
}
