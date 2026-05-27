public class fibonacciRecursive{

public static int  fiboRecur(int terms){
    if(terms==1||terms==2) {
      
        return terms-1;

    }
   return fiboRecur(terms-1)+fiboRecur(terms-2);
    

}




    public static void main(String[] args) {
       int number= fiboRecur(10);
       System.out.println(number);
    }
}