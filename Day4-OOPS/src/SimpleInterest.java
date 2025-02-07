import java.util.*;
class Calc {
    double p,n,r;
    double si;
    Calc()
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
        si=(p*n*r)/100;
        return si;
    }
    double demo()
    {
        return p;
    }
}
public class SimpleInterest {
    public static void main(String[] args) {
        Calc c=new Calc();
        double r=c.display();
        double amount=c.demo();
        System.out.println(r);
        System.out.println(amount+r);
    }
    }

