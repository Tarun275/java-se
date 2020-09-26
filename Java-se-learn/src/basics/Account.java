/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author Tarun
 */
public class Account {

    private String name;
    private double balance;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
    }
    
    public Account(String name, double balance) {
        this.name = name;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            System.out.println("Adding amount: " + depositAmount);
            balance = balance + depositAmount;
        }
    }

}
