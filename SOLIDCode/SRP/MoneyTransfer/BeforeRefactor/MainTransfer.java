package SOLIDCode.SRP.MoneyTransfer.BeforeRefactor;

public class MainTransfer {
    public static void main(String[] args)
    {
        MoneyTransferSystem account1=new MoneyTransferSystem(20,"karthik");
        MoneyTransferSystem account2=new MoneyTransferSystem(45, "Raj");
    
       account1.checkValidUser();
       account2.checkValidUser();
       account1.depositMoney(5000);
       account1.transferAmounttoAccount(45, 400);
       account1.SendSMS();
    
    
    }
}
