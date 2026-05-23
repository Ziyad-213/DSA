public class primeNumber{

    public static boolean check(int number){

        if(number==1) return false;

         boolean prime=true;

         for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0) {
                prime=false;
                break;
            }
         }
         return prime;
    }
    public static void main(String[] args) {
        boolean prme=check(2);
        System.out.println(prme);
    }
}