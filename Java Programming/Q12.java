//A method named isEven that accepts an int argument. That should return true if the argument is even, or false
import java.util.*;

public class Q12{
    public static boolean isEven(int num){
        return num%2==0;
    }
    
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num =sc.nextInt();
        boolean truth=isEven(num);
        System.out.println(truth);
    }
}