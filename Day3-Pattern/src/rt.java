import java.util.*;
public class rt {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();

            for(int i=0;i<=n;i++){
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


