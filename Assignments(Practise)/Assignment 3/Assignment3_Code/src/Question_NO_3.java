class Fraction{
    private  int numerator;
    private  int denomenator;

    public Fraction(){

    }
    public Fraction(int numerator,int denomenator){
        this.numerator=numerator;
        this.denomenator=denomenator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenomenator() {
        return denomenator;
    }

    public Fraction add(Fraction obj){
        int newNumerator=this.numerator*obj.denomenator+obj.numerator*this.denomenator;
        int newDenomenator=this.denomenator * obj.denomenator;


        Fraction newObj=new Fraction(newNumerator,newDenomenator);
        return newObj;
    }

}

public class Question_NO_3 {
    public static void main(String[] args) {
        Fraction f1=new Fraction(1,2);
        Fraction f2=new Fraction(2,3);
        Fraction newFraction=f1.add(f2);
        System.out.println(newFraction.getNumerator());
        System.out.println(newFraction.getDenomenator());
    }
}
