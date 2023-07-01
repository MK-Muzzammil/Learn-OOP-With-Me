public class Emploeye_Act_2 {
    private String firstName;
    private String lastName;
    private Date_Act_2 birthDate;
    private Date_Act_2 hireDate;

    public Emploeye_Act_2(){
        //Way 1 to set the value of imported class Date in the Data member
        firstName=null;
        lastName=null;
        birthDate=new Date_Act_2();
        hireDate=new Date_Act_2();
    }
    public Emploeye_Act_2(String firstName,String lastName,Date_Act_2 birthDate,Date_Act_2 hireDate){
        //Way 2 to set the value of imported class Date in the Data member
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.hireDate=hireDate;
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

    public Date_Act_2 getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date_Act_2 birthDate) {
        this.birthDate = birthDate;
    }

    public Date_Act_2 getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date_Act_2 hireDate) {
        this.hireDate = hireDate;
    }
    public String printEmploeye(){
        return String.format("Name = %s %s%n Birth Date = %s Hire Date =%s ",this.firstName,this.lastName,birthDate.printToString(),hireDate.printToString());
    }

    public static void main(String[] args) {
        Date_Act_2 d1=new Date_Act_2(12,3,2003);
        Date_Act_2 d2=new Date_Act_2(13,4,2012);

        Emploeye_Act_2 muzamil=new Emploeye_Act_2("Muhammad","Muzzammil",d1,d2);
        System.out.println(muzamil.printEmploeye());
    }
}
