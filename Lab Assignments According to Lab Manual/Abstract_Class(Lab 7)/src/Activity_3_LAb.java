abstract class A{
    //Abstrcat Method are those which dont have body and if a class have abstract method it must be made abstract
    //if we inherit abstract class we must define the body into the exteded class must define all the abstract methods
    //In an abstract class also have concrete methods may exist that have body along with abstract methods
    abstract void callMe();
    public void callMeTO(){
        System.out.println("Please call me ");
    }

}
class B extends A{
    void callMe(){
        System.out.println("Yes call me i am initiallized in class B ");
    }

}






public class Activity_3_LAb {
    public static void main(String[] args) {
        B b=new B();
        b.callMe();
        b.callMeTO();

    }

}
