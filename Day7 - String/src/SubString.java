public class SubString {
    public static void main(String[] args) {
        String str1=new String("Hello");
        String str2=new String("Hello");
        // using substring method
        System.out.println(str1.substring(2,4));
        // using index of particalur char in a string
        System.out.println(str2.indexOf('o'));
        // using last index of particalur char in a string
        System.out.println(str2.lastIndexOf('l'));

    }
}
