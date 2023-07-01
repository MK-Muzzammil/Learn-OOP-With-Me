class Rectangle{
    private int length;
    private int width;
    private int height;

    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void calulateArea(){
        int area=length*width;
        System.out.println("The area of this rectangle is "+area);
    }
    public void calculateVol(){
        int volume=length*width*height;
        System.out.println("The Vol of this rectangle is "+volume);
    }
}



public class GradedTask_4 {
    public static void main(String[] args) {
        Rectangle rec1=new Rectangle();
        rec1.setLength(12);
        rec1.setWidth(23);
        rec1.setHeight(2);

        rec1.calulateArea();
        rec1.calculateVol();
    }
}
