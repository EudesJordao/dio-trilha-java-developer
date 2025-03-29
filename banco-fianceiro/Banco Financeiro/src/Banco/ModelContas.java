package Banco;

import Cliente.Cliente;

public abstract class ModelContas {
    protected int number;
    protected double balance;
    protected Cliente customer;
    private final int AGENCY_DEFAULT = 1;
    private static int countNumber = 1;


    protected ModelContas(Cliente customer){
        this.customer = customer;
        this.number += countNumber++;
    }

    private boolean verifyBalance(double value){
        if(value > balance){
            throw new RuntimeException("The value is bigger of the your balance!");
        } else {
            return true;
        }
    }

    public void withdraw(double value){
        if (verifyBalance(value)){
            balance -= value;
            printExtract();
        }
    }

    public void deposit(double value){
        balance += value;
        printExtract();
    }

    public void transfer(double value, ModelContas account){
        if (verifyBalance(value)){
            withdraw(value);
            account.deposit(value);
            printExtract();
        }

    }

    public void printExtract(){
        System.out.println("Customer: " + getCustomer());
        System.out.println("Agency: " + getAGENCY_DEFAULT());
        System.out.println("Number: " + getNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("--------------");
    }

    protected int getNumber() {
        return number;
    }

    protected double getBalance() {
        return balance;
    }

    protected Cliente getCustomer() {
        return customer;
    }

    protected int getAGENCY_DEFAULT() {
        return AGENCY_DEFAULT;
    }
}
