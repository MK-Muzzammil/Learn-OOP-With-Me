import java.util.Scanner;
class CarPart{
    public String modelNumber;
    public String partNumber;
    public int cost;

    public void set(String modelNumber,String partNumber,int cost){
        this.modelNumber=modelNumber;
        this.partNumber=partNumber;
        this.cost=cost;
    }
    public void get(){
        System.out.println("Model Number: "+this.modelNumber+" Part Number : "+this.partNumber+" Cost : "+this.cost);
    }
}
public class Task3 {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the Model Number");
        String modelNum=input.next();
        System.out.println("Please enter the Part Number");
        String partNum=input.next();
        System.out.println("Please enter the Model Cost");
        int cost=input.nextInt();

        CarPart car1=new CarPart();
        car1.set(modelNum,partNum,cost);
        car1.get();



    }
}
