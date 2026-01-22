package BankAccountAndHolders;

import java.util.ArrayList;

public class Bank {

    String name;
    ArrayList<Customer>customers = new ArrayList<>();

    public Bank(String name)
    {
        this.name = name;
    }

    public void openAccount(Customer customer)
    {
        customers.add(customer);
    }

    public void displayBalance()
    {
        for(Customer c : customers){
            c.displayBalance();
        }
    }









}
