package bank.cli;

import bank.bankuser.client.transaction.Deposit;
import bank.bankuser.client.transaction.Transmission;
import bank.bankuser.client.transaction.Withdrawal;
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
        Deposit deposit = new Deposit();
        Withdrawal withdrawal = new Withdrawal();
        Transmission transmission = new Transmission();
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
                                if (entry5.equals("back") || entry5.equals("5")) {
                                    break;
                                }
                                while (true) {
                                    if (entry5.equals("1")) {
                                        System.out.println("Please enter the price or back");
                                        System.out.println("back");
                                        String entry6 = scanner.next();
                                        if (entry6.equals("back")) {
                                            break;
                                        }
                                        while (true) {
                                            if (deposit.isMonyNumber(entry6)) {
                                                deposit.depositMoney(entry3, Double.parseDouble(entry6));
                                                deposit.addToHistory(entry3, Double.parseDouble(entry6));
                                                System.out.println("The operation was successful.");
                                                break;
                                            } else {
                                                System.out.println("please enter the number");
                                                break;
                                            }
                                        }
                                    } else if (entry5.equals("2")) {
                                        System.out.println("Please enter the price or back");
                                        System.out.println("back");
                                        String entry7 = scanner.next();
                                        if (entry7.equals("back")) {
                                            break;
                                        }
                                        while (true) {
                                            if (deposit.isMonyNumber(entry7)) {
                                                withdrawal.withdrawalMoney(entry3, Double.parseDouble(entry7));
                                                withdrawal.addWithdrawalToHistory(entry3, Double.parseDouble(entry7));
                                                break;
                                            } else {
                                                System.out.println("please enter the number");
                                                break;
                                            }
                                        }
                                    } else if (entry5.equals("3")) {
                                        System.out.println("Please enter the account number or back");
                                        System.out.println("back");
                                        String entry8 = scanner.next();
                                        if (entry8.equals("back")) {
                                            break;
                                        }
                                        while (true) {
                                            if (deposit.isMonyNumber(entry8)) {
                                                if (DataBase.getINSTANCE().isAccountNumExist(Long.parseLong(entry8))) {
                                                    System.out.println("Please enter the price or back");
                                                    System.out.println("back");
                                                    String entry9 = scanner.next();
                                                    if (entry9.equals("back")) {
                                                        break;
                                                    }
                                                    while (true) {
                                                        if (deposit.isMonyNumber(entry9)) {
                                                            transmission.transmissionMony(entry3,
                                                                    Double.parseDouble(entry9), Long.parseLong(entry8));
                                                            transmission.addTransmissionToHistory(entry3,
                                                                    Double.parseDouble(entry9), Long.parseLong(entry8));
                                                            break;
                                                        } else {
                                                            System.out.println("please enter the number");
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("This account number not found");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("please enter the number");
                                                break;
                                            }
                                        }
                                    } else if (entry5.equals("4")) {
                                        DataBase.getINSTANCE().getUser().get(DataBase.getINSTANCE().
                                                findAccountIndexWithId(entry3)).showArraylistIndex();
                                        System.out.println("back");
                                        while (true) {
                                            String entry10 = scanner.next();
                                            if (entry10.equals("back")) {
                                                break;
                                            } else {
                                                System.out.println("Please enter back");
                                            }
                                        }
                                    } else {
                                        System.out.println("Please enter the correct word");
                                        break;
                                    }
                                    break;
                                }
                            } else {
                                System.out.println("wrong password");
                                break;
                            }
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