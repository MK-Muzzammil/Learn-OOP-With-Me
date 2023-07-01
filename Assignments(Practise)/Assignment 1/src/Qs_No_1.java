import java.util.Calendar;
class Account{
    private double balance;
    private int yearofOpening;
    private String cnic;
    Account(){
    }
    Account(double Balance ){
        balance=Balance;
    }
 
    Account(double  Balance,int YearofOpening,String CNIC){
        balance=Balance;
        yearofOpening=YearofOpening;
        cnic=CNIC;
    }

    public void setVal(double Balance,int YearofOpening,String CNIC){
        balance=Balance;
        yearofOpening=YearofOpening;
        cnic=CNIC;
    }
    public void display(){
        System.out.println("The balance of this acc is  "+balance);
        System.out.println("The year of opening of this acc is "+yearofOpening);
        System.out.println("The CNIC of this man is "+cnic);
    }
    public void withdraw(int withdrawAmmount){
        if(balance>withdrawAmmount){
            balance=balance - withdrawAmmount;
            System.out.printf("The balance remaining is  %.2f%n ",balance);
        }
        else{
            System.out.println("Sorry Withdrawl not possible ");
        }
    }

    public void deposit(int depositAmount){
        if(depositAmount<0){
            System.out.println("Invalid amount entered");
        }
        else{
            balance=balance+depositAmount;
            System.out.printf("The Balance in this acc After deposit is %.2f%n ",balance);
        }
    }

    public void calculateAgeofAccount(){
        int currentYear=Calendar.getInstance().get(Calendar.YEAR);
        int age =currentYear - yearofOpening;
        System.out.println("The age of this account is "+age+"  years");
    }
}

public class Qs_No_1 {
    public static void main(String[] args) {
        Account a2=new Account(1200);
        a2.calculateAgeofAccount();
//        Account a1=new Account(20000,2000,"3310298996707");
//        a1.deposit(800);
//        a1.withdraw(1000);
        a2.display();
//        a1.calculateAgeofAccount();

    }
}
