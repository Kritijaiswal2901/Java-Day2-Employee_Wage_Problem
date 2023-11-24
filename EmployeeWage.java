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
    public static int calculateEmployeeWage(int fullTimeDailyHour, int partTimeDailyHour, int totalHours, int totalDays, List<Integer> dailyWages) {
        int totalWage = 0;
        while (totalDays < 20 && totalHours < 100) {
            int dailyWage = 0;
            if (isPartTime() == 0) {
                totalHours += fullTimeDailyHour;
                dailyWage = dailyWage(fullTimeDailyHour);
            } else {
                totalHours += partTimeDailyHour;
                dailyWage = dailyWage(partTimeDailyHour);
            }
            totalDays++;
            dailyWages.add(dailyWage);
            totalWage += dailyWage;
        }
        return totalWage;
    }

    // UC 8: Compute Employee Wage for multiple companies - Class for each company
static class CompanyEmpWage {
    private final String companyName;
    private final int fullTimeDailyHour;
    private final int partTimeDailyHour;
    private final int noOfDays;
    private final int totalHours;
    private int totalWage;
    private final List<Integer> dailyWages;



    public CompanyEmpWage(String companyName, int fullTimeDailyHour, int partTimeDailyHour, int noOfDays, int totalHours) {
        this.companyName = companyName;
        this.fullTimeDailyHour = fullTimeDailyHour;
        this.partTimeDailyHour = partTimeDailyHour;
        this.noOfDays = noOfDays;
        this.totalHours = totalHours;
        this.totalWage = 0;
        this.dailyWages = new ArrayList<>();

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
    public int getTotalWage() {
                return totalWage;
            }
    public void setTotalWage(int totalWage) {
                this.totalWage = totalWage;
            }
    public List<Integer> getDailyWages() {
                return dailyWages;
            }
        }
       // Ability to manage Employee Wage of multiple companies
    static class EmpWageBuilder {
        //save the total wage for each company
    private final List<CompanyEmpWage> companies;

    public EmpWageBuilder() {
        this.companies = new ArrayList<>();
    }

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public void computeWages() {
        for (CompanyEmpWage company : companies) {
            int totalWage = calculateEmployeeWage(
                    company.getFullTimeDailyHour(),
                    company.getPartTimeDailyHour(),
                    0,
                    0,
                    company.getDailyWages()
            );
            company.setTotalWage(totalWage);
        }
    }
}
//using interface

interface EmpWageInterface {
    void addCompany(CompanyEmpWage company);
    void computeWages();
}

class EmpWageBuilderInterface implements EmpWageInterface {
    private final List<CompanyEmpWage> companies;

    public EmpWageBuilderInterface() {
        this.companies = new ArrayList<>();
    }

    @Override
    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    @Override
    public void computeWages() {
        for (CompanyEmpWage company : companies) {
            int totalWage = calculateEmployeeWage(
                    company.getFullTimeDailyHour(),
                    company.getPartTimeDailyHour(),
                    0,
                    0,
                    company.getDailyWages()
            );
            company.setTotalWage(totalWage);
        }
    }
}

   
// UC 12: Refactor to have list of multiple companies to manage Employee Wage
class EmpWageBuilderArrayList {
    private final List<CompanyEmpWage> companies;

    public EmpWageBuilderArrayList() {
        this.companies = new ArrayList<>();
    }

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public void computeWages() {
        for (CompanyEmpWage company : companies) {
            int totalWage = calculateEmployeeWage(
                    company.getFullTimeDailyHour(),
                    company.getPartTimeDailyHour(),
                    0,
                    0,
                    company.getDailyWages()
            );
            company.setTotalWage(totalWage);
        }
    }
    public List<CompanyEmpWage> getCompanies() {
        return companies;
    }
}

// UC 13: Ability to get the Total Wage when queried by Company
static class EmpWageBuilderWithQuery {
    private final List<CompanyEmpWage> companies;

    public EmpWageBuilderWithQuery() {
        this.companies = new ArrayList<>();
    }

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public void computeWages() {
        for (CompanyEmpWage company : companies) {
            int totalWage = calculateEmployeeWage(
                    company.getFullTimeDailyHour(),
                    company.getPartTimeDailyHour(),
                    0,
                    0,
                    company.getDailyWages()
            );
            company.setTotalWage(totalWage);
        }
    }

    public int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage company : companies) {
            if (company.getCompanyName().equals(companyName)) {
                return company.getTotalWage();
            }
        }
        return 0; 
    }
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


