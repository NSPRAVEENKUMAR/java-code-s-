import java.util.*;
import java.lang.Math;

public class adam {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        int n= input.nextInt();
        int temp=n;
        int a=0;
        int c=0;
        int sq=n*n;
        System.out.println(sq);
        while (sq != 0) {
            int num =sq%10;

            a = a * 10 + num;
            sq = sq / 10;
        }

        System.out.println(a);
        int b = (int) Math.sqrt(a);
        //144
        System.out.println(b);
        int sq1=0;
        while (b != 0) {
            c = c * 10 + b % 10;
            b = b / 10;
        }
        System.out.println(b+"hee");
        if(temp==c){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

