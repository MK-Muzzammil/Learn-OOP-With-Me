import java.util.Date;
class Person2{
    protected String name;
    protected  String address;
    protected String phoneNo;
    protected String emailAdress;

    public Person2(){

    }
    public Person2(String name,String address,String phoneNo,String emailAdress){
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNo;
        this.emailAdress=emailAdress;
    }

    public void Display(){
        System.out.println("NAme : "+this.name +" Address : "+this.address +" Phone# :"+this.phoneNo + "Email : "+this.emailAdress );
    }
}
class Student2 extends Person2{
    private String status;

    public Student2(){

    }
    public Student2(String name,String address,String phoneNo,String emailAdress,String status){
        super(name,address,phoneNo,emailAdress);
        this.status=status;
    }

    public void Display(){
        super.Display();
        System.out.println("Status : "+this.status);
    }

}
class Emploeye2 extends Person2{
    protected String office;
    protected int salary;
    protected Date hireDate;

    public Emploeye2(){

    }
    public Emploeye2(String name,String address,String phoneNo,String emailAdress,String office,int salary,Date hireDate){
        super(name,address,phoneNo,emailAdress);
        this.office=office;
        this.salary=salary;
        this.hireDate=hireDate;
    }
    public void Display(){
        super.Display();
        System.out.println("Office : "+this.office + " Salary : "+this.salary +" Hire Date :"+this.hireDate);
    }
}
class Faculty2 extends Emploeye2{
    private int officeHours;
    private String rank;

    public Faculty2(){
        super();
    }
    public Faculty2(String name,String address,String phoneNo,String emailAdress,String office,int salary,Date hireDate,int officeHours,String rank){
        super(name,address,phoneNo,emailAdress,office,salary,hireDate);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    public void Display(){
        super.Display();
        System.out.println("Office Hours : "+this.officeHours + " Rank : "+this.rank);
    }
}
class Staff2 extends Emploeye2 {
    private String title;

    public Staff2() {
        super();
    }

    public Staff2(String name, String address, String phoneNo, String emailAdress, String office, int salary, Date hireDate, String title) {
        super(name, address, phoneNo, emailAdress, office, salary, hireDate);
        this.title = title;
    }

    public void Display() {
        super.Display();
        System.out.println("Title : " + this.title);
    }
}
public class Graded_Task_1 {
    public static void main(String[] args) {
        Date d1=new Date();
//        Emploeye2 e1=new Emploeye2("Muzamil","Islamabad","03013514508","muzzamil21@gmail.com","1st fllor Alfala Building",108000,d1);
//        e1.Display();

        Faculty2 f=new Faculty2("Muzamil","Islamabad","03013514508","muzzamil21@gmail.com","1st fllor Alfala Building",108000,d1,9,"Asis Manager");
        f.Display();
    }
}
