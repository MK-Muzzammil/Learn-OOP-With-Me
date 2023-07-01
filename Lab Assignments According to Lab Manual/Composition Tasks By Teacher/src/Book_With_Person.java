public class Book_With_Person {
    private Person_Address_Ex_2 author;
    private String bookName;
    private String publisher;


    public Book_With_Person(){

    }
    public Book_With_Person(String bookName,String publisher,Person_Address_Ex_2 author)
    {
        this.bookName=bookName;
        this.publisher=publisher;
        this.author=author;
    }

    public Person_Address_Ex_2 getAuthor() {
        return author;
    }

    public void setAuthor(Person_Address_Ex_2 author) {
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
    public String toString(){
        return String.format("Book Name :%s Publisher : %s%nAuthorInfo:%s%n",this.bookName,this.publisher,author.toString());
    }

    public static void main(String[] args) {

       Person_Address_Ex_2 p2=new Person_Address_Ex_2("Muzzammil","03013514508",new Address_Ex_2(1,2,"Faisalabad",123));
        Address_Ex_2 a=new Address_Ex_2(23,24,"Faislabad",12321);
//        Person_Address_Ex_2 p3=new Person_Address_Ex_2("Muzzammil","03013514508",a);
        Book_With_Person b1=new Book_With_Person("Zohaib","Ali",p2);
//        Book_With_Person b=new Book_With_Person();
        b1.getAuthor().setAddress(a);
        System.out.println(b1.toString());
    }
}
