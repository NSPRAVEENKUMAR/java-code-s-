import java.util.Scanner;

public class Account {
    int acc_num;
    int bal;
    int a, p;
    Scanner input = new Scanner(System.in);

    Account(int acc_num, int bal) {
        this.acc_num = acc_num;
        this.bal = bal;
    }

    void deposit(){
        System.out.println("Enter amount to deposit:");
        int a =input.nextInt();
        bal=bal+a;
        System.out.println("Updated balance:"+bal);
    }
    void withdraw() {
        System.out.println("Enter amount to withdraw");
        int c = input.nextInt();
        bal = bal - c;
        System.out.println("Updated balance:" + bal);
    }
    void display() {
        System.out.println("Your account info:");
        System.out.println("Account number:" + acc_num);
        System.out.println("Total balance₹:" + bal);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter account number:");
        int a = input.nextInt();
        System.out.println("Enter amount:");
        int c = input.nextInt();
        Account a1 = new Account(a,c);
        a1.deposit();
        a1.withdraw();
        a1.display();
    }
}


