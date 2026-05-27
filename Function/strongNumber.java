public class strongNumber{

public static long factorial(int number){
    int fact=1;
    for(int i=2;i<=number;i++){
        fact*=i;
    }
    return fact;

}

public static boolean strong(int number){
    long result=0;
    int original=number;

    while(number>0){
        int digit=number%10;
        result+=factorial(digit);
        number/=10;

    }
    return original==result;


}

public static void main(String[] args) {
    
    System.out.println(strong(146));
}


}