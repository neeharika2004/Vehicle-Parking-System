public class ParkingSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Car", 4);
        Vehicle vehicle2 = new Vehicle("Cart", 3);
        
        ParkingInspector parkingInspection1=new ParkingInspector();
        parkingInspection1.checkParkingAvailability(vehicle1);
        parkingInspection1.calculateCost(vehicle1);
        
        System.out.println();
        
        ParkingInspector parkingInspection2=new ParkingInspector();
        parkingInspection2.checkParkingAvailability(vehicle2);
        parkingInspection2.calculateCost(vehicle2);
    }       
}