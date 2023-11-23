
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
    private static int DailyWage(int WAGE_PER_HOUR, int hours) {
        return WAGE_PER_HOUR * hours;
    }

    static int TotalWage(String comName, int DailyWagePerHour, int fullTimeHour, int partTimeHour, int noOfDays) {
        int totalWage = 0;
        for (int day = 0; day <noOfDays; day++) {
            int employeeType = EmployeeWageCom.EmployeeType();
            switch (employeeType) {
                case EmployeeWageCom.ABSENT:
                day++;
                    break;
                case EmployeeWageCom.PART_TIME:
                    day++;
                    totalWage += DailyWage(DailyWagePerHour,partTimeHour);
                    break;
                case EmployeeWageCom.FULL_TIME:
                day++;
                    totalWage += DailyWage(DailyWagePerHour,fullTimeHour);
                    break;
            }
        }
        return totalWage;
    }
}

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        String company1 = "GE";
        int DailyWagePerHour1 = 4000;
        int fullTimeHour1 = 8;
        int partTimeHour1 = 4;
        int noOfDays1 = 20;

        int totalWage1 = WageCalculator.TotalWage(company1, DailyWagePerHour1, fullTimeHour1, partTimeHour1, noOfDays1);
        System.out.println("Monthly Wage for " + company1 + " Employee : " + totalWage1);

        String company2 = "Digital";
        int DailyWagePerHour2 = 5000;
        int fullTimeHour2 = 8;
        int partTimeHour2 = 4;
        int noOfDays2 = 20;


        int totalWage2 = WageCalculator.TotalWage(company2, DailyWagePerHour2, fullTimeHour2, partTimeHour2, noOfDays2);
        System.out.println("Monthly Wage for " + company2 + " Employee : " + totalWage2);
    }
}