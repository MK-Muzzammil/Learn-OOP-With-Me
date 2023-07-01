

public class Manager{
    private String title;
    private double dues;
    private StudentRecord_Act_1 stdrecord;
    private EmploeyeRecord_Act_1 emploeyeRecord;


    public Manager(){

    }
    public Manager(String title,double dues,StudentRecord_Act_1 obj,EmploeyeRecord_Act_1 empRec){
        this.title=title;
        this.dues=dues;
        this.stdrecord=obj;
        this.emploeyeRecord=empRec;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDues() {
        return dues;
    }

    public void setDues(double dues) {
        this.dues = dues;
    }

    public StudentRecord_Act_1 getStdrecord() {
        return stdrecord;
    }

    public void setStdrecord(StudentRecord_Act_1 stdrecord) {
        this.stdrecord = stdrecord;
    }

    public EmploeyeRecord_Act_1 getEmploeyeRecord() {
        return emploeyeRecord;
    }

    public void setEmploeyeRecord(EmploeyeRecord_Act_1 emploeyeRecord) {
        this.emploeyeRecord = emploeyeRecord;
    }
    public void Display(){
        System.out.println("Tittle = "+title+" Dues = "+dues);
        System.out.println("Student Record = "+ stdrecord.toString());
        System.out.println("Emploeye Record = "+emploeyeRecord.toString());

    }

    public static void main(String[] args) {
        StudentRecord_Act_1 obj=new StudentRecord_Act_1("MBA");
        EmploeyeRecord_Act_1 emp1=new EmploeyeRecord_Act_1(1,1200);
        Manager manager1=new Manager("hello",12112,obj,emp1);
        manager1.Display();
    }


}

