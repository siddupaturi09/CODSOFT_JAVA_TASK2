import java.util.Scanner;
class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;
        int[] subjectMarks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
            totalMarks += subjectMarks[i];
        }
        System.out.println("\n");
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        String grade = calculateGrade(averagePercentage);
        System.out.println("Total Marks secured: " + totalMarks+"/"+numSubjects*100);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade obtained: " + grade);

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage)
    {
        if (averagePercentage >= 90 && averagePercentage<=100)
        {
            return "A+";
        }
        else if (averagePercentage >= 80)
        {
            return "A";
        }
        else if (averagePercentage >= 70)
        {
            return "B";
        }
        else if (averagePercentage >= 60)
        {
            return "C";
        }
        else if (averagePercentage >= 50)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}
