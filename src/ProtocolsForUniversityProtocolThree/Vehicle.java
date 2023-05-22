package ProtocolsForUniversityProtocolThree;

public class Vehicle {
    private String vehicleType;
    private int tiresNumber;
    private int averageSpeed;
    private int passengersNumber;

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Type: " + vehicleType + ", Tires number: " + tiresNumber +
                ", Average speed: " + averageSpeed + ", Number of passengers: " + passengersNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getTiresNumber() {
        return tiresNumber;
    }

    public void setTiresNumber(int tiresNumber) {
        this.tiresNumber = tiresNumber;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public Vehicle(String vehicleType, int tiresNumber, int averageSpeed, int passengersNumber) {
        this.vehicleType = vehicleType;
        this.tiresNumber = tiresNumber;
        this.averageSpeed = averageSpeed;
        this.passengersNumber = passengersNumber;
    }
}
