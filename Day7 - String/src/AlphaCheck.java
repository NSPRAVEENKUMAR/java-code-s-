import java.lang.String;
public class AlphaCheck {
    public static void main(String[] args) {
        String s="Hello23world";
        boolean b=s.matches("[a-z, ,A-Z]+");
//        if(s.matches(".*[a-z A-Z].*"))
//        {
//            System.out.println("True");}
//        else{
//            System.out.println("False");}
       System.out.println(b);
    }
}
