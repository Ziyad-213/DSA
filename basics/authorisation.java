import java.util.Scanner;

public class authorisation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your authorisation: ");
        String a = sc.next();

        switch (a) {

            case "student":
                System.out.println("Low");
                break;

            case "teacher":
                System.out.println("High");
                break;

            case "admin":
                System.out.println("Highest");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}