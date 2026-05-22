public class stringpalindrome{
public static void main(String[] args) {
    
    String s="heh";

    int i=0;
    int j=s.length()-1;
   System.out.println(s.length());

    while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            System.out.println("Not palindrome");
            return;
        }
        else{
            i++;
            j--;
        }
        
    }    
     System.out.println("palindrome");

}
}