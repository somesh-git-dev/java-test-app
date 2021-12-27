package app;

import lombok.Builder;

@Builder
public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private String emailId;

    public Employee(String firstName, String lastName, String department, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
