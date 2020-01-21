import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input extends User {
    public Input(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        Scanner sc = new Scanner(new File("Input.java"));
        while (sc.hasNextLong()) {
            sc.nextLong();

            // Getting double input
            System.out.print("Enter double: ");
            double age = input.nextDouble();
            System.out.println("Age entered = " + age);

            // Getting String input
            System.out.print("Enter name: ");
            String name = input.next();
            System.out.println("Name entered = " + name);

            List<User> users = new ArrayList<>();
            users.add(new User(name, 0));
            users.add(new User(name, 0));

            users.forEach(user -> {
                System.out.println("Name: " + user.getName() + " ,Age: " + user.getAge());
            });

            sc.close();
            input.close();
        }
    }
}