package com.jygode;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient balance to complete this withdrawal.");
        } else {
            this.balance -= amount;
            System.out.println("You have withdrawn: $" + amount);
        }
    }

    public void getBalance() {
        System.out.println("Your current balance is: $" + this.balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Bank !");
        System.out.println("🎉 You have received $100 for opening your account. 🎉");

        BankAccount account = new BankAccount(100);

        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit\n");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.getBalance();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using Bank !");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}
//👨🏾‍💻❤️
