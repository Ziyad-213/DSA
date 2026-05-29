public class smallerElementCount{


    public static int count(int[] nums,int number){
        int count =0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]<number) count++;

        }
        return count;
    
    }




    public static void main(String[] args){

    }
}