package BankAccountAndHolders;

public class Customer {

    String name;
    double balance;


    public Customer(String name)
    {
        this.name = name;
        this.balance = 0;
    }


    public void depositMoney(double amount)
    {
        balance = balance + amount;
    }

    public void withdrawMoney(double amount)
    {
        if(amount<=balance)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance()
    {
        System.out.println("Customer name : "+name);
        System.out.println("Balance : "+balance);
    }

}
