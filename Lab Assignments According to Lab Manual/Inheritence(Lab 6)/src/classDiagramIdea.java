import java.util.ArrayList;

class person{
    protected String name;
    protected int Age;
    protected String phoneNo;
    public person(){

    }
    public person(String name,int Age,String phoneNum){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
class Customer1 extends person{
    private boolean isMember;

    public Customer1(){


    }
    public Customer1(String name,int age,String phoneNum,boolean isMember){
        super(name,age,phoneNum);
        this.isMember=isMember;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}
class Staff1 extends person{
    private double salary;

    public Staff1(){

    }
    public Staff1(String name,int Age,String phoneNum,double Salary){
        super(name,Age,phoneNum);
        this.salary=Salary;
    }

    public double getSalary() {
        return salary;
    }
    public void Display(){

    }
}

class Items{
    protected String name;
    protected double prize;

    public Items(){

    }
    public Items(String name,double prize){
        this.name=name;
        this.prize=prize;
    }

    public String getName() {
        return name;
    }
    public double getPrize() {
        return prize;
    }

}
class Mobile1 extends Items{
    private String model;
    public Mobile1(String name,double Prize,String model){
        super(name,Prize);
        this.model=model;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
class Laptop2 extends Items{
    private String generation;
    public Laptop2(String name,double Prize,String generation){
        super(name,Prize);
        this.generation=generation;
    }

    public String getGeneration() {
        return generation;
    }

}
class Cameras1 extends  Items{
    private String model;

    public Cameras1(String name,double Prize ,String model){
        super(name,Prize);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

}
class Bill{
    private double totalBill;

    public Bill(double totalBill){
        this.totalBill=totalBill;
    }
    public double calculateBill(){
        return totalBill;
    }
}


class Shop1 {
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;
    private ArrayList<Staff> staffs;

    public Shop1() {
        this.items = new ArrayList<Item>();
        this.customers = new ArrayList<Customer>();
        this.staffs = new ArrayList<Staff>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void editItem(Item item, double price) {
        item.setPrice(price);
    }

    public void buyItem(Customer customer, Item item) {
        if (customer.isMember()) {
            item.setPrice(item.getPrice() * 0.9); // 10% discount for members
        }
        double totalPrice = item.getPrice();
        System.out.println("Total price: $" + totalPrice);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void assignMembership(Customer customer) {
        customer.setMember(true);
    }

    public void addStaff(Staff staff) {
        staffs.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffs.remove(staff);
    }
}




public class classDiagramIdea {
    public static void main(String[] args) {

    }

}
