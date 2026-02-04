package SOLIDCode.SRP.MoneyTransfer.AfterRefactor;

public class AccountService {
    private int accountNumber;
    private String accountName;
    private int totalBalance;
    private ValidationService validateAccount;
   

    AccountService(int accountNumber,String accountName,ValidationService validateAccount )
    {
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.validateAccount=validateAccount;
        this.totalBalance=20000;
    }

    public int getBalance()
    {
        if(this.validateAccount.validAccountCheck(this.accountNumber,this.accountName))
        {
      return totalBalance;
        }
        else
        {
        throw new AccountException(accountNumber+" should be less than 100");
        }
    }

    public String getaccountName()
    {
        return accountName;
    }

    public int getAccountnumber()
    {
        return accountNumber;
    }

    public void depositMoney(int amount)
    {
        if(this.validateAccount.validAccountCheck(this.accountNumber,this.accountName))
        {
            totalBalance += amount;
            return;
        }
        return;
    }

    public void withdrawMoney(int amount)
    {
     if(this.validateAccount.validAccountCheck(this.accountNumber,this.accountName))
     {
        if(amount<totalBalance)
        {
            totalBalance-=amount;
        }
        return;
     }
     return;
    }

    public void transferAmount(AccountService accountTOtransfer,int amount)
    {
        if(this.validateAccount.validAccountCheck(this.accountNumber,this.accountName))
     {
        if(amount<totalBalance)
        {
            System.out.println("Amount transfer from "+this.accountName);
            accountTOtransfer.depositMoney(amount);
            this.totalBalance-=amount;
            
        }
        return;
     }
    }
}
