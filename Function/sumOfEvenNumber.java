public class sumOfEvenNumber{

    public static int sumEven(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0)  sum+=i;
           
        }
        return sum;
    }
       public static int sumOdd(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0)  sum+=i;
           
        }
        return sum;
    }

    public static void main(String[] args) {
        int sm=sumEven(1, 5);
          int smOdd=sumOdd(1, 5);
        System.out.println(sm);
        System.out.println(smOdd);
    }
}