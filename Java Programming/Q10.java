//program to print the multiplication table of a number N , entered by the user
import java.util.*;

public class Q10{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number to Get Table:");
        int num = sc.nextInt();
        System.out.println("Table of "+num+" is");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}