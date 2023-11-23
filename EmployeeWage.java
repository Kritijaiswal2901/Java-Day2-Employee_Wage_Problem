class EmployeeWageCom {
   
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
     public static final int ABSENT = 0;

    static int EmployeeType() {
        double randomNumber = Math.random();
        if (randomNumber < 0.2)
            return ABSENT;
        else if (randomNumber < 0.66)
            return PART_TIME;
        else
            return FULL_TIME;
    }
}

class WageCalculator {
    private static final int DAILY_WAGE_PER_HOUR = 20;
    private static final int FULL_TIME_DAILY_HOUR = 8;
    private static final int PART_TIME_DAILY_HOUR = 4;
    private static final int NO_OF_DAYS = 20;

    private static int DailyWage(int hours) {
        return DAILY_WAGE_PER_HOUR * hours;
    }

     static int TotalWage() {
        int totalWage = 0;
        for (int day = 0; day < NO_OF_DAYS; day++) {
            int employeeType = EmployeeWageCom.EmployeeType();
            switch (employeeType) {
                case EmployeeWageCom.ABSENT:
                    day++;
                    break;
                case EmployeeWageCom.PART_TIME:
                    day++;
                    totalWage += DailyWage(PART_TIME_DAILY_HOUR);
                    break;
                case EmployeeWageCom.FULL_TIME:
                    day++;
                    totalWage += DailyWage(FULL_TIME_DAILY_HOUR);
                    break;
            }
        }
        return totalWage;
    }
}

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int totalWage = WageCalculator.TotalWage();
        System.out.println("Total Wage for the Month: " + totalWage);
    }
}