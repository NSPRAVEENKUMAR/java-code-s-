import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();
        int i;
        for(i=1;i<16;i++){
            System.out.println(i+ " X " +n+ " = " +i*n);
        }
    }
}
