import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter password:");
        String s=input.nextLine();
        String passkey="password123";
        s=s.trim();
        if(s.equals(passkey)){
            System.out.println("You are logged in!");
        }
        else if(passkey.equalsIgnoreCase(s)){
            System.out.println("You are logged in!");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
