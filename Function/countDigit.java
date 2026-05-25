public class countDigit{
  
  public static int count(int number){
        number=Math.abs(number);
            int count=0;

            while(number>0){
                number/=10;
                count++;
            }
            return count;


  }



    public static void main(String[] args) {
        int digit=count(-100);
        System.out.println(digit);
    }
}