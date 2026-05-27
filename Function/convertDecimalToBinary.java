public class convertDecimalToBinary{

    public static void main(String[] args) {
        

        int number=10001;
       
        int decimal=0;
        int count=0;
        while(number>0){
            int digit=number%10;
            decimal+=digit*(int)Math.pow(2,count);
            count++;
            number/=10;
        }
        System.out.println(decimal);


    }
}