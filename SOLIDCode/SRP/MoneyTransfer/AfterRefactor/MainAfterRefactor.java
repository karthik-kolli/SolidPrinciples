package SOLIDCode.SRP.MoneyTransfer.AfterRefactor;

public class MainAfterRefactor {

    public static void main(String[] args)
    {
     
     ValidationService validation=new ValidationService();
     AccountService account=new AccountService(10, "Karthik", validation);
     int balance=account.getBalance();
     System.out.println("Balance in account "+ account.getAccountnumber()+ " is" + balance);
     AccountService account_2=new AccountService(65, "Raj", validation);
      System.out.println("Balance in account "+ account_2.getAccountnumber()+ " is " + balance);
      account.transferAmount(account_2, 4000);
      NotificationService notify=new NotificationService("Amount received", account_2);
      notify.sendNotification();
    }
}
