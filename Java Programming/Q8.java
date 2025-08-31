//program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;

public class Q8{
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting of Integer:");
        int start = sc.nextInt();
        System.out.print("Enter Ending of Integer:");
        int end = sc.nextInt();
        int even=0,odd=0;
        for(int i=start;i<end;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        System.out.println("Sum of odd number is:"+odd);
        System.out.println("Sum of Even Number is:"+even);
    }
}