import java.util.Arrays;
import java.util.Scanner;

class Circle5 {
    private double radius;


    public Circle5() {
        this.radius = 0.0;
    }

    public Circle5(double radius) {
        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
class Rectangle{
    private double length;
    private double width;

    public Rectangle(){

    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calArea(){
        return this.length*this.width;
    }
}

class GeometricCollection{
    private Circle5 [] circleArr=new Circle5[10];
    private Rectangle[] recArr=new Rectangle[10];

    public GeometricCollection(){

    }
    public GeometricCollection(Circle5[] circleArr,Rectangle[] recArr) {
        this.circleArr = circleArr;
        this.recArr=recArr;
    }
    public double findArea(){
        double circleArea=0.0;
        double recArea=0.0;
        for(int i=0;i < circleArr.length;i++){
            circleArea+=circleArr[i].calArea();
            recArea+=recArr[i].calArea();
        }
        double totalArea=circleArea+recArea;
        return totalArea;
    }
    public void Display(){
        for(int i=0;i< circleArr.length;i++){
            System.out.println(circleArr[i].getRadius());
            System.out.println(recArr[i].getLength());
            System.out.println(recArr[i].getWidth());

        }
        System.out.println("Total Geometric Area of rec and circle is "+this.findArea());
    }


}
public class Question_No_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Circle5[] circleArr=new Circle5[2];
        Rectangle[] recArr=new Rectangle[2];
        for(int i=0;i<circleArr.length;i++){
            System.out.println("Enter the value in Circle Arr at "+i);
            circleArr[i]=new Circle5(input.nextDouble());
            System.out.println("Enter the value in Rec Arr at "+i);
            recArr[i]=new Rectangle(input.nextDouble(), input.nextDouble());

        }

        GeometricCollection obj=new GeometricCollection(circleArr,recArr);
        System.out.println(obj.findArea());
        obj.Display();


    }

}
