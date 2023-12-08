package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tamer Z", "BallyBane", "12345");

        // Accessing information using accessor methods
        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getNumber());

        // Updating information using mutator methods
        person1.setAddress("Dublin Rd");
        person1.setNumber("54321");

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getNumber());

    }
}