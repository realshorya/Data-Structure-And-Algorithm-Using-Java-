//Java method to compute the average of three numbers.
import java.util.*;

public class Q11{
    public static void avgOfThree(int a,int b,int c){
        float total = a+b+c;
        float avg = total/3;
        System.out.println("Average of 3 Numbers Are:"+avg);
    }
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number A:");
        int a = sc.nextInt();
        System.out.print("Enter Number B:");
        int b = sc.nextInt();
        System.out.print("Enter Number C:");
        int c = sc.nextInt();
        avgOfThree(a,b,c);
    }
}