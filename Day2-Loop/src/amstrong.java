import java.util.*;
public class amstrong {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter number:");
        int n= input.nextInt();
        //int n =153;

        int r,sum=0;
        int temp=n;
        int cube;
        while(n>0){
            r = n % 10;
            cube=r*r*r;
            sum=sum+cube;
            n=n/10;}
        System.out.println(sum);
        if(sum==temp){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}
