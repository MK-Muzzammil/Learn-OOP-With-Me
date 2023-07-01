abstract class Person{
    private String name;
    public Person(){

    }
    public Person(String name){
        this.name=name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract boolean isOutstanding();

}

class Student extends Person{
    private double CGPA;

    public Student(){

    }
    public Student(String name,double CGPA){
        super(name);
        this.CGPA=CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
    @Override
    public boolean isOutstanding() {
        if(this.CGPA > 3.5){
            return true;
        }
        else{
            return false;
        }
    }

}
class Professor extends Person{
    private int numberOfPublication;

    public Professor(Professor sohail){

    }
    public Professor(String name,int numberOfPublication){
        super(name);
        this.numberOfPublication=numberOfPublication;
    }


    public int getNumberOfPublication() {
        return numberOfPublication;
    }

    public void setNumberOfPublication(int numberOfPublication) {
        this.numberOfPublication = numberOfPublication;
    }

    public boolean isOutstanding(){
        if(this.numberOfPublication > 50){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Person_Lab_Task_2 {
    public static void main(String[] args) {
        Person p=new Student("Muzamil",3.7);
        System.out.println( p.isOutstanding());
        Person p1=new Professor(new Professor("Sohail",12));
        Professor prof=(Professor) p1;
        prof.setNumberOfPublication(100);
        System.out.println(p1.isOutstanding());


        //========================Method 2 =============================

//        Person[] person=new Person[2];
//        person[0]=new Student("Muzamil",3.7);
//        person[1]=new Professor("Sohail",12);
//
//
//        for(int i=0;i< person.length;i++){
//            System.out.println("Name : is " + person[i].getName());
//        }
//
//
//
//        Professor professor=(Professor) person[1];
//        professor.setNumberOfPublication(100);
//        System.out.println(professor.getName() + " is outstanding ");

    }
}
