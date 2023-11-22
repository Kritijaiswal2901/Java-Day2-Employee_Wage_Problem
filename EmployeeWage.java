public class EmployeeWage {

    private static Boolean checkAttendance() {
        int empType = (int) (Math.floor(Math.random() * 10) % 2);
        return empType == 1;
    }

    private static int dailyWage() {
        final int DAILY_WAGE_PER_HOUR = 20;
        final int TOTAL_DAILY_HOUR = 8;
        return DAILY_WAGE_PER_HOUR * TOTAL_DAILY_HOUR;
    }

    public static void main(String[] agrs) {
        System.out.println("Welcome to employee wage computation problem");
        if(checkAttendance()) {
            System.out.println("Employee is Present");
            System.out.println("Daily Wage: " + dailyWage());
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage: " + 0);
        }
    }
}