/*Practical Questions:
8.	Create a simple BankAccount class with:
o	Fields: accountNumber, accountHolder, balance
o	Methods: deposit(amount), withdraw(amount), getBalance()
9.	Create two objects of BankAccount with different data.
 */
class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
     public BankAccount( int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("amount deposited");
        }
    }
    public void withdraw(double amount){
if(balance>0&&balance>=amount){
         balance -= amount;
}
else{
        System.out.println("balance is insufficient");
    }

    }
    
    public double getBalance() {
        return balance;
    }
    
}
public class Main2{
    public static void main(String[] args) {
        BankAccount user1=new BankAccount(123425,"Pragya Tiwari",245.50);
          BankAccount user2=new BankAccount(1234235,"Pragya Mishra",1500.64);
          
          user1.deposit(1600);
          user1.withdraw(150);
           
          user2.deposit(1600);
          user2.withdraw(150);
          


          System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());
        
    }
}