import java.util.Scanner;

class BankAccount {
    private double Balance;
    static BankAccount bank = new BankAccount();

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public static void withdrawAmount(double amount) {

        if (amount > bank.Balance)
            System.out.println("\nUNSUFFIECIENT BALANCE !");
        double newBalance = 0;
        newBalance = bank.Balance - amount;
        System.out.println(" AMOUNT WITHDRAWN : " + amount);
         System.out.println(" NEW BALANCE IS : " + newBalance);
        bank.Balance = newBalance;
        menu();
    }

    public static void depositAmount(double amount) {
        double newBalance = bank.Balance + amount;
        System.out.println(" AMOUNT DEPOSITED : " + amount);
         System.out.println(" NEW BALANCE : " + newBalance);
        bank.Balance = newBalance;
        menu();
    }

    public static void checkBlanace() {
        System.out.println(" AVAILABLE BALANCE : " + bank.Balance);
        menu();
    }

    public static void exits() {
        return;
    }

    public static void menu() {
        System.out.println("\n1.WITHDRAW AMOUNT ");
        System.out.println("2.DEPOSIT  AMOUNT ");
        System.out.println("3.CHECK  AMOUNT ");
        System.out.println("4.EXIT ");
        System.out.println("\n CHOOSE YOUR OPERATION ");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nENTER THE AMOUNT : ");
                Double amt = s.nextDouble();
                withdrawAmount(amt);
                break;
            case 2:
                System.out.println("\nENTER THE AMOUNT : ");
                Double amt1 = s.nextDouble();
                depositAmount(amt1);
                break;
            case 3:
                checkBlanace();
                break;
            case 4:
                exits();
                break;
            default:
                System.out.println("\nINVALID INPUT : ");
                break;
        }
        s.close();
    }
}

public class AtmInterface extends BankAccount {

    public static void main(String[] args) {

        System.out.println("\n\n\t..... WELCOME TO ATM .....");
        menu();

    }

}
