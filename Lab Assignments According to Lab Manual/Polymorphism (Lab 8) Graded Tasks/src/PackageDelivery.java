class Package{
    protected String senderName;
    protected String senderAdress;
    protected String recipientName;
    protected String recipientAddress;
    protected double weight;
    protected double costPerOunce;


    public Package(){

    }

    public Package(String senderName, String senderAdress, String recipientName, String recipientAddress, double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAdress = senderAdress;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAdress() {
        return senderAdress;
    }

    public void setSenderAdress(String senderAdress) {
        this.senderAdress = senderAdress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        this.costPerOunce = costPerOunce;
    }

    public double calCost() {
        return this.weight * this.costPerOunce;
    }
}
class TwoDayPackage extends Package{
    private double flatFee;

    public TwoDayPackage(){

    }
    public TwoDayPackage(String senderName, String senderAdress, String recipientName, String recipientAddress, double weight, double costPerOunce,double flatFee){
        super(senderName,senderAdress,recipientName,recipientAddress,weight,costPerOunce);
        this.flatFee=flatFee;
    }

    public double calCost(){
        return super.calCost()+this.flatFee;
    }
    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }
    public double getFlatFee() {
        return flatFee;
    }


}
class OverNightPackage extends Package{
    private double additionalFee;

    public OverNightPackage(){

    }
    public OverNightPackage(String senderName, String senderAdress, String recipientName, String recipientAddress, double weight, double costPerOunce,double additionalFee){
        super(senderName,senderAdress,recipientName,recipientAddress,weight,costPerOunce);
        this.additionalFee=additionalFee;

    }

    public double getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }
    public double calCost(){
        return super.calCost() + this.additionalFee;
    }
}
public class PackageDelivery {
    public static void main(String[] args) {
        Package p1=new Package("hello","123","Hey","234",34.5,0.5);
    
       Package p2=new TwoDayPackage("hello","123","Hey","234",34.5,0.5,12.3);
       System.out.println( p2.calCost());
     
       Package p3=new OverNightPackage();
       System.out.println( p3.calCost());



    }

}
