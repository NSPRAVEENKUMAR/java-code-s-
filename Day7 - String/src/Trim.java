public class Trim {
    public static void main(String[] args) {

        String str=new String("Hello world! Good Morning          ");
        //using start with and last with methods
        System.out.println(str.startsWith("Hello"));
        // using trim method to trim the whitespace in beginning and last of the string
        System.out.println(str.trim());
    }
}
