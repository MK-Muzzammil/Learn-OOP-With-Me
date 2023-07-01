public class Line_With_Point_LAb_3 {
    private Point_Lab_TAsk_3 startPoint;
    private Point_Lab_TAsk_3 endPoint;

    public Line_With_Point_LAb_3(){

    }
    public Line_With_Point_LAb_3(Point_Lab_TAsk_3 p1,Point_Lab_TAsk_3 p2){
        this.startPoint=p1;
        this.endPoint=p2;
    }

    public void setPoint(Point_Lab_TAsk_3 startPoint){
        this.startPoint=startPoint;
    }
    public Point_Lab_TAsk_3 getPoint(){
        return startPoint;
    }
    public void setEndPoint(Point_Lab_TAsk_3 endPoint){
        this.endPoint=endPoint;
    }
    public Point_Lab_TAsk_3 getEndPoint(){
        return endPoint;
    }

    public double Distance(){
        double dis=Math.sqrt((endPoint.getxChord()-startPoint.getxChord())*(endPoint.getxChord()-startPoint.getxChord()) +(endPoint.getyChord()-startPoint.getyChord())*(endPoint.getyChord()-startPoint.getyChord()) );
        return dis;
    }

    public static void main(String[] args) {
        Point_Lab_TAsk_3 p1=new Point_Lab_TAsk_3(12,13);
        Point_Lab_TAsk_3 p2=new Point_Lab_TAsk_3(14,15);

        Line_With_Point_LAb_3 line1=new Line_With_Point_LAb_3(p1,p2);
        System.out.println( line1.Distance());

        Line_With_Point_LAb_3 line2=new Line_With_Point_LAb_3(new Point_Lab_TAsk_3(0,0),new Point_Lab_TAsk_3(2,3));
        System.out.println( line1.Distance());
    }
}


