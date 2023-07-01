interface Shape{
    double getArea();
}

class Circle implements Shape{

    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI * this.radius* this.radius;
    }

}
class Rectangle implements Shape{

    private int length;
    private int width;
    public Rectangle(){

    }

    public Rectangle(int length,int width ){
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        return this.length* this.width;
    }

}

public class Lab_TAsk_1_Shape {
    public static void main(String[] args) {
        Circle c=new Circle(12);
        System.out.println(c.getArea());
    }
}
