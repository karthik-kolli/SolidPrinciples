package SOLIDCode.SRP.MoneyTransfer.BeforeRefactor;


/**
 This class is used to transfer the money from one account to other account
*/

public class MoneyTransferSystem
{
 int accountNumber;
 String accountName;
 String transfertoAccountname;
 int depositMoney;
 int withDrawMoney;
 int TransferMoney;
 String statements;
  int totalBalance;

  MoneyTransferSystem(int AccountNumber, String AccountName)
   {
    this.accountNumber=AccountNumber;
    this.accountName=AccountName;
    this.totalBalance=200000;
   }

   public int  getBalance()
{
 System.out.println("Getting Balance for "+ accountName);
  return totalBalance;
}
  
 public void SendSMS()
 {
    System.out.println("Available balance is "+ getBalance());
 }

  public void checkValidUser()
  {
    boolean userCheck= validAccountCheck(this.accountNumber, this.accountName);
    if(userCheck)
    {
        System.out.println("Valid user");
    }
    else
    {
        System.out.println("Invalid Account");
    }
  }
  
  public boolean validAccountCheck(int accountNumber, String accountName)
  {
    boolean validAccount=true;
      if(accountNumber>100 || accountName==null || accountName.isEmpty() )
      {
        validAccount=false;
      }
      return validAccount;
  }

  public void generateStatements()
  {
    System.out.println("Account statement for the current month");
  }

  public void depositMoney(int amount)
  {
    boolean depositMoney=validAccountCheck(this.accountNumber, this.accountName);
    if(depositMoney)
    {
    totalBalance=totalBalance+amount;
    System.out.println("Depositing the money in the account "+  this.accountNumber +" New Balance is " + totalBalance);
    }
    else{
        System.out.println("Invalid Account number");
    }
  }

  public void withdrawMoney(int amount)
  {
    boolean withDrawmoney=validAccountCheck(this.accountNumber, this.accountName);
    if(withDrawmoney)
    {
        return;
    }
    if( amount>totalBalance)
    {
       System.out.println("Insufficient funds");
       return;
    }
    else{
    totalBalance=totalBalance-amount;
    System.out.println(amount+ "is withdrawn and balance is "+ totalBalance);
    }
  }

  public void transferAmounttoAccount(int targetAccountNumber,int transferAmount)
  {
      boolean withDrawmoney=validAccountCheck(this.accountNumber, this.accountName);
    if(withDrawmoney)
    
      {
        return;
    }
    System.out.println("The money is being transfered from "+this.accountNumber+ "to "+ targetAccountNumber);
     if(transferAmount>totalBalance)
    {
       System.out.println("Insufficient funds");
       return;
    }
    else{
    totalBalance=totalBalance-transferAmount;
    System.out.println(transferAmount+ "is transferred and balance is "+ totalBalance);
    }
  }
}