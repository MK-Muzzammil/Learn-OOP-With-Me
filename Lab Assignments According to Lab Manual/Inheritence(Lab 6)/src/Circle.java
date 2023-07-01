class Circle1{
    private double radius;
    public Circle1(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;

    }
    public String toString(){
        System.out.println(super.toString());
        return null;
    }


}
class B extends  Circle1{
    private double length;
    public B(double radius,double length){
        super(radius);
        this.length=length;

    }
    @Override
    public double getArea(){
        return super.getArea()*length;
    }

}
public class Circle {
    public static void main(String[] args) {
        Circle1 c=new Circle1(2);
        System.out.println(c.toString());
    }
}