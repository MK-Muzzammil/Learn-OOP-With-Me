class objectPass {
    public int value = 5;

    //its without static keyword means it will be called by making object
//    public void increment(objectPass obj){
//        obj.value++;  //increment the value by going to its refrence
//    }
    //its with static keyword means it will be called by class Name like Math class
    public static void increment(objectPass obj){
        obj.value++;
    }


}










public class Activity_1 {
    public static void main(String[] args) {
        objectPass obj1=new objectPass();
        System.out.println("The value of object before calling is "+obj1.value);

        //its without the static keyword we must make object of class
//        objectPass obj2=new objectPass();
//        obj2.increment(obj1);
//        System.out.println(obj2.value);
        //its with static keyword we must use calss name to acces that func and data member
        objectPass.increment(obj1);
        System.out.println("The value after  calling increment meth is "+obj1.value);
    }
}
