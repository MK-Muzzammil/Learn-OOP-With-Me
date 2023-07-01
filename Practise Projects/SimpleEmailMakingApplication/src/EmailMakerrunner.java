public class EmailMakerrunner {
    public static void main(String[] args) {
        Emailmaker em1=new Emailmaker("Muhammad ","Muzzammil");
        em1.setMailboxCapacity(12);
        System.out.println(em1.ShowInfo());
    }
}
