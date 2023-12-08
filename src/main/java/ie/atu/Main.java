package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tamer Z", "BallyBane", "12345");

        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getNumber());

        Customer customer = new Customer("Jane Smith", "Dublin Rd", "54321", 12321, true);

        // Access and modify Customer's information
        System.out.println("\nCustomer's Name: " + customer.getName());
        System.out.println("Customer's Address: " + customer.getAddress());
        System.out.println("Customer's Telephone Number: " + customer.getNumber());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("On Mailing List: " + customer.isOnMailingList());

    }
}