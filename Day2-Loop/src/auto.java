import java.util.*;
public class auto {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        int n= input.nextInt();
        int r,num;

        if (n<10){
            num=n*n;
            r=num%10;
            if (n==r)
            {
                System.out.println("Automorphic");
            }
            else
            {
                System.out.println("Not automorphic");
            }
        }
        else if (n>=10 && n<=99) {
            num=n*n;
            r=num%100;
            if (n==r)
            {
                System.out.println("Automorphic");
            }
            else
            {
                System.out.println("Not automorphic");
            }
        }
        else if (n>=10 && n<=99) {
            num=n*n;
            r=num%1000;
            if (n==r)
            {
                System.out.println("Automorphic");
            }
            else
            {
                System.out.println("Not automorphic");
            }
        }
        else
        {
            System.out.println("Not automorphic");
        }

        }
}
