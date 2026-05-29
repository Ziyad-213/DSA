public class maxDistanceOccurence{
    public static int max(int a,int b ){
        
        return (a>b?a:b);

    }







    public static void main(String[] args) {
        int maxDist=Integer.MIN_VALUE;
        int count=0;

        int[] arr={1,3,5,7,2,4,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]!=arr[i]) continue;
                count=count+2;

               
                maxDist=max(j-i,maxDist);

            }

        }
        if(count<2){
            System.out.println("Duplicate dont exist");
        }
        else{
            System.out.println(maxDist);
        }

    }

}