/*A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions*/.

public class Bank{
static int current balance =1000;
public static void greetCustomer(){
System.out.println("hello,welcome to the banking application");
}
public void deposit(int amount){
CurrentBalance = CurrentBalance + amount;
System.out.println("Amount is deposited successfully");

}
public void withdrawl(){
CurrentBalance = CurrentBalance + amount;
System.out.println("Amount is withdrawan successfully");
}
public int getCurrentBalance(){
 return CurrentBalance;
}
public static void main(String[] args){
Bank bank = new Bank();
greetCustomer();
Bank.deposit(500);
System.out.println("Current Balance is: "+ bank.getCurrentBalance());
withdrawal(300);
System.out.println("Current Balance is: "+ bank.getCurrentBalance());
 
}
}
