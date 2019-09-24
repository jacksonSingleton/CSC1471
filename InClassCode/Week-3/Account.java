///////////////   Account   /////////////////////
// Account.java
// Account class with a constructor to validate and 
// initialize instance variable balance of type double.

public class Account
{   
       // instance variable stores balance
private double balance; 

   // constructor  
   public Account( double initialBalance )
   {
           // validate that initialBalance is greater than 0.0; 
           // if not, balance is initialized to default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
   }// end Account constructor

   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance = balance + amount; // add amount to balance 
   } // end method credit

   // return the account balance
   public void debit ( double amount )
   {
       if (balance > amount && amount >= 0){
        balance -= amount; //debit the amount from the balance
       }
       else{
           System.out.println("You do not have enough funds available for this transaction.");
       }
   }
   public double getBalance()
   {
      return balance; // value balance to calling method
   } // end method getBalance

} // end class Account

