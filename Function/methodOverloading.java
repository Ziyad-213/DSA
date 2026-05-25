public class methodOverloading{

class A{
    public static int add(int a,int b,int c){
        return a+b+c;

    }

      public static int add(int a,int b,int c,int d){
        return a+b+c+d;
        
    }
}


    public static void main(String[] args) {
     int  a= A.add(1, 2, 3);
     System.out.println(a);
     a=A.add(1,4,5,6);
     System.out.println(a);

    }
}