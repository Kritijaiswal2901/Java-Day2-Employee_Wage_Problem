public class EmpWageBuilderUC2 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            int dailyWage = EMP_RATE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Present.");
            System.out.println("Daily Employee Wage: $" + dailyWage);
        } else {
            System.out.println("Employee is Absent.");
            System.out.println("Daily Employee Wage: $0");
        }
    }
}
