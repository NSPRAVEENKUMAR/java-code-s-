import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        int temp= n;
        int rem=0;
        int a=0;
        while(n>0){
            a = a * 10 + n % 10;
            n = n / 10;
        }
        if(a==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
