public class conversionDecimalToBinary{


    public static void main(String[] args){

            int number=100;
            int ans=0;
            int update=1;


            while(number>0){
              int digit=number%2;
              ans=ans+digit*update;
              update*=10;
              number/=2;

           
            }
            System.out.println(ans);

    }
}