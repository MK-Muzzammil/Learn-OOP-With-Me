interface RegistrationForExams{
    public void register();
}

class EmploeyeTask implements RegistrationForExams{
    private String name;
    private String date;
    private int salary;


    public EmploeyeTask(){
        name=null;
        date=null;
        salary=0;
    }
    public EmploeyeTask(String name,String date,int salary){
        this.name=name;
        this.date=date;
        this.salary=salary;
    }

    public void register(){
        System.out.println("The Emploeye Is Registered "+"Name : "+this.name + "Date : "+this.date +" Salary : "+salary );
    }
}
class StudentTask implements RegistrationForExams{
    private String name; private int age; private double gpa;
    public StudentTask()


    {
        name = null; age = 0;
        gpa = 0;
    }
    public StudentTask(String name,int age,double gpa)
    {
        this.name = name;
        this.age = age;

        this.gpa = gpa;
    }
    @Override
    public void register() {
        System.out.println("Student is registered " + "Student name " + name
                + " gpa " + gpa);
    }
}

public class Activity_1 {
    public static void main(String[] args) {
        EmploeyeTask e=new EmploeyeTask("Ahmed","11,02,2001",20000);
        StudentTask s=new StudentTask("Ali",23,3.5);
        e.register();
        s.register();
    }
}
