public class frequencyDigit{

public static int frequency(int number,int digit){

    int freq=0;
    while(number>0){
        if(number%10==digit) freq++;
        number/=10;

    }
    return freq;
}
    public static void main(String[] args) {
     System.out.println(frequency(1200, 0));
        
    }
}