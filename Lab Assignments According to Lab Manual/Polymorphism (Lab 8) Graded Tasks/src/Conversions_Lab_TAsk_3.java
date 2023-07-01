abstract class Convert{
    protected double val1;
    protected double val2;

    public Convert(){

    }
    public Convert(double val1){
        this.val1=val1;
    }

    public abstract void convert();

    public double getVal1() {
        return val1;
    }

    public double getVal2() {
        return val2;
    }
}
class LitersToGallons extends Convert{
    public LitersToGallons(){

    }
    public LitersToGallons(double val1){
        super(val1);
    }
    public void convert(){
        val2 = val1 * 0.264172;
    }
}
class FarenhiteToCelcius extends Convert{
    public FarenhiteToCelcius(){

    }
    public FarenhiteToCelcius(double val1){
        super(val1);
    }
    public void convert(){
        val2 = (val1-32) * 5/9;
    }
}
class FeetToMeters extends Convert{
    public FeetToMeters(){

    }
    public FeetToMeters(double val1){
        super(val1);
    }
    public void convert(){
        val2=val1*0.3048;
    }

}

public class Conversions_Lab_TAsk_3 {
    public static void main(String[] args) {

        Convert con;

        con=new LitersToGallons(13);
        con.convert();
        System.out.println(con.getVal1() +" Liters is equal to "+ con.getVal2() +" Gallons ");

        con=new FarenhiteToCelcius(15);
        con.convert();
        System.out.println(con.getVal1() +" Farenhite is equal to "+ con.getVal2()+" Celcius");

        con=new FeetToMeters(18);
        con.convert();
        System.out.println(con.getVal1() +" Feet is equal to "+ con.getVal2()+" Meters");

    }
}
