//program to find the factorial of any number entered by the user.
import java.util.*;

public class Q9{
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);
    }
}