import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String runAgain = "y";
        
        // Do-while loop to run program multiple times
        do {
            System.out.println("===================================");
            System.out.println("    STUDENT GRADE CALCULATOR");
            System.out.println("===================================");
            System.out.println();
            
            // Get student name
            System.out.print("Enter student name: ");
            String studentName = input.nextLine();
            
            // Get number of assignments
            System.out.print("How many assignments? ");
            int numAssignments = input.nextInt();
            
            // Variables to track total
            double totalScore = 0;
            double maxScore = 0;
            
            // Loop to get each assignment score
            for (int i = 1; i <= numAssignments; i++) {
                System.out.print("Enter score for Assignment " + i + ": ");
                double score = input.nextDouble();
                
                System.out.print("Enter max points for Assignment " + i + ": ");
                double max = input.nextDouble();
                
                totalScore += score;
                maxScore += max;
            }
            
            // Calculate percentage
            double percentage = (totalScore / maxScore) * 100;
            
            // Determine letter grade using if-else
            String letterGrade;
            if (percentage >= 90) {
                letterGrade = "A";
            } else if (percentage >= 80) {
                letterGrade = "B";
            } else if (percentage >= 70) {
                letterGrade = "C";
            } else if (percentage >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            
            // Display results
            System.out.println();
            System.out.println("===================================");
            System.out.println("         GRADE REPORT");
            System.out.println("===================================");
            System.out.println("Student: " + studentName);
            System.out.println("Total Score: " + totalScore + " / " + maxScore);
            System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("===================================");
            System.out.println();
            
            // Ask if user wants to run again
            System.out.print("Would you like to calculate another grade? (y/n): ");
            runAgain = input.next().toLowerCase();
            input.nextLine(); // Clear buffer
            System.out.println();
            
        } while (runAgain.equals("y")); // Continue if user enters 'y'
        
        // Exit message
        System.out.println("Thank you for using the Grade Calculator!");
        System.out.println("Program terminated.");
        
        input.close();
    }
}