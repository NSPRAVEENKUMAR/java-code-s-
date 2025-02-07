import java.util.Scanner;

public class hollowt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (i == n || j == 1 || j == (2 * i) - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
