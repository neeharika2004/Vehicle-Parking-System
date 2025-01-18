public class ParkingInspector {
    boolean parkableVehicle=false;
    public void checkParkingAvailability(Vehicle vehicle) {
        if (vehicle.getVehicleType().equals("Tractor") || vehicle.getVehicleType().equals("Cart") || vehicle.getVehicleType().equals("Airplane")  || vehicle.getVehicleType().equals("Bus")) {
            System.out.println("Parking not allowed for " + vehicle.getVehicleType());
        } else {
            System.out.println("Parking allowed for " + vehicle.getVehicleType());
            parkableVehicle=true;
        }
    }

    public void calculateCost(Vehicle vehicle) {
        if (parkableVehicle) {
            parkableVehicle=false;
            System.out.println("Cost for " + vehicle.getVehicleType()+": " + (vehicle.getNoOfHours() * 50)+"/-");
        }
        else{
            System.out.println("Since the vehicle is not parkable, there is no cost.");
        }
    }
}