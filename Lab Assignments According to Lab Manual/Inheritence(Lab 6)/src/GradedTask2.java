class Publication{
    protected String title;
    protected int prize;

    public Publication(){

    }
    public Publication(String tile,int prize){
        this.title=tile;
        this.prize=prize;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void Display(){
        System.out.println("Title : "+this.title + " prize : "+this.prize+" Rs");
    }
}
class Book extends Publication{
    private int pageNumber;


    public Book(){
        super();
    }
    public Book(String tile ,int prize ,int pageNumber){
        super(tile,prize);
        this.pageNumber=pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public void Display(){
        super.Display();
        System.out.println("Page Number Count : "+this.pageNumber);
    }
}
class Tape extends Publication{
    private int playMinutes;

    public Tape(){
        super();
    }
    public Tape(String title , int prize,int playMinutes){
        super(title,prize);
        this.playMinutes=playMinutes;
    }
    public void Display(){
        super.Display();
        System.out.println("Playing Minutes : "+this.playMinutes+" mins");
    }
}

public class GradedTask2 {
    public static void main(String[] args) {
    Book b1=new Book("Mr Chips ",1000,316);
    b1.Display();

    Tape t1=new Tape("Kamli Wala Muhammad ",250,10);
    t1.Display();
    }
}
