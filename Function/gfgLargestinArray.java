public class gfgLargestinArray{
     public static int largest(int[] arr) {
       
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
        
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,8,8,8,8,8,44,4};
        System.out.println(largest(arr));

    }
}