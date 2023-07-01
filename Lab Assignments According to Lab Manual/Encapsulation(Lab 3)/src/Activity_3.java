class Point{
    private int x;
    private int y;

    public Point(){
        x=0;
        y=0;
    }
    public Point(int X,int Y){
        x=X;
        y=Y;
    }
    public int getX() {
        return x;
    }

    public void setX(int X) {
        x = X;
    }


    public int getY() {
        return y;
    }

    public void setY(int Y) {
        y = Y;
    }

    public void movePoint(int a,int b){
        x=x+a;
        y=y+b;
    }
    public void Display(){
        System.out.println("X = "+x +" Y = "+y);
    }
}






public class Activity_3 {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.setX(1);
        p1.setY(2);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.movePoint(2,3);
        p1.Display();

    }
}
