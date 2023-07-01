class Address{
    private String City;
    private int streetno;

    public Address(){

    }
    public Address(String City,int streetno){
        this.City=City;
        this.streetno=streetno;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getStreetno() {
        return streetno;
    }

    public void setStreetno(int streetno) {
        this.streetno = streetno;
    }
    public String toString(){
        return String.format("%s  %d%n ",this.City,this.streetno);
    }
}
class Person{
    protected String name;
    protected Address obj;
    protected int id;
    protected String phone;


    public Person(){

    }
    public Person(String name,int id,String phone,Address obj){
        this.name=name;
        this.id=id;
        this.phone=phone;
        this.obj=obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getObj() {
        return obj;
    }

    public void setObj(Address obj) {
        this.obj = obj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void Display1(){
        System.out.println("Name :"+name +"ID : "+id+ "Phone :"+this.phone);
    }
}
class student extends Person{
    private String rollNO;
    private int marks;

    public student(){
        super();

    }
    public student(String Name,int id,String Phone,String rollNO,int marks,Address obj){
        super(Name,id,Phone,obj);
        this.rollNO=rollNO;
        this.marks=marks;
    }


    public String getRollNO() {
        return rollNO;
    }

    public void setRollNO(String rollNO) {
        this.rollNO = rollNO;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void Display(){
        System.out.println(" Roll :"+rollNO +" Marks : "+marks +"Address :"+obj.toString());
    }

}
class Faculty extends  Person{
    private String fatherName;

    public Faculty(){
        super();//to call the Non arg constructor of parent class

    }
    public Faculty(String name,String fatherName,int id,String phone,Address obj){
        super(name,id,phone,obj);
        this.fatherName=fatherName;
    }
    public void setFatherName(String fatherName){
     this.fatherName=fatherName;
    }
    public String getFatherName(){
        return this.fatherName;
    }

    public void Display(){
        System.out.println("Name :"+this.name +"Id :"+this.id +"Father Name: "+this.fatherName+"Address :"+obj.toString());
    }
}
public class Activity_1_Person {
    public static void main(String[] args) {
        Address ad1=new Address("Faisalabd",12);
        Address ad2=new Address("ISLAMABD",13);
        student s1=new student("Muzamil",12,"03013514508","SP22",23,ad1);
        s1.setObj(ad2);
        System.out.println(s1.getObj());
        Faculty f1=new Faculty("Muzamil","Muhammad Sarwar",12,"030135145508",ad1);
        f1.setObj(ad2);
        System.out.println(f1.getObj());

//        s1.Display1();
//        s1.Display();
            f1.Display();
    }

}
