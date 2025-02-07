import java.util.*;
public class strong_num {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number:");
        int n= in.nextInt();
        int a,b,c;
        a=n%10;
        int temp= n/10;
        c=n%10;
        b=temp%10;
        a=n/100;
        int fact1 = 1;
        for(int i=1;i<=a;i++){
            fact1 = fact1 * i;
        }
        int fact2 = 1;
        for(int i=1;i<=b;i++){
            fact2 = fact2 * i;
        }
        int fact3 = 1;
        for(int i=1;i<=c;i++){
            fact3 = fact3 * i;
        }
        int sum= fact1+fact2+fact3;
        System.out.println(sum);
        if(sum==n){
            System.out.println(n+ " is strong number");}
        else{
            System.out.println("weak");}


    }
}
