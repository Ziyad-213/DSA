import java.util.Scanner;

public class inputOfArray{

    public static void displayEvenNumbers(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter length of array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];

System.out.print("Enter Elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();


        }
        displayEvenNumbers(arr);
      

    }
}