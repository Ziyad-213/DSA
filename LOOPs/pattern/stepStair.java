public class stepStair{
    public static void main(String[] args) {
        
int stars=2;

        for(int i=1;i<=6;i++){


            for(int j=1;j<=stars;j++){
                System.out.print("* ");

            }
            System.out.println();
            if(i%2==0) stars+=2;
        }
    }
}