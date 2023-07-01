

public class Compile_Time_Polymorphism {
    public void show(int a){
        System.out.println("int method ");
    }
    public void show(String b){
        System.out.println("String method");

    }
    public static void main(String[] args) {
        Compile_Time_Polymorphism m=new Compile_Time_Polymorphism();
        //fpr this show method show(int) is called bcz enteerd val is int
        m.show(1);
        //for this method show(String) is called bcz entered val is String
        m.show("abc");

        //for overload means compile time polymorphism we must have same meth name,should be in same class and must have agree on these conditions
        //both have same data members,same type,same return type,same order then i wil give us compile time polymorphism


    }
}