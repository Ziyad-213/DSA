
import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

int sum=0;
        int original=number;

        while(number>0){
            int digit=number%10;

           sum+=(digit*digit*digit);

           number/=10;

        }
if(original==sum){
    System.out.println("Yes");
}
else{
    System.out.println("No");
}

    }
}