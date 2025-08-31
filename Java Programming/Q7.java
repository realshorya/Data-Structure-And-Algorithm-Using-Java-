//program that takes a year from the user and print whether that year is a leap year or not
import java.util.*;

public class Q7{
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Its a leap year");
                }else{
                    System.out.println("Its not a Leap year");
                }
            }else{
                System.out.println("Its a leap year");
            }    
        }else{
            System.out.println("Its not a Leap year");
        }
    }
}