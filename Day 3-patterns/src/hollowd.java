import java.util.*;
public class hollowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(j==1||j==(2*i)-1||i==0){
                System.out.print("* ");}
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
