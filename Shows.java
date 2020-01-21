import java.io.*;
import java.util.*;

public class Shows extends User {
    public Shows(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue?[Y/N]");

        while (sc.hasNext() && (sc.nextLine().equalsIgnoreCase("y"))) {// change here

            System.out.println("Enter full name");
            name = sc.nextLine();

            System.out.println("Enter Age");

            age = 0;

            try {
                age = Integer.parseInt(sc.nextLine());// read int as string using nextLine() and parse
            }

            System.out.println("Continue?[Y/N]");
        }
    }

    public static void main(String[] args) throws IOException {
        // declaring ArrayList with initial size n
        ArrayList<String> show = new ArrayList<String>();
        ArrayList<String> time = new ArrayList<String>();
        show.add("A");
        show.add("B");
        show.add("C");
        show.add("D");
        show.add("E");
        show.add("F");
        show.add("G");

        time.add("12:40 PM");
        time.add("02:15 PM");
        time.add("04:30 PM");
        time.add("01:50 PM");
        time.add("09:00 PM");
        time.add("11:20 AM");
        time.add("05:30 PM");
        // Printing elements one by one
        for (int i = 0; i < show.size(); i++)
            System.out.println("The shows are: " + show.get(i) + " ");

        if (show.isEmpty())
            System.out.println("No shows available.");

        for (int i = 0; i < time.size(); i++)
            System.out.println("The times, for each movie, are: " + time.get(i) + " ");

        if (time.isEmpty())
            System.out.println("No shows available at that time.");

    }
}
