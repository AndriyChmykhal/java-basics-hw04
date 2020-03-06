public class Employee implements Payable{

  double avgMonthlySalary;
  String employeeId;
  String name;

  // TODO fix class declaration and declare variables here

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return avgMonthlySalary;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return name + " " + String.format(format, avgMonthlySalary);
  }

  @Override
  public double calculatePay() {
    return avgMonthlySalary;
  }
}
