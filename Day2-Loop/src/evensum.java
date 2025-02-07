import java.util.*;
public class evensum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
