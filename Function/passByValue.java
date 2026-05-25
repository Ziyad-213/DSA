public class passByValue{

    public static void change(int a){
        a=10;
      

    }

    public static void main(String[] args) {

        


        int a=90;
        change(a);
        System.out.println(a);
    }
}