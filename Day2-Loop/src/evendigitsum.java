import java.util.*;
public class evendigitsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();

        int rem=0;
        int s=0;
        while(n>0){
            rem=n%10;
            if(rem%2==0){
                s=s=rem;
            }
            n/=10;
        }
        System.out.println(s);
    }
}
