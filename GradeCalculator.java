import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.println("Enter the number of grades to be entered:");
        int numberOfGrades = scanner.nextInt();
        
        double[] grades = new double[numberOfGrades];
        double sum = 0;
        
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }
        
        double average = sum / numberOfGrades;
        System.out.printf("The average grade is: %.2f%n", average);
        
        scanner.close();
    }
}

