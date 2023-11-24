import java.util.ArrayList;
import java.util.List;

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
    private static int calculateEmployeeWage(int fullTimeDailyHour, int partTimeDailyHour, int totalHours, int totalDays) {
        int totalWage = 0;
        while (totalDays < 20 && totalHours < 100) {
            if (isPartTime() == 0) {
                totalHours += fullTimeDailyHour;
                totalWage += dailyWage(fullTimeDailyHour);
            } else {
                totalHours += partTimeDailyHour;
                totalWage += dailyWage(partTimeDailyHour);
            }
            totalDays++;
        }
        return totalWage;
    }


    public static void main(String[] agrs) {
        System.out.println("Welcome to employee wage computation problem");
        final int FULL_TIME_DAILY_HOUR = 8;
        final int PART_TIME_DAILY_HOUR = 4;
       List<CompanyEmpWage> companies = new ArrayList<>();
        companies.add(new CompanyEmpWage("Company1", FULL_TIME_DAILY_HOUR, PART_TIME_DAILY_HOUR, 20, 100));
        companies.add(new CompanyEmpWage("Company2", FULL_TIME_DAILY_HOUR, PART_TIME_DAILY_HOUR, 20, 100));

        for (CompanyEmpWage company : companies) {
            System.out.println("Processing for " + company.getCompanyName());
            
            if (checkAttendance()) {
                System.out.println("Employee is Present");
            } else {
                System.out.println("Employee is Absent");
            }

            if (isPartTime() == 0) {
                System.out.println("Daily Wage (Full Time): " + dailyWage(FULL_TIME_DAILY_HOUR));
                System.out.println("Monthly Wage (Full Time): " + monthlyWage(dailyWage(FULL_TIME_DAILY_HOUR)));
            } else {
                System.out.println("Daily Wage (Part Time): " + dailyWage(PART_TIME_DAILY_HOUR));
                System.out.println("Monthly Wage (Part Time): " + monthlyWage(dailyWage(PART_TIME_DAILY_HOUR)));
            }

            int totalWage = calculateEmployeeWage(
                    company.getFullTimeDailyHour(),
                    company.getPartTimeDailyHour(),
                    0,
                    0
            );

            System.out.println("Total Wage Until 100 Hours or 20 Days: " + totalWage);
        }
    }
}

class CompanyEmpWage {
    private final String companyName;
    private final int fullTimeDailyHour;
    private final int partTimeDailyHour;
    private final int noOfDays;
    private final int totalHours;

    public CompanyEmpWage(String companyName, int fullTimeDailyHour, int partTimeDailyHour, int noOfDays, int totalHours) {
        this.companyName = companyName;
        this.fullTimeDailyHour = fullTimeDailyHour;
        this.partTimeDailyHour = partTimeDailyHour;
        this.noOfDays = noOfDays;
        this.totalHours = totalHours;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getFullTimeDailyHour() {
        return fullTimeDailyHour;
    }

    public int getPartTimeDailyHour() {
        return partTimeDailyHour;
    }
}

