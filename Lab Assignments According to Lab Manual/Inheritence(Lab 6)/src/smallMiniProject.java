import java.util.ArrayList;
abstract class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Mobile extends Item {
    private String brand;

    public Mobile(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Laptop1 extends Item {
    private String model;

    public Laptop1(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Camera extends Item {
    private String type;

    public Camera(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Customer {
    private String name;
    private boolean isMember;

    public Customer(String name) {
        this.name = name;
        this.isMember = false;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}

class Staff {
    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

class Shop {
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;
    private ArrayList<Staff> staffs;

    public Shop() {
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

public class smallMiniProject {
    public static void main(String[] args) {
        Shop s=new Shop();
        s.addCustomer(new Customer("Muzamil"));
        s.assignMembership(new Customer("Muzamil"));

    }
}
