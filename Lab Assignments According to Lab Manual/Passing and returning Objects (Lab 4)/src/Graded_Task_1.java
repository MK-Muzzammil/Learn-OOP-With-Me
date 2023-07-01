class Distance {
    private double feet;
    private double inches;

    public Distance(){
        feet=0.0;
        inches=0.0;
    }
    public Distance(double feet,double inches){
        this.feet=feet;
        this.inches=inches;
    }

    public void setFeet(double feet){
        this.feet=feet;
    }
    public double getFeet(){
        return feet;
    }
    public void setInches(double inches){
        this.inches=inches;
    }
    public double getInches(){
        return inches;
    }
    public void Display(){
        System.out.println("Feets = "+feet +" Inches = "+inches);
    }
    public Distance Add(Distance obj){

        double feet1=this.feet + obj.feet;
        double inches1=this.inches + obj.inches;

        Distance newObj=new Distance(feet1,inches1);

        return newObj;

    }

}


public class Graded_Task_1 {
    public static void main(String[] args) {
        Distance d1=new Distance(1.0,2.0);
        Distance d2=new Distance(3.0,4.0);

        Distance d3=d1.Add(d2);
        d3.Display();
    }
}
