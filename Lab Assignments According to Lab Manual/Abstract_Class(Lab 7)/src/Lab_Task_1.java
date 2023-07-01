class Movie{
    protected String MPPARating;
    protected int idNum;
    protected String movieTitle;
    protected double latefee=2;

    public Movie(){
        this.MPPARating="G,PG-13 R";

    }
    public Movie(String MPPARating,int idNum,String movieTitle){
        this.idNum=idNum;
        this.MPPARating=MPPARating;
        this.movieTitle=movieTitle;
    }
    public String getMPPARating() {
        return MPPARating;
    }

    public void setMPPARating(String MPPARating) {
        this.MPPARating = MPPARating;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Movie){

            return this.idNum == ((Movie)obj).idNum;
        }

        return false;
    }
    public double calculateFee(int days){
        return days*this.latefee;
    }
}


class Action extends Movie{

    public Action(){
        this.latefee=3;
    }
    public Action(String MPPARating,int idNum,String movieTitle,double latefee){
        super(MPPARating,idNum,movieTitle);
        this.latefee=latefee;
    }
    @Override
    public double calculateFee(int days){
        double fee= days * this.latefee;
        return fee;
    }
}
class Comedy extends Movie{

    public Comedy(){
        this.latefee=2.50;
    }
    public Comedy(String MPPARating,int idNum,String movieTitle,double latefee){
        super(MPPARating,idNum,movieTitle);
        this.latefee=latefee;
    }
    @Override
    public double calculateFee(int days){
        double fee= days * this.latefee;
        return fee;
    }
}
class Drama extends Movie{
    public Drama(){
        this.latefee=2;
    }
    public Drama(String MPPARating,int idNum,String movieTitle,double latefee){
        super(MPPARating,idNum,movieTitle);
        this.latefee=latefee;
    }
    @Override
    public double calculateFee(int days){
        double fee= days * this.latefee;
        return fee;
    }
}





public class Lab_Task_1 {
    public static void main(String[] args) {
        Comedy c1=new Comedy("G,PG-123",12,"Saw",2.50);

        Drama d=new Drama("G,PG-123",13,"Money Heist",2);
        Movie m=new Movie();
        System.out.println("Drama Late fee  "+d.calculateFee(23));
        System.out.println("Comedy Late fee  "+c1.calculateFee(213));
        System.out.println(m.calculateFee(12));

        System.out.println( c1.equals(d));


    }
}
