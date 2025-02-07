import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        //int n=input.nextInt();

//        int[] a =new int[n];
//        for(int i=0;i<n;i++) {
//            a[i] = input.nextInt();
//        }
        int n = 5;
        int[] a = {1, 2, 3, 3, 2};

        int size = n; // Maintain current size of the array
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    // Shift elements to the left to remove duplicate
                    for (int k = j; k < size - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    size--; // Reduce the size of the array
                    j--; // Recheck the current index after shifting
                }
            }
        }

        //System.out.println("="+temp);
        for(int i=0;i<size;i++) {
            System.out.println(a[i]);
        }
    }
}

