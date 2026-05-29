public class sumofArrayExceptItself{
    public static int[] sum(int[] nums){
        int[] ans=new int[nums.length];

  for(int i=0;i<nums.length;i++){
    ans[i]=0;

    for(int j=0;j<nums.length;j++){
        if(i==j)continue;
        ans[i]+=nums[j];

    }
  }
  return  ans;
  

    }

    public static void main(String[] args) {
        int[] nums={2,4,2,7,7};
       int[] ans=sum(nums);
       for(int ind:ans){
        System.out.print(ind+" ");
       }
    }
}