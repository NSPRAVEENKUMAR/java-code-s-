import java.util.Scanner;

public class Person {
    private final int age;
    private final String name;

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int age = input.nextInt();
        String name = input.next();
        Person p=new Person(age,name);
        p.display();

    }
    Person(int age,String name)
    {
       this.age=age;
       this.name=name;

    }
    void display()
    {
        System.out.println("Age ="+age);
        System.out.println("Name ="+name);
    }

}
