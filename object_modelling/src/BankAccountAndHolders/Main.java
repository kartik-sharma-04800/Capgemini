package BankAccountAndHolders;

public class Main {

    public static void main(String[] args) {

        Bank hdfc = new Bank("HDFC");


        Customer kartik = new Customer("Kartik");

        hdfc.openAccount(kartik);

        kartik.depositMoney(2000);
        kartik.withdrawMoney(1000);
        hdfc.displayBalance();

    }

}
