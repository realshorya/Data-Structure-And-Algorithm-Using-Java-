//Java method to compute the sum of the digits in an integer
import java.util.*;

public class Q14{
    public static void SumofDigits(int num){
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d;
            num=num/10;
        }
        System.out.println("Sum of Digits is "+sum);
    }
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num = s.nextInt();
        SumofDigits(num);
    }
}