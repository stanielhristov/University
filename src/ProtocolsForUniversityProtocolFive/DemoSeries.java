package ProtocolsForUniversityProtocolFive;

public class DemoSeries {
    public static final int FACULTY_NUMBER = 33829;

    public static void main(String[] args) {

        seriesByC1 seriesByC1 = new seriesByC1();
        SeriesByC2 seriesByC2 = new SeriesByC2();
        seriesByC1.setStart(9);
        seriesByC2.setStart(9);

        for (int i = 1; i <= 5; i++) {
            System.out.println(seriesByC1.getNext());
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println(seriesByC2.getNext());
        }

        System.out.println();

        seriesByC1.reset();

        for (int i = 1; i <= 5; i++) {
            System.out.println(seriesByC1.getNext());
        }
    }
}