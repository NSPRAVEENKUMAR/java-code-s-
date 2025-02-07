import java.util.*;
import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();
        int sq = n * n;

        boolean isAutomorphic = true;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != sq % 10) {
                isAutomorphic = false;
                break;
            }
            temp = temp / 10;
            sq = sq / 10;
        }

        if (isAutomorphic) {
            System.out.println(n + " is an Automorphic number.");
        } else {
            System.out.println(n + " is not an Automorphic number.");
        }
    }
}

