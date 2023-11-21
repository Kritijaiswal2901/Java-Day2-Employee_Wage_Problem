public class EmpWageBuilderUC6 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WORKING_DAYS_PER_MONTH = 20;
        int MAX_WORKING_HOURS = 100;

        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;

        while (totalHoursWorked < MAX_WORKING_HOURS && totalDaysWorked < WORKING_DAYS_PER_MONTH) {
            int empType = (int) (Math.floor(Math.random() * 10) % 3);
            int hoursWorked = 0;

            if (empType == IS_FULL_TIME) {
                hoursWorked = FULL_DAY_HOURS;
            } else if (empType == IS_PART_TIME) {
                hoursWorked = PART_TIME_HOURS;
            }

            int dailyEarned = EMP_RATE_PER_HOUR * hoursWorked;
            totalWage += dailyEarned;
            totalHoursWorked += hoursWorked;
            totalDaysWorked++;
        }

        System.out.println("Total Monthly Employee Wage: $" + totalWage);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Total Days Worked: " + totalDaysWorked);
    }
}
