public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.initSlots();
        Car c1 = new car("DL6A5757", "Nikhil");
        Ticket t1 = parkingLot.park(c1);
        System.out.println(t1);
    }
}