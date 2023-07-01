public class Person_with_Address1 {
    private String firstName;
    private  String lastName;
    Address1 residencialAddress;
    Address1 officialAddress;

    public Person_with_Address1(){

    }
    public Person_with_Address1(String firstName,String lastName,Address1 residencialAddress,Address1 officialAddress){
        this.firstName=firstName;
        this.lastName=lastName;
        this.residencialAddress=residencialAddress;
        this.officialAddress=officialAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setResidencialAddress(Address1 residencialAddress){
        this.residencialAddress=residencialAddress;
    }
    public Address1 getResidencialAddress(){
        return this.residencialAddress;
    }

    public Address1 getOfficialAddress() {
        return officialAddress;
    }

    public void setOfficialAddress(Address1 officialAddress) {
        this.officialAddress = officialAddress;
    }

    public String toString(){
        return  String.format("%s %s%nResidencial Address:%s%nOfficial Address:%s%n",this.firstName,this.lastName,this.residencialAddress.toString(),this.officialAddress.toString());
    }

    public static void main(String[] args) {
        Address1 add1=new Address1(12,3,"Noorpur","Faisalabad","Pakistan");
        Address1 add2=new Address1(13,4,"Milat Road","Faisalabd","Pakistan");
        Person_with_Address1 p1=new Person_with_Address1("Muhammad"," Muzzammil",add1,add2);
        System.out.println(p1.toString());


    }
}


