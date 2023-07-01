class Person1{
    protected String name;
    protected String id;
    protected int marks;


    public Person1(){

    }
    public Person1(String name,String id,int marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void Display(){
//        super.toString();
        System.out.println("Name : "+this.name +" Id :"+this.id + " Marks : "+this.marks);
    }
}
class Student1 extends Person1{
    private String phone;
    private int rollNo;


    public Student1(){
        super();
    }
    public Student1(String name,String id,int marks,String phone,int rollNo){
        super(name,id,marks);
        this.rollNo=rollNo;
        this.phone=phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void Display(){
        super.Display(); //it is basically callind display Function of parent class
        System.out.println("Phone : "+this.phone +" Roll no : "+this.rollNo);
    }
}

public class Activity1_nonGraded {
    public static void main(String[] args) {
        Student1 s1=new Student1("Muzzammil","Sp22-BCS-058",1081,"03013514508",58);

        s1.Display();
    }
}
