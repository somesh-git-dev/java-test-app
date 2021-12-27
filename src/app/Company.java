package app;

import lombok.Builder;

import java.util.UUID;

/*@Builder*/
public class Company {

    private String firstName;
    private String lastName;
    private String department;
    private String emailId;
    private String company;
    private String password;
    private Integer mailboxCapacity;

    public Company(String firstName, String lastName, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
        this.emailId = generateMail();
        this.password = generatePwd();
    }

    public String generateMail() {
        return this.firstName + "." + this.lastName + "@" + this.company + ".com";
    }

    public static String generatePwd() {
        return UUID.randomUUID().toString();
    }

    public void setMailboxCapacity(Integer mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return getFirstName() + getLastName();
    }

}
