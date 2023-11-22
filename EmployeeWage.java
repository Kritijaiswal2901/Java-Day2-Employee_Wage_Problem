public class EmployeeWage {

    private static Boolean checkAttendance() {
        int empType = (int) (Math.floor(Math.random() * 10) % 2);
        return empType == 1;
    }
    public static void main(String[] agrs) {
        System.out.println("Welcome to employee wage computation problem");
        if(checkAttendance()) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}