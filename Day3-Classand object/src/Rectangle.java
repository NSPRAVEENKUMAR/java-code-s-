import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Rectangle {




    int area(int l, int b) {
        int a = l * b;
        return a;
    }

    int perimeter(int l, int b) {
        int p = 2 * (l + b);
        return p;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int l = input.nextInt();
        int b = input.nextInt();
        Rectangle r = new Rectangle();
        int a= r.area(l,b);
        int p= r.perimeter(l,b);
        System.out.println("Area =" + a);
        System.out.println("Perimeter =" + p);
    }
}
