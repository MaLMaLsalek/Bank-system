package bank.cli;

import bank.data.DataBase;
import bank.bankuser.client.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase.getINSTANCE();
        Scanner scanner = new Scanner(System.in);
        SignUp signUp = new SignUp();
        LogIn logIn = new LogIn();
        while (true) {
            System.out.println("Hello");
            System.out.println("Please select one of the options below with number");
            System.out.println("1-SignUp");
            System.out.println("2-LogIn");
            System.out.println("3-Close");
            String entry = scanner.next();
            if (entry.equals("1")) {
                User user = new User(null, 0, null, 0, new ArrayList<>());
                System.out.println("1-Pleasse enter your Id");
                System.out.println("2-back");
                String entry1 = scanner.next();
                while (true) {
                    if (entry1.equals("back") || entry1.equals("2")) {
                        break;
                    } else if (logIn.isUserExist(entry1)) {
                        System.out.println("please enter another id");
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
                                DataBase.getINSTANCE().addUser(user);
                                System.out.println("your account is create");
                            }
                            break;
                        }
                    }
                    break;
                }
//                this is for cheak the sign up
//                for (int i = 0; i < DataBase.getINSTANCE().getUser().size(); i++) {
//                    System.out.println(DataBase.getINSTANCE().getUser().get(i).getAccountnum());
//                    System.out.println(DataBase.getINSTANCE().getUser().get(i).getPassword());
//                    System.out.println(DataBase.getINSTANCE().getUser().get(i).getBalance());
//                    System.out.println(DataBase.getINSTANCE().getUser().get(i).getHistory());
//                }
            } else if (entry.equals("2")) {
                System.out.println("1-Pleasse enter your Id");
                System.out.println("2-back");
                String entry3 = scanner.next();
                while (true) {
                    if (entry3.equals("back") || entry3.equals("2")) {
                        break;
                    } else if (logIn.isUserExist(entry3)) {
                        System.out.println("1-Plese enter your password");
                        System.out.println("2-back");
                        String entry4 = scanner.next();
                        while (true) {
                            if (entry4.equals("back") || entry4.equals("2")) {
                                break;
                            } else if (logIn.isUserPassTrue(entry4)) {
                                System.out.println("Welcome : " + entry3);
                                System.out.println("Balance = " + DataBase.getINSTANCE().getUser().
                                        get(DataBase.getINSTANCE().findAccountIndexWithId(entry3)).getBalance());
                                System.out.println("Please select one of the options below with number");
                                System.out.println("1-Deposit");
                                System.out.println("2-Withdrawal");
                                System.out.println("3-Transmission");
                                System.out.println("4-History");
                                System.out.println("5-back");
                                String entry5 = scanner.next();
                                while (true){
                                    if (entry5.equals("back") || entry5.equals("5")) {
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("wrong password");
                                break;
                            }
                            break;
                        }
                        break;
                    } else {
                        System.out.println("this id not found");
                        break;
                    }
                }
            } else if (entry.equals("3")) {
                break;
            } else {
                System.out.println("Please enter the correct word");
            }
        }
    }
}
