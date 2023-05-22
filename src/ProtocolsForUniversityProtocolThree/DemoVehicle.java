package ProtocolsForUniversityProtocolThree;

public class DemoVehicle {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Car", 4,130,5);
        Vehicle car2 = new Vehicle("Car", 4,110,5);
        Vehicle bus1 = new Vehicle("Bus", 6,90,50);
        Vehicle bus2 = new Vehicle("Bus", 6,85,30);
        Vehicle motorcycle = new Vehicle("Motorcycle", 2,200,1);



        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Bus 1: " + bus1);
        System.out.println("Bus 2: " + bus2);
        System.out.println("Motorcycle: " + motorcycle);

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Vehicle("Car", 4, 140, 7);
        vehicles[1] = new Vehicle("Motorcycle", 2, 180, 2);
        vehicles[2] = new Vehicle("Bus", 6, 110, 60);

        System.out.println();

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle type: " + vehicle.getVehicleType());
            System.out.println("Number of tires: " + vehicle.getTiresNumber());
            System.out.println("Average speed: " + vehicle.getAverageSpeed() + " km/h");
            System.out.println("Number of passengers: " + vehicle.getPassengersNumber());
            System.out.println();
        }
    }
}
