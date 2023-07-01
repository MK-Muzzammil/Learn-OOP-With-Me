class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        length=55;
        width=66;
    }
    public Rectangle(int Length,int Width){
        length=Length;
        width=Width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int Length) {
        length = Length;
    }
    public void setWidth(int Width){
        width=Width;
    }
    public int getWidth(){
        return width;
    }
    public int calArea(){
        return length*width;
    }
}








public class Activity_2 {
    public static void main(String[] args) {
//    Rectangle r=new Rectangle();
//    r.setLength(2);
//    r.setWidth(3);
//    System.out.println(r.calArea());
//    System.out.println(r.getLength());
//    System.out.println(r.getWidth());

    Rectangle r1=new Rectangle(4,5);
    r1.setLength(3);
    r1.setWidth(6);
    System.out.println(r1.getLength());
    System.out.println(r1.getWidth());
    System.out.println(r1.calArea());

    }
}
