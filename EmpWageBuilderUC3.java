public class EmpWageBuilderUC3 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        int dailyWage = 0;

        if (empCheck == IS_FULL_TIME) {
            dailyWage = EMP_RATE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Employee is Full Time.");
        } else if (empCheck == IS_PART_TIME) {
            dailyWage = EMP_RATE_PER_HOUR * PART_TIME_HOURS;
            System.out.println("Employee is Part Time.");
        } else {
            System.out.println("Employee is Absent.");
        }

        System.out.println("Daily Employee Wage: $" + dailyWage);
    }
}
