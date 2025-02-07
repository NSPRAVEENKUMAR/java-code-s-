import java.util.Scanner;

public class floyid {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        //int n=input.nextInt();
        int n=5;
        int val=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(val+" ");
                val++;

            }
            System.out.println();
        }
    }
}
