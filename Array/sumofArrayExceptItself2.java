public class sumofArrayExceptItself2{




    public static void main(String[] args) {
        int[] arr={1,1,45,7,7,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=sum-arr[i];
        }
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}