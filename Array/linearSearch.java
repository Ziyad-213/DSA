public class linearSearch{

    public static int index(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
       public static boolean index2(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
       int index1= index(arr, 2);

       System.out.println(index1);
        System.out.println(index2(arr, 11));

        
    }
}