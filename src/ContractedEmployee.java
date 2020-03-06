public class ContractedEmployee extends Employee {

    String federalTaxID;
    double hourlyRate;
    double numberOfHoursWorked;


    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxID = federalTaxId;
    }

    public String getFederalTaxId() {

        return federalTaxID;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxID = federalTaxId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double calculatePay() {
        avgMonthlySalary = hourlyRate * numberOfHoursWorked;
        return avgMonthlySalary;
    }

}
