class Complex{
    private double real;
    private double imag;

    public Complex(){
        real=0.0;
        imag=0.0;
    }
    public Complex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public Complex Add(Complex obj){
        double real1=this.real+ obj.real;
        double imag1=this.imag+obj.imag;

        Complex newObj=new Complex(real1,imag1);

        return newObj;


    }
    public void show(){
        System.out.println("Real Part = "+this.real +"Imag part = "+this.imag);
    }
}

public class Activity_2 {
    public static void main(String[] args) {
        Complex obj1=new Complex(1.0,2.0);
        Complex obj2=new Complex(2.0,3.0);

        Complex answer=obj1.Add(obj2);
        answer.show();

    }
}
