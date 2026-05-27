public class gfgCountEvenandOdd{
        public static int[] countOddEven(int[] arr) {
       
        int countEven=0;
        int countOdd=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) countEven++;
            else countOdd++;
        }
        return new int[] {countOdd,countEven};
        
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,787,9,9};
        int[] count=countOddEven(arr);

        System.out.print(count[0]+" ");
        System.out.println(count[1]);
    }
}