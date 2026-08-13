import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("""
                ============================
                STUDENT PRACTICE TRACKER
                ============================
                """);
        System.out.println();

        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();


        System.out.println();
        System.out.println("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.println();
        System.out.println("Enter Completed Topics: ");
        int completedTopics = scanner.nextInt();

        System.out.println();
        System.out.println("Enter Questions Solved: ");
        int questionsSolved = scanner.nextInt();

        System.out.println();
        student.setDetails(name, courseName);
        student.setProgress(completedTopics, questionsSolved);

        boolean keepRunning = true;

        System.out.println();
        while (keepRunning) {
            
            
            System.out.println
            ("""
                ============================
                    MENU
                ============================
                1. View Student Details
                2. View Progress
                3. Add Completed Topics
                4. Add Solved Questions
                5. Exit
            """);
            


            System.out.println();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            // choice logic
            if (choice == 1) {
                System.out.println();
                student.displayDetails();
            } 

            else if (choice == 2) {
                System.out.println();
                student.displayProgress();
            } 

            else if (choice == 3) {
                System.out.println();

                System.out.println("Enter New Completed Topics: ");
                int newTopics = scanner.nextInt();

                System.out.println();
                student.addTopics(newTopics);
            } 

            else if (choice == 4) {
                System.out.println();

                System.out.println("Enter New Questions Solved: ");
                int newQuestions = scanner.nextInt();

                System.out.println();

                student.addQuestions(newQuestions);
            } 

            else if (choice == 5) {
                System.out.println();
                System.out.println("Thank you for using Student Practice Tracker");
                System.out.println("Keep Practicing!");
                keepRunning = false;
            } 

            else {
                System.out.println("Invalid choice");
                System.out.println("Please enter a value between 1 and 5");
            }
        }
        
        scanner.close();
    }
}