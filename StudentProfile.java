import java.util.Scanner;
/* Task 2: Student Profile, */

public class StudentProfile {
    public static void main(String[] args) {

        // variable stuff for the GPA and year of study
        int completedcreds;
        int YearOfStudy;
        double GPA;
        String name;
        Scanner input = new Scanner(System.in);

        // CODE FOR USER TO INPUT THEIR STUFF
        System.out.print("Your Name: "); //Name : string
        name = input.next();
        System.out.print("Year of Study: "); // Year : int
        YearOfStudy = input.nextInt();
        System.out.print("GPA: "); // GPA : double
        GPA = input.nextDouble();
        System.out.print("Credits Completed: "); //Creds : int
        completedcreds = input.nextInt();

        // OUTPUT OF INPUT
        System.out.print("\nName: " +  name + "   Year of Study: " + YearOfStudy + "   GPA:" + GPA);
        System.out.print("\nCredits: " + completedcreds);
    }
}
