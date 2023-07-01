public class EmploeyeRecord_Act_1 {
    private int empId;
    private double salary;

    public EmploeyeRecord_Act_1(){

    }
    public EmploeyeRecord_Act_1(int empId,double salary){
        this.empId=empId;
        this.salary=salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return String.format("%d  %.2f%n",empId,salary);
    }
}
