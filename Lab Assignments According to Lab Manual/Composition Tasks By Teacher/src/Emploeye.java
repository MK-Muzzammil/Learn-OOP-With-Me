public class Emploeye {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Emploeye(){
        //Way 1 to set the value of imported class Date in the Data member
        firstName=null;
        lastName=null;
        birthDate=new Date();
        hireDate=new Date();
    }
    public Emploeye(String firstName,String lastName,Date birthDate,Date hireDate){
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String printEmploeye(){
        return String.format("Name = %s %s%n Birth Date = %s Hire Date =%s ",this.firstName,this.lastName,birthDate.printToString(),hireDate.printToString());
    }

    public static void main(String[] args) {
        Date d1=new Date(12,3,2003);
        Date d2=new Date(13,4,2012);

        Emploeye muzamil=new Emploeye("Muhammad","Muzzammil",d1,d2);
        System.out.println(muzamil.printEmploeye());
    }
}
