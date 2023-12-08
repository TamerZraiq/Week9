package ie.atu;

public class Customer extends Person{
    private int customerNumber;
    private boolean onMailingList;

    public Customer(String name, String address, String telephoneNumber, int customerNumber, boolean onMailingList) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }
}
