import java.util.Scanner;

public class DuplicateNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = input.nextInt();
        int i = 0;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }//sort
        int temp = 0;
        for (i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }

        }//after sort and removing duplicates
        for (i = 0; i < n; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        for (i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
