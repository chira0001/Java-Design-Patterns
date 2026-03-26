package FacadePattern;

public class Bank {
    Account account = new Account();

    public void withdrawMoney(Double withdrawAmount){
        if (withdrawAmount<=account.getBalance()){
            System.out.println("Amount "+ withdrawAmount +" withdraw successfully");
        }else {
            System.out.println("Amount insufficient in the account");
        }
    }
}
