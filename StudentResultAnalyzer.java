import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first score: ");
        int score1 = input.nextInt();

        System.out.print("Enter second score: ");
        int score2 = input.nextInt();

        System.out.print("Enter third score: ");
        int score3 = input.nextInt();

        double average = calculateAverage(score1, score2, score3);
        char grade = determineGrade(average);

        displayReport(score1, score2, score3, average, grade);
    }

    // Method to calculate average
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Method to determine grade
    public static char determineGrade(double average) {
        if (average >= 80) {
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display results
    public static void displayReport(int s1, int s2, int s3, double avg, char grade) {
        System.out.println("\n--- Student Report ---");
        System.out.println("Score 1: " + s1);
        System.out.println("Score 2: " + s2);
        System.out.println("Score 3: " + s3);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
