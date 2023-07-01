import java.util.Scanner;

class Student{
    String Name;
    String dateOfBirth;

    String Semester;
    int age;
    double CGPA;

    public void setInfo(String name,String dateOfBirth,int age,double CGPA){
        this.Name=name;
        this.dateOfBirth=dateOfBirth;
        this.age=age;
        this.CGPA=CGPA;
    }
    public void getInfo(){
        System.out.println("Name : "+this.Name+"\nDate of Birth : "+dateOfBirth+"\nAge: "+this.age+"\nCGPA: "+this.CGPA);
    }




}
public class Graded_Task_1 {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        Student st1=new Student();
        System.out.println("Please enter your name");
        String name=input.next();
        System.out.println("Please enter your Date of birth");
        String dob=input.next();
        System.out.println("Please enter your Age");
        int Age= input.nextInt();
        System.out.println("Please enter your CGPA");
        double CGPA= input.nextDouble();

        st1.setInfo(name,dob,Age,CGPA);
        st1.getInfo();
    }
}
