public class shortestDistance{

public static int mini(int[] arr){
    int miniDistance=Integer.MAX_VALUE;
    int count=0;

    for(int i=0;i<arr.length;i++){

        if(arr[i]%2!=0) continue;
        count=count+1;

        for(int j=i+1;j<arr.length;j++){

           if(arr[j]%2!=0) continue;
            int dist=arr[i]-arr[j];
            if(dist<miniDistance) miniDistance=dist;
            count=count+1;
    

        }

    }
    if(count==0 || count==1) return -1;
    return miniDistance;

}





    public static void main(String[] args){

        int[] arr={1,4,3,7};
        int minimum=mini(arr);

        System.out.println(minimum);

    }
}