public class Address1 {
    private int houseNo;
    private int streetNo;
    private String townName;
    private String cityName;
    private String stateName;


    public Address1(){
        houseNo=0;
        streetNo=0;
        townName=null;
        cityName=null;
        stateName=null;
    }
    public Address1(int houseNo,int streetNo,String townName,String cityName,String stateName){
        this.houseNo=houseNo;
        this.streetNo=streetNo;
        this.townName=townName;
        this.cityName=cityName;
        this.stateName=stateName;
    }
    public void setHouseNo(int houseNo){
        this.houseNo=houseNo;
    }
    public int getHouseNo(){
        return houseNo;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public String toString(){
        return String.format("House # %d Street No %d %s %s %s ",this.houseNo,this.streetNo,this.townName,this.cityName,this.stateName);
    }
}
