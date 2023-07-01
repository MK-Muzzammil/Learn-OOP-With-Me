    abstract class Shapes{
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    public Shapes(){

    }
    public Shapes(int num,String penColor,String fillColor){
        this.numberOfLines=num;
        this.penColor=penColor;
        this.fillColor=fillColor;
    }
    abstract void Draw();
}
class Circle extends Shapes{

    public Circle(){

    }
    public Circle(int num,String penColor,String fillColor){
        super(num,penColor,fillColor);
    }


    @Override
    void Draw(){
        System.out.println("Circle Drawed with "+this.numberOfLines+" "+this.penColor+" "+this.fillColor);
    }
    //not an abstract method
    public void DrawToo(){
        System.out.println("Drawing Concrete function");
    }
}
class Square extends Shapes{
    public Square(){

    }
    public Square(int num,String penColor,String fillColor){
        super(num,penColor,fillColor);
    }
    @Override
    void Draw(){
        System.out.println("Square Drawed with "+this.numberOfLines+" "+this.penColor+" "+this.fillColor);
    }
}

class Triangle extends Shapes{
    public Triangle(){

    }
    public Triangle(int num,String penColor,String fillColor){
        super(num,penColor,fillColor);
    }

    @Override
    void Draw(){
        System.out.println("Triangle Drawed with "+this.numberOfLines+" "+this.penColor+" "+this.fillColor);
    }
}
public class Lab_Task_3 {
    public static void main(String[] args) {
        Circle c=new Circle(12,"Blue","Yellow");
        c.Draw();
    }
}
