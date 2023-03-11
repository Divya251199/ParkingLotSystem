public abstract class Vehicle {
    private String ownerName;
    private String number;
    int parkingPrice;

    public Vehicle(String vehicleNo, String ownerName) {
        this.number = number;
        this.ownerName = ownerName;
    }


    public String getNumber() {
        return this.number;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
}
