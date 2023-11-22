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

    private static int monthlyWage(int dailyWage) {
        final int NO_OF_DAYS = 20;
        return NO_OF_DAYS * dailyWage;
    }

    public static void main(String[] agrs) {
        System.out.println("Welcome to employee wage computation problem");
        final int FULL_TIME_DAILY_HOUR = 8;
        final int PART_TIME_DAILY_HOUR = 4;
        if(checkAttendance()) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        
        if(isPartTime() == 0) {
            System.out.println("Daily Wage (Full Time): " + dailyWage(FULL_TIME_DAILY_HOUR));
            System.out.println("Monthly Wage (Full Time): " + monthlyWage(dailyWage(FULL_TIME_DAILY_HOUR)));
        } else {
            System.out.println("Daily Wage (Part Time): " + dailyWage(PART_TIME_DAILY_HOUR));
            System.out.println("Monthly Wage (Part Time): " + monthlyWage(dailyWage(PART_TIME_DAILY_HOUR)));
        }

        int totalHours = 8;
        int totalDays = 0;
        int totalWage = 0;

        while(totalDays < 20 && totalHours < 100) {
            if(isPartTime() == 0) {
                totalHours += FULL_TIME_DAILY_HOUR;
                totalWage += dailyWage(FULL_TIME_DAILY_HOUR);
            } else {
                totalHours += PART_TIME_DAILY_HOUR;
                totalWage += dailyWage(PART_TIME_DAILY_HOUR);
            }
            totalDays++;
        }

        System.out.println("Total Wage Until 100 Hours or 20 Days: " + totalWage);
    }
}