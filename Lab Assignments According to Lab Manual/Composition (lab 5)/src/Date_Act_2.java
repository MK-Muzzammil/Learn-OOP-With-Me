public class Date_Act_2 {
    private int day;
    private int year;
    private int month;


    public Date_Act_2(){
        day=0;
        year=0;
        month=0;
    }
    public Date_Act_2(int day, int month, int year){
        this.day=checkDay(day);
        this.year=year;
        this.month=checkMonth(month);

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = checkDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = checkMonth(month);
    }

    private int checkMonth(int month){
        if(month >0 && month<=12 ){
            return month;   //valid month
        }
        else{
            return 0;   //means not valid
        }
    }
    private int checkDay(int day){
        int [] noOfDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(day>0 && day<noOfDays[getMonth()]){
            return day;
        }
        if(getMonth()==2 && day==29 &&(getYear()%4==0 && getYear()%100!=0 || getYear()%400==0))
        {
            return day;
        }
        else{
            return 1;//invalid day for maintain object we set it to 1
        }

    }
    public String printToString(){
        return String.format("%d / %d / %d%n ",this.day,this.month,this.year);
    }

}
