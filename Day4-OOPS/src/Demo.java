import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= input.nextInt();
        int r= -(n+1);
        System.out.println(~n);
        System.out.println(r);
        // using negation "~"
    }
}
