package SOLIDCode.SRP.MoneyTransfer.AfterRefactor;

public class ValidationService {

    public  boolean validAccountCheck(int accountNumber, String accountName) {
       return accountNumber<100 && accountName!=null && !accountName.isEmpty();
    }

}
