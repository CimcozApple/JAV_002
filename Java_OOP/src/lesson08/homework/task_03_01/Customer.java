package lesson08.homework.task_03_01;

public class Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String address;
    private int bankAccount;
    private long creditCard;

    public String getFirstName() {
        return this.firstName; // maybe without 'this' keyword?
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public Customer() {
    }

    public Customer(String firstName, String lastName, String middleName, int age, String address, int bankAccount, long creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.address = address;
        this.bankAccount = bankAccount;
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", middleName = '" + middleName + '\'' +
                ", age = " + age +
                ", address = '" + address + '\'' +
                ", bankAccount = " + bankAccount +
                ", creditCard = " + creditCard +
                '}';
    }
}