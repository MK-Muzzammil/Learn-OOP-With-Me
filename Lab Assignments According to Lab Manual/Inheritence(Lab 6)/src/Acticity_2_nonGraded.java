class Emploeye1{
    protected String name;
    protected String phone;
    protected String address;
    protected int allowance;


    public Emploeye1(){

    }
    public Emploeye1(String name,String phone,String address,int allowance){
        this.name=name;
        this.phone=phone;
        this.address=address;
        this.allowance=allowance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }
    public String toString(){
        return String.format("Name : %s  Address : %s  Phone : %s Aloowance :%d%n",this.name,this.address,this.phone,this.allowance);
    }

}
class Regular extends Emploeye1{
    private int basicPay;
    public Regular(){
        super();
    }
    public Regular(String name,String phone,String address,int allowance,int basicPay){
        super(name,phone,address,allowance);
        this.basicPay=basicPay;
    }

    public int getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }
    public void Display(){
        System.out.println(super.toString() + "Basic Pay : "+this.basicPay);
    }

}
class Adhoc extends Emploeye1{
    private int wage;
    private int numberOfWorkingDays;

    public Adhoc(){
        super();
    }
    public Adhoc(String name,String phone,String address,int allowance,int basicPay,int wage,int numberOfWorkingDays){
        super(name,phone,address,allowance);
        this.wage=wage;
        this.numberOfWorkingDays=numberOfWorkingDays;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }
    public void Display(){
        System.out.println(super.toString());
        System.out.println("Wage : "+this.wage + " NumberOf Working Days : "+this.numberOfWorkingDays);
    }
}

public class Acticity_2_nonGraded {
    public static void main(String[] args) {
        Regular r1=new Regular("Muzzammil","03013514508","House # P 743 ",80000,12000);
        r1.Display();
        System.out.println("==============================Adhoc Display==========================");
        Adhoc a1=new Adhoc("Muzzammil","03013514508","House # P 743 ",80000,12000,23000,25);
        a1.Display();
    }


}
