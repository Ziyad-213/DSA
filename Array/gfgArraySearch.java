public class gfgArraySearch{

    public static  int search(int arr[], int x) {
      
         for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,6,8,4,8};
       
        System.out.print(search(arr,7));
    }



}