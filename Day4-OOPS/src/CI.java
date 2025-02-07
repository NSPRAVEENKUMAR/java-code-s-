import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Compound c=new Compound();
        double r=c.display();
        double amount=c.demo();
        System.out.println(r);
        System.out.println(amount+r);
    }
}
class Compound
{
    double p,n,r;
    double ci;
    Compound()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter principle amount:");
        p= input.nextDouble();
        System.out.println("enter no.of year:");
        n=input.nextDouble();
        System.out.println("enter interest:");
        r=input.nextDouble();
    }
    double display(){
        double a=(1+(r/100));
        ci=p*Math.pow(a,n);
        return ci;
    }
    double demo()
    {
        return p;
    }
}