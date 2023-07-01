class Point{
    private int x;
    private int y;

    Point(){

    }
    Point(int X,int Y){
        x=X;
        y=Y;
    }
    public void Display(){
        System.out.printf("The Val of X is %d%nThe Val of Y is %d%n",x,y);
    }
    public void setValues(int X,int Y){
        x=X;
        y=Y;
    }
    public void move(int X,int Y){
        x+=X;
        y+=Y;
    }
    public boolean checkOrigin(){
        if(x==0 && y==0){
            return true;
        }
        else{
            return false;
        }
    }
}



public class Qs_NO_4 {
    public static void main(String[] args) {

    }
}
