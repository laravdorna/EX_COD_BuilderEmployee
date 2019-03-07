package cod_ex_employeebuilder;

public class Employee {

    //atributos del empleado
    private String lastName;
    private String middleName;
    private String firstName;
    private long id;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private int hireYear;
    private int hireMonth;
    private int hireDate;

    //constructor final pasando todos los atributos como parameto
    public Employee(
            final String newLastName,
            final String newMiddleName,
            final String newFirstName,
            final long newId,
            final int newBirthYear,
            final int newBirthMonth,
            final int newBirthDate,
            final int newHireYear,
            final int newHireMonth,
            final int newHireDate) {
        this.lastName = newLastName;
        this.middleName = newMiddleName;
        this.firstName = newFirstName;
        this.id = newId;
        this.birthYear = newBirthYear;
        this.birthMonth = newBirthMonth;
        this.birthDate = newBirthDate;
        this.hireYear = newHireYear;
        this.hireMonth = newHireMonth;
        this.hireDate = newHireDate;
    }

    //constructor donde se le pasan como parametros los atributos obligatorios
    public Employee(final String firstName, final long id) {
        this.firstName = firstName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", middleName=" + middleName
                + ", firstName=" + firstName + ", id=" + id + ", birthYear="
                + birthYear + ", birthMonth=" + birthMonth + ", birthDate="
                + birthDate + ", hireYear=" + hireYear + ", hireMonth="
                + hireMonth + ", hireDate=" + hireDate + '}';
    }

}
