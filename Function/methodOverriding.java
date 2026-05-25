public class methodOverriding{

   static  class a{
          int add(int a,int b){
            return a+b;
        }
    }
   static  class b extends a{
        @Override   
          int add(int a,int b){
            return a*b;
    }
}
public static void main(String[] args) {
   a obj=new a();
   b obj2=new b();

   System.out.println(obj.add(1,5));
   System.out.println(obj2.add(1,5));

}

}