import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        Cal c=new Cal(n);
        int rev=c.display();
        System.out.println(rev);
    }
}
class Cal
{
    int a;
    Cal(int n) {
        while (n != 0) {
            a = a * 10 + n % 10;
            n = n / 10;
        }
    }

    int display()
    {
        return a;
    }
}

