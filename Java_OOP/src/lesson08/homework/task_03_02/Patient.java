package lesson08.homework.task_03_02;

public class Patient {
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private int cellPhone;
    private int userID;
    private String diagnosis;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient() {
    }

    public Patient(String firstName, String lastName, String middleName, String address, int cellPhone, int userID, String diagnosis) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.userID = userID;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "\nPatient{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", middleName = '" + middleName + '\'' +
                ", address = '" + address + '\'' +
                ", cellPhone = " + cellPhone +
                ", userID = " + userID +
                ", diagnosis = '" + diagnosis + '\'' +
                '}';
    }
}