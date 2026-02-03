import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st score: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd score here: ");
        int num2 =  input.nextInt();
        System.out.println("Enter 3rd score: ");
        int num3 = input.nextInt();
        int prAverage = average(num1, num2, num3);

        char prGrade = get(average(num1, num2, num3));
        System.out.println("Average: " + prAverage);
        System.out.println("Grade: " + prGrade);

    }
    public static int average(int num1, int num2, int num3) {
        int result;
        int total;
        total = num1 + num2 + num3;
        return result = (total) / 3;

    }

    public static char get(double average) {
        char grade;
        if(average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}