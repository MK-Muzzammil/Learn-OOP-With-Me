class Simple{
    protected double num1;
    protected double num2;

    public Simple(){

    }
    public Simple(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }


    public void add(){
        System.out.println(this.num1+"+"+this.num2 +" = "+(this.num1+this.num2));
    }
    public void sub(){
        System.out.println(num1+"-"+num2 +" = "+(num1-num2));
    }
    public void mul(){
        System.out.println(num1+"*"+num2 +" = "+(num1*num2));
    }
    public void div(){
        if(num2==0){
            System.out.println("Math error occured");
        }
        else{
            System.out.println(num1+"/"+num2 +" = "+(num1/num2));
        }
    }
}
class VeififedSimple extends Simple{
    public VeififedSimple(){

    }
    public VeififedSimple(int num1,int num2){
        super(num1,num2);
    }
    @Override
    public void add(){
        if(num1>0 && num2>0){
            super.add();
        }
        else{
            System.out.println("Error ");
        }
    }
    @Override
    public void sub(){
        if(num1>0 && num2>0){
            super.sub();
        }
        else{
            System.out.println("Error");
        }
    }
    @Override
    public void mul(){
        if(num1>0 && num2>0){
            super.mul();
        }
        else{
            System.out.println("Error");
        }
    }
    @Override
    public void div(){
        if(num1>0 && num2>0){
            super.div();
        }
        else{
            System.out.println("Error");
        }
    }

}







public class Lab_Task_2 {
    public static void main(String[] args) {
        VeififedSimple v=new VeififedSimple(2,3);
        v.add();
        v.sub();
    }
}
