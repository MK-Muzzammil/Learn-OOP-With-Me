import java.util.Scanner;
class Worker{
    //non static private members cant be called into static methods it will
    //only be called in non static methods
    private String name;

    static int noOfHours;
    //static datamembers can be accesed in static and non static methods
    //of the class to call it in other class we have to call it by class name
    //eg (Worker.noOfhours);
    static double hourlyWage;


    public Worker(){
        name=null;
        noOfHours=0;
        hourlyWage=0.0;
    }
    public Worker(String name,int noOfHours,double hourlyWage){
        this.name=name;
        //see static data members in non static method
        this.noOfHours=noOfHours;
        this.hourlyWage=hourlyWage;
    }
    public void setData(String name,int noOfHours,double hourlyWage){
        this.name=name;
        this.noOfHours=noOfHours;
        this.hourlyWage=hourlyWage;

    }
    public void getdata(){
        //calculatePay() is static method that can be called in non static
        //method of the same class
        System.out.println("Name : "+ name +" Pay : " +calculatePay());
    }
    public static double  calculatePay(){
        //we cant call data member(name) in static method bcz it is non static
       double pay= noOfHours * hourlyWage;
       if(noOfHours>40){
           pay=pay+(0.5 * hourlyWage * (noOfHours-40) );
       }
       return pay;

    }
}

public class CodeConvert {
    public static void main(String[] args) {
        //if we want to call static method of one class into other diff class
        //we can call it by class Name like Worker.calculatePay();

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name : ");
        String name=input.next();
        System.out.println("Please enter the no of hours worked : "  );
        int hours=input.nextInt();
        System.out.println("Please enter the  hourly wage : ");
        int wage=input.nextInt();
        Worker w1=new Worker(name,hours,wage);
        w1.getdata();
        //=================Second Worker ==============================
        Worker w2=new Worker(name,hours,wage);
        w2.getdata();

    }
}
