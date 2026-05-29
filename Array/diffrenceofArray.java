import java.util.*;
public class diffrenceofArray{




    public static int differdigit(int[] nums1,int[] nums2){

        int i=0;
        int digit=0;
        int digit2=0;
        
        while(i<nums1.length && i<nums2.length){
            digit=digit*10+nums1[i];
            digit2=digit2*10+nums2[i];
            i++;
        }
            while(i<nums1.length){
                 digit=digit*10+nums1[i];
                 i++;
            }
            while(i<nums2.length){                    //         
                 digit2=digit2*10+nums2[i];
                 i++;

            }
    

        
       return digit-digit2;


    }

    public static ArrayList<Integer> digit2Array(int digit){
         ArrayList<Integer>ans=new ArrayList<>();
         digit=Math.abs(digit);
       
        while(digit>0){
            ans.add(digit%10);
            digit/=10;


        }





        return ans;
    }


public static void main(String[] args) {
    int nums1[]={4,3,5,6,7};
    int nums2[]={3,5,6,7,7,0};
    //  ArrayList<Integer>ans=new ArrayList<>();
    

   int digit=differdigit(nums1, nums2);
   System.out.println(digit);
   ArrayList<Integer> ans=digit2Array(digit);
   Collections.reverse(ans);
   System.out.println(ans);
    
}









}