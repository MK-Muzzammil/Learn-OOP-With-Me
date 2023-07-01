class Fraction{
    private int numerator;
    private int denomenator;

    private double fraction;

    public void setNumerator(int numerator){
        this.numerator=numerator;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenomenator(int denomenator){
        this.denomenator=denomenator;
    }
    public int getDenomenator(){
        return denomenator;
    }
    public double getFraction(){
        return fraction;
    }
    public boolean Equals(Fraction frac) {
        if(this.fraction == frac.fraction){
            return true;
        }
        else{
            return false;
        }

    }


    public Fraction(){
        numerator=0;
        denomenator=0;
        fraction =Findfraction(numerator,denomenator);
    }
    public Fraction(int numerator,int denomenator){
        this.numerator=numerator;
        this.denomenator=denomenator;
        fraction=Findfraction(numerator,denomenator);
    }
    public double Findfraction(int num,int den){
        if( num!=0 && den==0){
            System.out.println("Math error");
        }
        return num/den;
    }

}
public class Graded_Task_3 {
    public static void main(String[] args) {
        Fraction obj1=new Fraction(6,3);
        Fraction obj2=new Fraction(6,3);
        System.out.println(obj1.getFraction());
        System.out.println(obj2.getFraction());
        boolean b=obj2.Equals(obj1);
        if(b){
            System.out.println("Yes its equal");
        }
        else{
            System.out.println("No its not equal");
        }
    }
}
