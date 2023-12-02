package variables;

public class School {

    int classroomQuantity = 10;
    int studentQuantity = 86;
    int teacherQuantity = 14;
    double teacherSalaryAve = 70_000.0;
    double expenditureAnnualTotal = 1_206_724.86;
    double budgetTotal = 1_500_000.0;
    String name = "Red Mountain High School";
    boolean isAccredited = true;

    // Methods
    public int studentsPerClassroom() {
        return Math.round( (float) studentQuantity / classroomQuantity);
    }

    public double costPerStudent() {
        double expenditureTeacher = teacherQuantity * teacherSalaryAve;
        double expenditureStudent = expenditureAnnualTotal - expenditureTeacher;
        return expenditureStudent / studentQuantity;
    }

    public double costPerClassroom() {
        return studentsPerClassroom() * costPerStudent();
    }

    public boolean isWithinBudget() {
        return budgetTotal > expenditureAnnualTotal;
    }

    public double roundToNearestCent(double value) {
        int numPennies = (int) (value * 100);
        return numPennies / 100.0;
    }

    public void main() {

        System.out.println("Students per classroom: " + studentsPerClassroom());
        System.out.println("Cost per student: " + roundToNearestCent(costPerStudent()));
        System.out.println("Cost per classroom: " + roundToNearestCent(costPerClassroom()));
    }
}
