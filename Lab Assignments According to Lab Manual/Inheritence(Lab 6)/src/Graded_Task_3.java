class Computer{
    protected double wordSize;  //in bits
    protected double memorySize;  //in megabits
    protected double storageSize;  //in mega bytes
    protected double speed;      //in mega hertz

    public Computer(){

    }
    public Computer(double wordSize,double memorySize,double storageSize,double speed){
        this.wordSize=wordSize;
        this.memorySize=memorySize;
        this.storageSize=storageSize;
        this.speed=speed;

    }


    public double getWordSize() {
        return wordSize;
    }

    public void setWordSize(double wordSize) {
        this.wordSize = wordSize;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void Display(){
        System.out.printf("Word Size :%.2f Bits  Memory Size : %.2f megaBits  Storage:%.2f Mega Bytes Speed :%.2f MegaHertz%n",this.wordSize,this.memorySize,this.storageSize,this.speed );
    }
}
class Laptop extends Computer{
    private int length;
    private int width;
    private int height;


    public Laptop(){
        super();
    }
    public Laptop(double wordSize,double memorySize,double storageSize,double speed,int length,int width,int height){
        super(wordSize,memorySize,storageSize,speed);
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public void DisplaY(){
        super.Display();
        System.out.println("Length : "+this.length +" Width : "+this.width +" Height : "+this.height);
    }
}










public class Graded_Task_3 {
    public static void main(String[] args) {
        Laptop dell=new Laptop();
        dell.DisplaY();
    }
}
