class fruit{
    public void show(){
        System.out.println("in fruit Class");
    }

}
class Apple extends fruit {
    public void show() {
        System.out.println("in Apple Class");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //implicit casting
//        fruit f=new Apple();
//        f.show();
//        //explicit casting
//        Apple a=(Apple)f;
//        a.show();

        fruit obj=new Apple();
        fruit obj1=new fruit();
        if(obj1 instanceof Apple){
            obj.show();
        }
        else{
            System.out.println("Not an instance of Apple");
        }
    }
}
