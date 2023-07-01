final class Address1{
    private final int houseNo;
    private final int street;
    private  final String city;


    public int getHouseNo() {
        return houseNo;
    }

    public int getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Address1(){
        houseNo=0;
        street=0;
        city=null;
    }

    public Address1(int houseNo, int street, String city) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
    }

    public String toString(){
        return String.format("House No: %d  Street NO %d  City : %s ",this.houseNo,this.street,this.city);
    }
}



final class Person1{
    private final String name;
    private final int age;
    private final Address1 adrs;

    public Person1(){
        name=null;
        age=0;
        adrs=null;

    }
    public Person1(String name,int age,Address1 adrs){
        this.name=name;
        this.age=age;
        this.adrs=adrs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address1 getAdrs() {
        return adrs;
//        return new Address1(adrs.getHouseNo(),adrs.getStreet(),adrs.getCity());

    }
    public String toString(){
        return adrs.toString() +"Name "+this.name+"Age :"+this.age;
    }

}


public class Test{
    public static void main(String[] args) {
        Address1 a1=new Address1(1,2,"Isb");
        Person1 p=new Person1("Mzum",17,a1);
        System.out.println( a1.toString());
//        Address1 ad=p.getAdrs();

    }
}