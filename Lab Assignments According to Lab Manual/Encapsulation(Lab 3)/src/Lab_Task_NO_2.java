class Account{
    private double balance;

    Account(){
        balance=1000;
    }
    Account(double Balance){
        balance=Balance;
    }
    private double getBalance(){
        return balance;
    }
    public void depositBal(double bal){
        balance=balance+bal;
    }
    public double getVal(){
        double bal=getBalance();
        return bal;
    }
    public void Display(){
        System.out.println("The balance in the account is  "+balance);
    }
    public double withdrawBal(double bal){
        if(bal>balance){
            System.out.println("Transection cant carry out  ");
        }
        else {
            balance=balance-bal;
            return balance;
        }
        return balance;
    }

}

public class Lab_Task_NO_2 {
    public static void main(String[] args) {
    Account a1=new Account();
    a1.depositBal(300);
    double balance=a1.getVal();
    a1.Display();
    System.out.println("The remaining balance is "+a1.withdrawBal(100));

    Account a2=new Account(balance);
    a2.depositBal(300);
    a2.Display();
    System.out.println("The remaining balance is "+a2.withdrawBal(100));





    }

}
