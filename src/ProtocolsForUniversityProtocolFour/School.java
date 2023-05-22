package ProtocolsForUniversityProtocolFour;

public class School extends Building {
    private String schoolType;
    private int disciplines;
    private String faculties;

    public School(String buildingType, int numberOfFloors, String address, String city, String region, String country, String schoolType, int disciplines, String faculties) {
        super(buildingType, numberOfFloors, address, city, region, country);
        this.schoolType = schoolType;
        this.disciplines = disciplines;
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Building Type: ").append(getBuildingType()).append("\n");
        sb.append("Address: ").append(getAddress()).append(", ").append(getCity()).append(", ").append(getRegion()).append(", ").append(getCountry()).append("\n");
        sb.append("Number of Floors: ").append(getNumberOfFloors()).append("\n");
        sb.append("School type: ").append(getSchoolType()).append("\n");
        sb.append("Disciplines: ").append(getDisciplines()).append("\n");
        sb.append("faculties: ").append(getFaculties()).append("\n");

        return sb.toString();
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public int getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(int disciplines) {
        this.disciplines = disciplines;
    }

    public String getFaculties() {
        return faculties;
    }

    public void setFaculties(String faculties) {
        this.faculties = faculties;
    }
}

