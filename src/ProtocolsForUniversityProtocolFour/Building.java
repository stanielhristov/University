package ProtocolsForUniversityProtocolFour;
public class Building {
    private String buildingType;
    private int numberOfFloors;
    private String address;
    private String city;
    private String region;
    private String country;

    public Building(String buildingType, int numberOfFloors, String address, String city, String region, String country) {
        this.buildingType = buildingType;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
        this.city = city;
        this.region = region;
        this.country = country;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

}

