public class Person_Address_Ex_2 {
    private String name;
    private String PhoneNo;
    Address_Ex_2  address;

    public Person_Address_Ex_2(){

    }
    public Person_Address_Ex_2(String name, String phoneNo, Address_Ex_2 address) {
        this.name = name;
        PhoneNo = phoneNo;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public Address_Ex_2 getAddress() {
        return address;
    }

    public void setAddress(Address_Ex_2 address) {
        this.address = address;
    }
    public String toString(){
        return String.format("Name = %s Contact #%s%nAddress = %s",this.name,this.PhoneNo,address.toString());
    }

//    public static void main(String[] args) {
//        Address_Ex_2 add1=new Address_Ex_2(12,1,"Faislaabad",123);
//        Person_Address_Ex_2 p1=new Person_Address_Ex_2("Muzzammil","03013514508",add1);
//
//        System.out.println( p1.toString());
//
//
//    }


}
