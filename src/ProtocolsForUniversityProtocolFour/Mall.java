package ProtocolsForUniversityProtocolFour;

public class Mall extends Building {
    private int numberOfShops;
    private int floorsCount;

    public Mall(String buildingType, int numberOfFloors, String address, String city, String region, String country, int numberOfShops, int floorsCount) {
        super(buildingType, numberOfFloors, address, city, region, country);
        this.numberOfShops = numberOfShops;
        this.floorsCount = floorsCount;
    }

    public int getNumberOfShops() {
        return numberOfShops;
    }

    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public int getFloorsCount() {
        return floorsCount;
    }

    public void setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Building Type: ").append(getBuildingType()).append("\n");
        sb.append("Address: ").append(getAddress()).append(", ").append(getCity()).append(", ").append(getRegion()).append(", ").append(getCountry()).append("\n");
        sb.append("Number of floors: ").append(getNumberOfFloors()).append("\n");
        sb.append("Number of shops: ").append(getNumberOfShops()).append("\n");
        sb.append("Floors count: ").append(getFloorsCount()).append("\n");
        return sb.toString();
    }
}