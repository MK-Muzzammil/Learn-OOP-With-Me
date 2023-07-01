class Circle{
    static double radius;
    public int count;


    public static double  getArea()
    {
        return Math.PI*radius*radius;
    }
    public void getPerimeter()
    {

        double per=radius*radius;
    }
    }

public class StaticAndNonStatic {
    public static void main(String[] args) {
        Circle c1=new Circle();

        c1.getPerimeter();  //nonstatic method
        Circle.getArea();
        Circle.radius=12.0;

    }
}
