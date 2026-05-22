public class placeValueOfDigit{
    public static void main(String[] args){
        int number = 3925;
        int digit=9;
        //output=900;
        int multiple=1;

       int ldigit=number%10;
       number/=10;
       while(ldigit!=digit){
        ldigit=number%10;
        multiple*=10;
        number/=10;
       }
        System.out.println(ldigit*multiple);

    }
}