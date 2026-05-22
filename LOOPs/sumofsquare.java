
import java.util.Scanner;

public class sumofsquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int sumofsq=0;

        while(number>0){
            int digit=number%10;
            sumofsq=sumofsq+(digit*digit);
            number/=10;

        }
        System.out.println(sumofsq);
    }
}