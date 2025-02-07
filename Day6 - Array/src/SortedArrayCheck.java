import java.util.Arrays;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] a={3,5,2,3,1,5};
        //int[] b=Arrays.sort(a);
        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(a);
        //Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
