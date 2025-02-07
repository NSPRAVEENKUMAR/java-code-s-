import java.util.Arrays;

public class SameArrays {
    public static void main(String[] args) {
        int[] a={1,3,5,2,3,5};
        int[] b={3,5,2,3,1,5};

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
