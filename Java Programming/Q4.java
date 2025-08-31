//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class Q4 {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if(num<=0) {
            System.out.println(num+" is Negative");
        }else {
            System.out.println(num+" is Positive");
        }
    }
}