package SOLIDCode.SRP.MoneyTransfer.AfterRefactor;

public class AccountException  extends RuntimeException{
   
    AccountException(String message)
    {
        super(message);
    }
    
}
