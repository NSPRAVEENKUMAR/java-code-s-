import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= input.nextInt();
        Num a=new Num();
        String result=a.check(n);
        System.out.println(result);
    }
}
class Num
{
    String r;
    String check(int n)
    {
        if(n%2!=0)
        {
            r="Odd";
        }
        else
        {
         r="Even";
        }
        return r;
        }
}