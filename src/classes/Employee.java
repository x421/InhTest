package classes;

public class Employee {
    private String employeeName;
    private String employeeUniqueID;

    public Employee(String personID, String personName) {
        employeeName            = personID;
        this.employeeUniqueID   = personName;
    }

    public void printEmployeeInfo() {
        System.out.println("Person: " + employeeName + " id: " + employeeUniqueID);
    }
}
