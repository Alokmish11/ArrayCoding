public class AddElementBegining {
    static void insertBigning(int arr[],int n,int value){
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=value;


        //arr[n]=value; // Only this single statement insert element ending,not any for loop include 
    }
    public static void main(String[] args){
        int arr[]={2,5,8,9,7,1};
        int value=55;
        int n=5;
        System.out.println("Before inserting the value at beginning:");
        for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
      }
       System.out.println();
        insertBigning(arr,n,value);
        System.out.println("After insert:");
            for(int i=0;i<=n;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }

