public class Point_Lab_TAsk_3 {
    private int xChord;
    private int yChord;





    public Point_Lab_TAsk_3(){

    }
    public Point_Lab_TAsk_3(int xChord,int yChord){
        this.xChord=xChord;
        this.yChord=yChord;
    }

    public int getxChord() {
        return xChord;
    }

    public void setxChord(int xChord) {
        this.xChord = xChord;
    }

    public int getyChord() {
        return yChord;
    }

    public void setyChord(int yChord) {
        this.yChord = yChord;
    }

    public String toString(){
        return String.format("x = %d  Y = %d%n",this.xChord,this.yChord);
    }
}
