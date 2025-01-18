class Vehicle {
    private String vehicleType;
    private int noOfHours;

    public Vehicle(String vehicleType, int noOfHours) {
        this.vehicleType = vehicleType;
        this.noOfHours = noOfHours;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getNoOfHours() {
        return noOfHours;
    }
}