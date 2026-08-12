import java.util.Scanner;

public class StudentExpense {

    // Instance Variables
    String studentName;
    double dailyBudget;
    double foodExpense;
    double travelExpense;
    double studyExpense;
    double otherExpense;

    public double calculateTotalExpense() {
        return foodExpense + travelExpense + studyExpense + otherExpense;
    }

    public double calculateRemainingAmount() {
        return dailyBudget - calculateTotalExpense();
    }

    public boolean isWithinBudget() {
        return calculateTotalExpense() <= dailyBudget;
    }

    public double calculateExceededAmount() {
        if (calculateTotalExpense() > dailyBudget) {
            return calculateTotalExpense() - dailyBudget;
        }
        return 0.0;
    }

    public String getBudgetStatus() {
        double totalExpense = calculateTotalExpense();
        if (totalExpense < dailyBudget) {
            return "Within Budget";
        } else if (totalExpense == dailyBudget) {
            return "Budget Fully Used";
        } else {
            return "Budget Exceeded";
        }
    }

    // Main Method Requirements
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);      
          
        StudentExpense student = new StudentExpense();

        scanner.close();
    }
}