public class Student {

    // added instance variable
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    // creating seDetails method
    void setDetails(String name, String courseName) {

        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {

        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {

        System.out.println("Student Name: " + this.name);
        System.out.println("Course Name : " + this.courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + this.completedTopics);

        System.out.println("Questions Solved: " + this.questionsSolved);
    }

    void addTopics(int newTopics) {

        this.completedTopics += newTopics;
        
        System.out.println("Topics updated successfully");
        System.out.println("Total Completed Topics: " + this.completedTopics);
    }

    void addQuestions(int newQuestions) {
        this.questionsSolved += newQuestions;
        System.out.println("Questions updated successfully");
        System.out.println("Total Questions Solved: " + this.questionsSolved);
    }
}