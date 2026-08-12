import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("============================");
        System.out.println("  STUDENT PRACTICE TRACKER");
        System.out.println("============================");
        System.out.println();

        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();


        System.out.println();
        System.out.println("Enter Course Name:");
        String courseName = scanner.nextLine();

        System.out.println();
        System.out.println("Enter Completed Topics:");
        int completedTopics = scanner.nextInt();

        System.out.println();
        System.out.println("Enter Questions Solved:");
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
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

        }
        
        scanner.close();
    }
}