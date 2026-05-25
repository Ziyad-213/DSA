public class second_Last_Digit_Even{

public static boolean even(int number){
number=Math.abs(number);
if(number<10) return false;

int digit=(number/10)%10;

return digit==2;



}




public static void main(String[] args) {
    System.out.println(even(10));
}
}