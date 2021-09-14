import java.util.Scanner;

public class App {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.printf("Hello, %s, nice to meet you!", name);

    }
}

