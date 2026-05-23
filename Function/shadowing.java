public class shadowing{

    int a=5;
    // int b=8;

    public static void print(int a){
        System.out.println(a);
    }
        public void print2(int a){
        System.out.println(this.a);
    }

    public static void main(String[] args) {
       
        print(9);
        shadowing obj=new shadowing();
        obj.print2(9);

    }
}