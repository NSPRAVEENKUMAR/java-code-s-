public class Boolean {
    public static void main(String[] args) {
        String str1=new String("Hello world");
        String str2=new String("HELLO WORLD");
        String str3=new String("Hello");
        //using equals method
        boolean a=str1.equals(str2);
        System.out.println(a);

        //using equalsIgnoreCase method
        System.out.println(str1.equalsIgnoreCase(str3));
        //using toUpperCase and toLowerCase methods
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
    }
}
