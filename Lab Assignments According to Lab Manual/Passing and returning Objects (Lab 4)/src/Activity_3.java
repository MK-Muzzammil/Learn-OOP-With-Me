class Point{
    private int x;
    private int y;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }

    public Point(){
        x=0;
        y=0;
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;

    }
    public Point Add(Point p1,Point p2){
        int x1=this.x + p1.x+p2.x;
        int y1=this.y + p1.y + p2.y;

        Point newObj=new Point(x1,y1);
        return newObj;
    }
    public void show(){
        System.out.println("X = "+this.x +" Y = "+ this.y);
    }
}

public class Activity_3 {
    public static void main(String[] args) {
    Point p1=new Point(1,2);
    Point p2=new Point(2,3);
    Point p3=new Point();
    Point p4=p1.Add(p2,p3);
    p4.show();
    }
}