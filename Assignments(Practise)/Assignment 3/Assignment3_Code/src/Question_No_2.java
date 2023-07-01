class Calculator{
    public Calculator(){

    }
    public static double  Sum(double num1,double num2){
        return num1+num2;
    }
    public static double Multiply(double num1,double num2){
        return num1*num2;
    }
    public static double Divide(double num1,double num2){
        if(num2==0){
            return 0.0;
        }
        else{
            return num1/num2;
        }
    }
    public static double Modulus(double num1,double num2){
        return num1%num2;
    }
    public static double Sin(double angel){
        return Math.sin(angel);
    }
    public static double Cos(double angel){
        return Math.cos(angel);
    }
    public static double Tan(double angel){
        return Math.tan(angel);
    }
}

public class Question_No_2 {
    public static void main(String[] args) {
        System.out.println( Calculator.Modulus(7,3));
    }

}
