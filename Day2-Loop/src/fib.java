import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();
        int a=0, b=1;
        int fib=0;
        System.out.print("Fibonacci Series: ");
        System.out.println(a+" ");
        System.out.println(b+" ");
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            System.out.print(fib+ " ");
            a = b;
            b = fib;
        }
    }
}
