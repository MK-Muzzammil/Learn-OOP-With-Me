import java.util.Scanner;
class Time{
    private int hour;
    private int min;
    private int sec;

    public void setHour(int hour){
        this.hour=hour;
    }
    public int getHour(){
        return hour;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMin() {
        return min;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }
    public int getSec() {
        return sec;
    }
}
public class GradedTask_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Time t1=new Time();
        System.out.println("Enter hour");
        int hour=sc.nextInt();
        t1.setHour(hour);
        System.out.println("Enter Min");
        int min=sc.nextInt();
        t1.setMin(min);
        System.out.println("Enter sec");
        int sec=sc.nextInt();
        t1.setSec(sec);

        System.out.println("Hour: "+t1.getHour()+" Min : "+t1.getMin()+" Sec: "+t1.getSec());

    }
}
