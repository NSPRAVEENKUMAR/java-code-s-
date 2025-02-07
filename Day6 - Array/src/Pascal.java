import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();

        for(int i=1;i<=n;i++){
            int val=1;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val=val*(i-j)/j;

            }
            System.out.println();
        }
    }
}
