package app;

public class Demo {

    public static void main(String[] args) {

        Company company = new Company("David", "Beckham", "delivery", "virtuous");
        String mail = company.generateMail();
        System.out.println(mail);
    }
}
