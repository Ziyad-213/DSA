public class sum{

    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public int add2(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int sumOfThree=add(5,6,8);

        System.out.println(sumOfThree);
        sum obj=new sum();
        System.out.println(obj.add2(sumOfThree, sumOfThree, sumOfThree));
    }
}