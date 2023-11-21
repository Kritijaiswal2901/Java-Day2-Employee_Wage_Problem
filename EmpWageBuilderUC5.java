public class EmpWageBuilderUC5 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WORKING_DAYS_PER_MONTH = 20;

        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empType = (int) (Math.floor(Math.random() * 10) % 3);
            int dailyWage = 0;

            if (empType == IS_FULL_TIME) {
                dailyWage = EMP_RATE_PER_HOUR * FULL_DAY_HOURS;
            } else if (empType == IS_PART_TIME) {
                dailyWage = EMP_RATE_PER_HOUR * PART_TIME_HOURS;
            }

            totalWage += dailyWage;
        }

        System.out.println("Total Monthly Employee Wage: $" + totalWage);
    }
}
