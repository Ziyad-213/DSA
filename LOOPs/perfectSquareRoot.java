public class perfectSquareRoot{
    public static void main(String[] args) {
        

        for(int i=0;i<=81;i++){
         
         int root=(int)Math.sqrt(i);
         if(root*root==i){
            System.out.println(i);
         }
          
        }
    }
}