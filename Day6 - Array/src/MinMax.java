import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min,max;
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s [i] = input.nextInt();
        }
        max=min =s[0];
        for (int i = 0; i < n; i++) {
            System.out.print(s[i]+" ");
        }
        for (int i = 0; i < n; i++) {
            if (max < s[i]) {
                max = s[i];
            }
            if(min > s[i]) {
                min = s[i];
            }
        }
        System.out.println();
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}