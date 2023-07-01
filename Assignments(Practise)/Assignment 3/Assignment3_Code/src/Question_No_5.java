class Address {
    private String home;
    private int streetNo;
    private String city;

    public Address(){

    }
    public Address(String home,int streetNo,String city){
        this.home=home;
        this.streetNo=streetNo;
        this.city=city;
    }
    public Address(Address obj){
        this.home=obj.home;
        this.streetNo=obj.streetNo;
        this.city=obj.city;

    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String toString(){
        return String.format("Home : %s  Street # : %d  City : %s%n ",this.home,this.streetNo,this.city);
    }
}
class Person{
    private String firstName;
    private String lastName;

    private Address address;

    public Person(){

    }
    public Person(String firstName,String lastName,Address address){
    this.firstName=firstName;
    this.lastName=lastName;
    this.address=address;

    }
    public void setAddress(Address address){
        this.address=address;
    }
    public Address getAddress(){
        return this.address;
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

    public String toString(){
        return String.format("FirstName : %s LastName : %s%nAddress :%s%n ",this.firstName,this.lastName,address.toString());
    }
    public boolean chechCity(){
        if(address.getCity().equalsIgnoreCase("Islamabad")){
            return true;
        }
        else{
            return false;
        }
    }

}
class Book1{
    private Person author;
    private String bookName;
    private String publisher;
    public Book1(){

    }

    public Book1(Person author, String bookName, String publisher) {
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean checkStreetNo(){
        if(author.getAddress().getStreetNo() < 10){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return  String.format("Book Name : %s Publisher :%s%nAuthor :%s%n",this.bookName,this.publisher,author.toString());
    }


}




public class Question_No_5 {
    public static void main(String[] args) {
        Address address=new Address("Hello",12,"Faislaabd ");
        Person person=new Person("Muhammad ","Muzzammil",address);
        Book1 book=new Book1(person,"Physics","Muzzamil");
        Address address1=new Address("Hey",9,"Faislaabad ");
        book.getAuthor().setAddress(address1);


        System.out.println(  book.checkStreetNo());

        System.out.println(book.toString());
    }


}
