import java.lang.String;
public class Occurance {
    public static void main(String[] args) {
        String s="Venkateshaa";// occurance of a character in a string
        char ch='a';
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
