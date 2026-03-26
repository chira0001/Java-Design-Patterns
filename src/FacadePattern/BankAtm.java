package FacadePattern;

import java.util.Scanner;

// Facade class

public class BankAtm {

    Account account = new Account();
    Bank bank = new Bank();
    Scanner scanner = new Scanner(System.in);

    public void promptUI(){
        System.out.println("Enter pin");
        String pin = scanner.nextLine();
        login(pin);
    }

    public String login(String pin){
        if (account.getPin().equalsIgnoreCase(pin)){
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice == 1){
                System.out.print("Withdraw Amount : ");
                double withdrawAmount = Double.parseDouble(scanner.nextLine());
                bank.withdrawMoney(withdrawAmount);
            } else if (choice == 2) {
                System.out.println("Money deposited");
            }
        }
        return "Login Failed";
    }
}
