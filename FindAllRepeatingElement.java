 public class FindAllRepeatingElement {
    static void reapeating(int arr[]){
        int count=0;
        int dup[]=new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j])
               dup[count++]=arr[i];
            }
        }
        System.out.println("Reapting element");
            for(int i=0;i<count;i++)
            if(dup[i]!=dup[i+1])
            System.out.print(dup[i]+" ");
            
    }
    public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,4,5,2};
        reapeating(arr);
}
}