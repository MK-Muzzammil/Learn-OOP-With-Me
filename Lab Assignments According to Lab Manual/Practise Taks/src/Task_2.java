class Date{
    public String month;
    public int day;
    public int Year;

    public void display(){
        System.out.println("Month : "+this.month +" Day : "+day +" Year : "+Year);
    }
}
public class Task_2 {
    public static void main(String[] args) {
        Date date1=new Date();
        date1.month="July";
        date1.day=12;
        date1.Year=2023;

        date1.display();

        Date date2=new Date();
        date2.month="September";
        date2.day=14;
        date2.Year=2001;
        date2.display();


    }
}
