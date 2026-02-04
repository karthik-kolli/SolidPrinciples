package SOLIDCode.SRP.MoneyTransfer.AfterRefactor;

public class NotificationService {
    private AccountService account;
    private String notifyMessage;

    NotificationService(String message,AccountService account)
    {
        this.account=account;   
         this.notifyMessage=message;
    }

    public void sendNotification()
    {
        
        System.out.println(notifyMessage+ " to account "+ account.getaccountName() +" with acccount number "+ account.getAccountnumber() + " ,now available balance is "+account.getBalance()+ " after transaction");
    }
   
}
