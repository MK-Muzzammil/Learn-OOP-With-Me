import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;
    Rectangle(){
    }
    Rectangle(int Length,int Width){
        length=Length;
        width=Width;
    }
    void Display(){
        System.out.printf("length is %d%nwidth is %d%n",length,width);
    }
    public void setValues(int Length,int Width){
        length=Length;
        width=Width;
    }
    public void calculateArea(){
        int Area=length*width;
        System.out.println("The Area of this rectangle is "+Area);
    }
    public boolean checkSquare(){
        if(length==width){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Qs_No_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Rectangle rec1=new Rectangle();
        System.out.println("Please enetr the length");
        int length=sc.nextInt();
        System.out.println("Please enter the width");
        int width=sc.nextInt();
        Rectangle rec2=new Rectangle(length,width);
        rec2.Display();
        rec2.calculateArea();
        System.out.println(rec2.checkSquare());
    }
}
