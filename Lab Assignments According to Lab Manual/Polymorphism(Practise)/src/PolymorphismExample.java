class GraduateStudent extends Student{

}
class Student extends Person{
    public String toString(){
        return "Student";
    }
    public void printStuName(){
        System.out.println("MuzamilHello");
    }
}
class Person extends Object{
    public String toString(){
        return "Person";
    }
    public void printName(){
        System.out.println("Muzamil");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
//        m(new GraduateStudent());
//        m(new Student());
//        m(new Person());
//        m(new Object());

//            Person s=new Student();
            Object o=new Student();
            Student b=(Student) o;


    }

    public static void m(Object o){
        System.out.println(o.toString());
    }
}
