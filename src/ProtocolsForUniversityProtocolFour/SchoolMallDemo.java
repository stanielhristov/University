package ProtocolsForUniversityProtocolFour;

public class SchoolMallDemo {
    public static void main(String[] args) {
        Building[] buildings = new Building[4];

        buildings[0] = new School("School", 3, "123 Main St", "New York", "NY", "USA", "High School", 10, "Math, Science, Literature");
        buildings[1] = new School("School", 2, "456 Elm St", "Los Angeles", "CA", "USA", "Elementary School", 6, "Reading, Writing, Arithmetic");
        buildings[2] = new Mall("Mall", 5, "789 Oak St", "Chicago", "IL", "USA", 50, 3);
        buildings[3] = new Mall("Mall", 4, "101 Pine St", "Miami", "FL", "USA", 30, 2);

        for (Building building : buildings) {
            System.out.println(building);
        }
    }
}