import java.util.*;

public class Move0ToEnd {
    public static void main(String[] args) {
        int n=5;
        int[] a={1,0,2,0,3};
        int temp=0;// points the non zero element
        //normal looping approach
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0){
                a[temp++]=a[i];//temp=0->a[0]=a[0]
                //then temp will be a[1]->a[1]=a[0]
            }
        }
        while(temp<n){//adding the zeros to the end
            a[temp++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }//using inbuilt methods
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
