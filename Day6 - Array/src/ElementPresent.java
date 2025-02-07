import java.util.*;
public class ElementPresent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();

        }
        System.out.println("Enter  number to check:");
        int b=input.nextInt();
        int c=0;
        for(int i=0;i<n;i++) {
            if (a[i] == b) {
                c= a[i];

            }
        }

     if(c==b)
     {
         System.out.println("True");
     }
     else
     {
         System.out.println("False");
     }

    }
}
