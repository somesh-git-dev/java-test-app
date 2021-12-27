package app;

public class Demo {

    public static void main(String[] args) {

        Employee employee = Employee.builder().department("delivery")
                .firstName("david").lastName("boon")
                .emailId("davidboon@bt.com").build();

        System.out.println(employee.toString());
    }
}
