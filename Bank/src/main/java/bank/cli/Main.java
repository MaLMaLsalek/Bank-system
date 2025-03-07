package bank.cli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello");
            System.out.println("Please select one of the options below with number");
            System.out.println("1-SignUp");
            System.out.println("2-LogIn");
            System.out.println("3-Close");
            String entry = scanner.next();
            if (entry.equals("1")) {

            } else if (entry.equals("2")) {

            } else if (entry.equals("3")) {
                break;
            } else {
                System.out.println("Please enter the correct word");
            }
        }
    }
}
