interface Payable{


    double getPayableAmount();
}
class Invoice implements Payable{
    private String partNum;
    private String partDes;
    private int quantity;
    private double pricePerItem;

    public Invoice(){

    }
    public Invoice(String partNum,String partDes,int quantity,double pricePerItem){
        this.partNum=partNum;
        this.partDes=partDes;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    public double getPayableAmount(){
        return pricePerItem;
    }

}
class Emploeye1 implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


    public Emploeye1(){

    }
    public Emploeye1(String firstName,String lastName,String socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    public double getPayableAmount(){
        return  0.0;
    }
}
class SalariedEmploeye extends Emploeye1{
    private double weeklySalary;

    public SalariedEmploeye(){

    }
    public SalariedEmploeye(String firstName,String lastName,String socialSecurityNumber,double weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

    @Override
    public double getPayableAmount() {
        return weeklySalary;
    }
}

public class Lab_Task_2_Payable {
    public static void main(String[] args) {
//        Emploeye1 e=new Emploeye1();
//        SalariedEmploeye s=new SalariedEmploeye("Muhammad","Muzzammil","Sp22",1200);
//        System.out.println( s.getPayableAmount());
//        System.out.println( e.getPayableAmount());

        Payable  i = new Emploeye1();
        System.out.println(  i.getPayableAmount());
        Emploeye1  i1 = new SalariedEmploeye("Muhammad","Muzzammil","Sp22",1200);
        System.out.println(i1.getPayableAmount());


    }
}
