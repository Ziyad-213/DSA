public class fibonacci{

public static void fibo(int terms){
    if(terms<=0) return;
    int first=0;
    int second=1;
     int result;
    for(int i=1;i<=terms;i++){
        System.out.print(first+" ");
         result=first+second;
        first=second;
        second=result;

    }
}
public static void main(String[] args) {
    fibo(10);
}

}