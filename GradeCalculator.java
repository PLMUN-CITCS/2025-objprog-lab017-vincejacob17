import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
       
        double score = getStudentScore();

       
        String grade = calculateGrade(score);

      
        System.out.println("The grade for a score of " + score + " is: " + grade);
    }

    
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;

       
        System.out.print("Please enter the student's score: ");

       
        while (true) {
            try {
             
                score = Double.parseDouble(scanner.nextLine());

               
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input. Please enter a score between 0 and 100.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numerical score.");
            }
        }

        return score;
    }

    
    public static String calculateGrade(double score) {
        
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
