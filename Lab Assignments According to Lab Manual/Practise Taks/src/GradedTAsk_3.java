import java.util.Scanner;
class Car{
    String color;
    String brand;
    String Engine;
    int cost;

    public void setInfo(String color,String brand,String Engine,int cost){
        this.color=color;
        this.brand=brand;
        this.Engine=Engine;
        this.cost=cost;
    }
    public void getInfo(){
        System.out.println("Brand :"+this.brand+"\nEngine :"+this.Engine+"\nColor: "+this.color+"\ncost : "+this.cost);
    }
    public void carSpeed(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the distance covered");
        int dist= input.nextInt();
        System.out.println("Please enter the time taken in sec");
        int time=input.nextInt();

        double speed=(double)dist/time;
        System.out.printf("Speed of this car is %2.3f m/s",speed);
    }

}
public class GradedTAsk_3 {
    public static void main(String[] args) {
     Car car1=new Car();
     car1.setInfo("Blue","Toyota","B58 Turbocharged",1300021);
     car1.getInfo();

     car1.carSpeed();
    }
}
