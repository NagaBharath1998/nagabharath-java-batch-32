package Maven;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        Account account = new Account();

        Person person = new Person();
        person.setAddress(address);
        person.setAccount(account);

        // Perform any desired operations using the Person, Address, and Account objects
    }
}
