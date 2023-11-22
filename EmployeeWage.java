public class EmployeeWage {

    private static Boolean checkAttendance() {
        int empType = (int) (Math.floor(Math.random() * 10) % 2);
        return empType == 1;
    }

    private static int dailyWage(int todayDailyHour) {
        final int DAILY_WAGE_PER_HOUR = 20;
        return DAILY_WAGE_PER_HOUR * todayDailyHour;
    }

    private static int isPartTime() {
        int empType = (int) (Math.floor(Math.random() * 10) % 2);
        return empType;
    }

    public static void main(String[] agrs) {
        System.out.println("Welcome to employee wage computation problem");
        final int FULL_TIME_DAILY_HOUR = 8;
        final int PART_TIME_DAILY_HOUR = 4;
        if(checkAttendance()) {
            System.out.println("Employee is Present");
            switch (isPartTime()) {
                case 0:
                    System.out.println("Daily Wage (Full Time): " + dailyWage(FULL_TIME_DAILY_HOUR));
                    break;
                case 1:
                    System.out.println("Daily Wage (Part Time): " + dailyWage(PART_TIME_DAILY_HOUR));
                    break;
            }
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage: " + 0);
        }
    }
}