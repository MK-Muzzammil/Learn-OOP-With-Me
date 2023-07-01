import java.util.Scanner;
class QuardaticEquation{
    private int a;
    private int b;
    private int c;

    QuardaticEquation(){
    }

    QuardaticEquation(int A,int B,int C){
        a=A;
        b=B;
        c=C;
    }

    void display(){
        System.out.printf("The value of a is %d ,b is %d ,c is %d%n ",a,b,c);
    }

    public void setValues(int A,int B,int C ){
        a=A;
        b=B;
        c=C;
    }
    public double getDiscriminant(){
        double disc=(b*b) - 4*a*c;
        return disc;
    }
    public boolean checkIfDescriminantIsGretaerThan100(){
        double disc=getDiscriminant();
        System.out.printf("The value of discriminant is %2.3f%n",disc);
        if(disc>100){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Qs_NO_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //For the default constructor
//        QuardaticEquation eq1=new QuardaticEquation();
//        eq1.display();
//        boolean b1=eq1.checkIfDescriminantIsGretaerThan100();
//        System.out.println(b1);
        //for the parametrized constructor
        System.out.println("please enter the value of a");
        int a= input.nextInt();
        System.out.println("please enter the value of b");
        int b= input.nextInt();
        System.out.println("please enter the value of c");
        int c= input.nextInt();
        QuardaticEquation eq2=new QuardaticEquation(a,b,c);
        eq2.display();
        eq2.getDiscriminant();
        boolean b2=eq2.checkIfDescriminantIsGretaerThan100();
        System.out.println(b2);
    }
}
