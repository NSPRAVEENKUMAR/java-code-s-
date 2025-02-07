import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        int a=0;
        int j =0;
        for(int i=0;n>0;i++){
            a = a * 10 + n % 10;
            n = n / 10;
        }
        while (n != 0) {
            a = a * 10 + n % 10;
            n = n / 10;
            //j++;
        }
        System.out.println(a+" ");
        System.out.println(j);
    }
}
