public class OperatorPrecedance{
    public static void main(String[] args) {
        


        // System.out.println(10 * 20 + "Java" + 10 + 20);
        //         System.out.println("A"+'B');
        //         System.out.println(5 > 3 || 10 > 20 && 2 < 1);

// int a=10;
// if(!(a>5 | ++a>10 && ++a<11)){
//     System.out.println("TRUE");

// }
// System.out.println(a);


int x=3;
int b= x++ + ++x + x++ + (--x);
System.out.println(b);
    }
}