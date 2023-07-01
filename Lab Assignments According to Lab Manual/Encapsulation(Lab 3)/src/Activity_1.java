class circle1{
    private int radius;

    circle1(){
        radius=0;
    }
    circle1(int Radius){
        radius=Radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void display(){
        System.out.println("Radius = "+radius);
    }
    public double calCircumferance(){
        return 2* 3.14 * radius;
    }

}
public class Activity_1 {
    public static void main(String[] args) {
//        circle1 c=new circle1();
//        c.setRadius(12);
//        System.out.println(c.getRadius());
//        c.display();
//        System.out.println(c.calCircumferance());
        circle1 c2=new circle1(12);
        c2.setRadius(14);//it will take overide the value of radius set by constructor
        c2.display();
        System.out.println( c2.calCircumferance());
    }
}
