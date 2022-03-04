import java.util.Scanner;
public class Grades {

    public static void main(String[] args)
    {
        int  score;    // To hold a test score
        char grade = 0;    // To hold a letter grade

        //  read input.
        Scanner console = new Scanner(System.in);

        // Get the test score.
        System.out.print("Enter your numeric test score : ");
        score = console.nextInt();

        // Calculate the grade.
        if (score >= 90)
        {
            grade = 'A';
        }
        else if (score >= 80)
        {
            grade = 'B';
        }
        else if (score >= 70)
        {
            grade = 'C';
        }
        else if (score >= 60)
        {
            grade = 'D';
        }
        else if (score > 60)
        {
            grade = 'F';
        }
        else
        {
            System.out.println("Not in range");
        }

        // Display the grade.
        System.out.println("Your grade is " + grade);
    }

}
