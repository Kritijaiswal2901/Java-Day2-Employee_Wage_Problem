public class EmpWageBuilderUC4 {
    public static void main(String[] args) {
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;

        int empType = (int) (Math.floor(Math.random() * 10) % 3);
        int dailyWage = 0;

        switch (empType) {
            case IS_FULL_TIME:
                dailyWage = EMP_RATE_PER_HOUR * FULL_DAY_HOURS;
                System.out.println("Employee is Full Time.");
                break;
            case IS_PART_TIME:
                dailyWage = EMP_RATE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Employee is Part Time.");
                break;
            default:
                System.out.println("Employee is Absent.");
                break;
        }

        System.out.println("Daily Employee Wage: $" + dailyWage);
    }
}
