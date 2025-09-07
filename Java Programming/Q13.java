//Java program to check if a number is a palindrome in Java?
import java.util.*;

public class Q13{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        int rev = num;
        int sum = 0;
        while(rev>0){
            int rem=rev%10;
            sum = sum * 10 + rem;
            rev=rev/10;
        }
        System.out.println("Reverse of "+num+" is "+sum);
        if(num==sum){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}