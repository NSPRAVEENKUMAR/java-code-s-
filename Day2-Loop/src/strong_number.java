import java.util.*;
public class strong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
        int temp= n;
        int r = 0;
        int s=0;
        while (n > 0) {
            int fact = 1;
            r = n % 10;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            s=s+fact;
            n = n / 10;
        }
        if (s == temp) {
            System.out.println(temp + " is strong number");
        } else {
            System.out.println("weak");
        }
    }
}
