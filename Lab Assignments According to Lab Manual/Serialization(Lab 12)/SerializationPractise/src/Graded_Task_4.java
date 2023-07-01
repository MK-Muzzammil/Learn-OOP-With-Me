import java.io.*;
import java.util.ArrayList;
import java.util.Date;
class Account implements Serializable {
    private String name;
    private int Age;
    private Date AccountDate;
    private int accountNumber;
    private long Amount;

    public Account(){
        this.AccountDate=new Date();

    }
    public Account(String name, int age,long Amount, int accountNumber) {
        this.name = name;
        this.Age = age;
        this.AccountDate = new Date();
        this.Amount=Amount;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Date getAccountDate() {
        return AccountDate;
    }

    public void setAccountDate(Date accountDate) {
        AccountDate = accountDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

public class Graded_Task_4 {
    public static  void WriteToFile(Account acc){

        File f=new File("AccountDetails1.ser");
        try{
            FileOutputStream fout=new FileOutputStream(f,true);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fout);

            objectOutputStream.writeObject(acc);
            System.out.println("====Objects Written Succesfully =====");
            fout.close();
            objectOutputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void readFromFile(String path){
        try{
            FileInputStream fin=new FileInputStream(path);
            ObjectInputStream oin=new ObjectInputStream(fin);
            while(true){
                try{
                    Account bin=(Account) oin.readObject();
                    System.out.println( bin.getName());
                    System.out.println( bin.getAge());
                    System.out.println( bin.getAmount());
                    System.out.println( bin.getAccountDate());
                    System.out.println( bin.getAccountNumber());

                    System.out.println("======================================================");

                }
                catch(EOFException e){
                    break;
                }
            }
            fin.close();
            oin.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void depositInAccount(int AccountNumber, int Amount) {
        ArrayList<Account> a1 = new ArrayList<>();
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("AccountDetails1.ser"));
            boolean b1 = true;
            while (b1) {
                try {
                    Account account = (Account) oin.readObject();
                    if (account.getAccountNumber() == AccountNumber) {
                        System.out.println("=====Account Found Flag 1 ====");
                        long availableAmount = account.getAmount();
                        long newAmount = availableAmount + Amount;
                        account.setAmount(newAmount);
//                        b1 = false; // Exit the loop after updating the account balance
                    }
                    a1.add(account);
                } catch (EOFException e) {
                    break;
                }
            }
            oin.close();

            int i = 0;
            while (i < a1.size()) {
                System.out.println("Loop will run " + i);
                WriteToFile(a1.get(i));
                i++;
            }
            System.out.println("=================Updated Successfully==========");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Account MakeAccount(String name,int age,int Amount,int AccNum){
        return new Account(name,age,Amount,AccNum);
    }

    public static void main(String[] args) throws Exception {

//        Account a1=new Account("Muzamil",19,1,100);
//        Account a2=new Account("Muzamil",19,2,200);
//        Account a3=new Account("Muzamil",19,3,300);
//        Account a4=new Account("Muzamil",19,4,400);
//        Account a5=new Account("Muzamil",19,5,300);
//        Account a6=new Account("Muzamil",19,6,400);
//
        ArrayList<Account> a=new ArrayList<>();
//        a.add(a1);
//        a.add(a2);
//        a.add(a5);
//        a.add(a6);
//        a.add(MakeAccount("Muzamil",20,7,500));
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("s.txt"));
//        oos.writeObject(a);

     //   Reading Objects
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("s.txt"));
        ArrayList<Account> accounts=(ArrayList<Account>)ois.readObject();

        for (Account bin: accounts ){
            System.out.println( bin.getName());
            System.out.println( bin.getAge());
            System.out.println( bin.getAmount());
            System.out.println( bin.getAccountDate());
            System.out.println( bin.getAccountNumber());

            System.out.println("======================================================");
        }

//        WriteToFile(a1);
//        WriteToFile(a2);
//
//        WriteToFile(a3);
//        WriteToFile(a4);
//
//        depositInAccount(2,500);
//        readFromFile("AccountDetails1.ser");
    }
//    void static writeArr(){
//
//    }
}


