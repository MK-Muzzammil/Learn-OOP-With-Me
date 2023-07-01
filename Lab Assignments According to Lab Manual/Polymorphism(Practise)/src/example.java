import java.util.Date;
import java.util.Scanner;

class Person1{
    protected String firstName;
    protected Date HireDate;
    protected boolean hasCompanyCar;

    public Person1(){

    }
    public Person1(String firstName,Date hireDate,boolean hasCompanyCar){
        this.firstName=firstName;
        this.HireDate=hireDate;
        this.hasCompanyCar=hasCompanyCar;
    }

    public String toString(){
        return this.firstName+" "+this.HireDate+" "+this.hasCompanyCar;
    }
}
class Emploeye1 extends Person1{
    private String Designation;
    private int wage;
    private int workinghours;

    public Emploeye1(){

    }
    public Emploeye1(String firstName,Date hiredate,boolean  hasCompanyCar,String designation,int wage,int workinghours){
        super(firstName,hiredate,hasCompanyCar);
        this.Designation=designation;
        this.wage=wage;
        this.workinghours=workinghours;
    }

    public int Earning(){
        this.wage=workinghours*150;

        return this.wage;
    }
    public String toString(){
        return super.toString()+" Designation : "+ Designation +" Wage :"+this.wage +" Working Hours : "+this.workinghours;
    }
}
class Manager1 extends Person1{
    private Emploeye1[] arr=new Emploeye1[5];
    private int noOfProjects;
    private int projectPay;

    public Manager1(){

    }
    public Manager1(String firstName,Date hireDate,boolean hasCompanyCar,Emploeye1[] arr,int noOfProjects,int projectPay){
        super(firstName,hireDate,hasCompanyCar);
        this.arr=arr;
        this.noOfProjects=noOfProjects;
        this.projectPay=projectPay;
    }
    public int Earning(){
        int totalEarning=0;
        for(Emploeye1 emp:arr){
            if(emp!=null){
                totalEarning+=emp.Earning();
            }
        }
        return totalEarning+(noOfProjects*projectPay);
    }
    public int countEmploeyeHiredThisYear(){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].HireDate.getYear()==new Date().getYear()){
                count++;
            }
        }
        return count;
    }
    public int emploeyeEarningThisYearGreaterThan1Lac(){
        int count=0;
        for(Emploeye1 emp:arr){
            if(emp.Earning() > 100000){
                count++;
            }

        }
        return count;
    }
    public void  DisplayAllEmploeyesOFManager(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }
}






public class example {
    public static void main(String[] args) {
        Date date=new Date();
        Scanner input=new Scanner(System.in);
        Emploeye1[] arr=new Emploeye1[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Emploeye Name ");
            String name=input.next();
            arr[i]=new Emploeye1(name,new Date(),false,"Executive Member",20000,100);
        }
        Manager1 m1=new Manager1("Muzzammil",date,true,arr,5,50000);
        System.out.println(m1.Earning());
        System.out.println(m1.countEmploeyeHiredThisYear());
        System.out.println(m1.emploeyeEarningThisYearGreaterThan1Lac());
        m1.DisplayAllEmploeyesOFManager();
    }
}
