import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter text");
        String s=input.nextLine();
        System.out.println("Enter a word to search:");
        String search=input.next();
        s=s.trim();
        int count = 0;
        for (int i = 0; i <= s.length() - search.length(); i++) {
            if (s.substring(i, i + search.length()).equals(search)) {
                count++;
                i += search.length() - 1;             }
        }
        if (count > 0) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found!");
        }
        if (count > 0) {
            System.out.println(search + " has occured " + count + " times.");
            System.out.println("Enter a word to change:");
            String newword = input.next();
            System.out.println(s.replace(search, newword));
        }
    }
}
