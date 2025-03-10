package bank.cli;

import bank.data.DataBase;
import bank.user.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase.getINSTANCE();
        Scanner scanner = new Scanner(System.in);
        SignUp signUp = new SignUp();
        while (true) {
            System.out.println("Hello");
            System.out.println("Please select one of the options below with number");
            System.out.println("1-SignUp");
            System.out.println("2-LogIn");
            System.out.println("3-Close");
            String entry = scanner.next();
            if (entry.equals("1")) {
                User user = new User(null , 0 , null , 0 , new ArrayList<>());
                System.out.println("1-Pleasse enter your Id");
                System.out.println("2-back");
                String entry1 = scanner.next();
                while (true) {
                    if (entry1.equals("back") || entry1.equals("2")) {
                        break;
                    } else {
                        signUp.setUserName(user, entry1);
                        signUp.setUserAccountnum(user);
                        System.out.println("1-Plese enter your password");
                        System.out.println("2-back");
                        String entry2 = scanner.next();
                        while (true) {
                            if (entry2.equals("back") || entry2.equals("2")) {
                                break;
                            } else {
                                signUp.setUserPassword(user, entry2);
                                signUp.addToDataBase(DataBase.getINSTANCE().getUser(), user);
                            }
                            break;
                        }
                    }
                    System.out.println("your account is create");
                    break;
                }
//                this is for cheak the sign up
//                for (int i = 0 ; i < DataBase.getINSTANCE().getUser().size() ; i ++){
//                    System.out.println(DataBase.getINSTANCE().getUser().get(i).getAccountnum());
//                    System.out.println(DataBase.getINSTANCE().getUser().get(i).getPassword());
//                }
            } else if (entry.equals("2")) {

            } else if (entry.equals("3")) {
                break;
            } else {
                System.out.println("Please enter the correct word");
            }
        }
    }
}
