import java.util.Arrays;

public class FirstRepeating {
    public static void main(String[] args) {
        int i;
        int[] a={1,2,1,5,3,8,6};
        Arrays.sort(a);
        for (i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                //System.out.print(a[i]+" ");
            }
        }
        //System.out.println("0");
        for (i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
