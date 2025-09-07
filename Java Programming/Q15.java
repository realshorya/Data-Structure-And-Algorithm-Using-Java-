import java.util.*;

public class Q15{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num = s.nextInt();
        System.out.print("Enter Second Number:");
        int num2 = s.nextInt();
        System.out.println("The Minimum of "+num+" and "+num2+" is :"+Math.min(num,num2));
        System.out.println("The Maximum of "+num+" and "+num2+" is :"+Math.max(num,num2));
        System.out.println("Square root of "+num+" and "+num2+" is "+Math.sqrt(num)+" and "+Math.sqrt(num2));
        System.out.println("Power of 3 of "+num+" and "+num2+" is "+Math.pow(num,3)+" and "+Math.pow(num2,3));
        System.out.println("Negative Number Will be Converted to Positive "+Math.abs(num));
    }
}