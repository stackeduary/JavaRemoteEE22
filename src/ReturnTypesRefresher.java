public class ReturnTypesRefresher {
    public static double monthlySalaryToAnnualSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    public static void main(String[] args) {
        System.out.println(ReturnTypesRefresher.monthlySalaryToAnnualSalary(10000));
    }
}
