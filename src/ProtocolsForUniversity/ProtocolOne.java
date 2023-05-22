package ProtocolsForUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProtocolOne {
    static int sumStudentNumber = 25;
    // 33829 = 3 + 3 + 8 + 2 + 9 = 25
    static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    static final List<String> OBJECTS = List.of("OOP","PIWE","DCD","MT","OS");
    //PIWE - Programming in web environment
    //DCD - Digital circuit design
    //MT - Microprocessor technology
    //OS - Operating systems
    static final int COLUMNS = 4;

    public static void main(String[] args) {

        int rows = DAYS.length;
        int[][] matrix = new int[rows][COLUMNS];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(sumStudentNumber, sumStudentNumber + 10);
            }
        }
        System.out.print("      ");

        for (String Object : OBJECTS) {
            System.out.print(Object + "  ");
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(DAYS[i] + ":   ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "     ");
            }

            System.out.println();
        }
        System.out.println("------------------------------------------------------");

        sumOfAllStudentsEveryDay(matrix);

        System.out.println("------------------------------------------------------");

        averagePerDay(matrix);

        System.out.println("------------------------------------------------------");

        highestAttendance(matrix);

        lowestAttendance(matrix);

    }

    private static void averagePerDay(int[][] matrix) {
        System.out.println("Average attendance per day is:");
        for (int i = 0; i < matrix.length; i++) {
            double averageSum = 0;
            System.out.print(DAYS[i] + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                averageSum += matrix[i][j];
            }
            System.out.printf("%.2f", averageSum / 4);
            System.out.println();
        }
    }
    private static void sumOfAllStudentsEveryDay(int[][] matrix) {
        System.out.println("Sum of all students per day is:");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            System.out.print(DAYS[i] + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
    }
    private static void highestAttendance(int[][] matrix) {
        int maximumStudents = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (maximumStudents < sum){
                    maximumStudents = sum;
                    index = i;
                }
            }
        }
        System.out.println("Highest attendance day is " + DAYS[index] + ": " + maximumStudents);
    }
    private static void lowestAttendance(int[][] matrix) {
        List<Integer> hours = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            hours.add(sum);
        }
        int minimumStudents = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < hours.size(); i++) {
            if (minimumStudents > hours.get(i)) {
                minimumStudents = hours.get(i);
                index = i;
            }
        }
        System.out.println("Lowest attendance day is " + DAYS[index] + ": " + minimumStudents);
    }
}