public class nCr_and_nPr{

public static long factorial(int number){
    int fact=1;
    for(int i=2;i<=number;i++){
        fact*=i;
    }
    return fact;

}

public static long ncr(int n,int r){
 long ans=factorial(n)/(factorial(r)*factorial(n-r))  ;
 return ans;
}
public static long npr(int n,int r){
 long ans=factorial(n)/factorial(n-r)  ;
 return ans;
}


    public static void main(String[] args) {

      
      
        System.out.println(ncr(5,2));
         System.out.println(npr(6,3));
    }
}