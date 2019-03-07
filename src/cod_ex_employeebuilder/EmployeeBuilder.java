/*
 * Esta clase es la Builder del Employee 
 BUILDER :
Se va a encargar de los valores por defecto de los atributos, por lo que
se asignan valores por defecto a los mismos.
Esta clase se instancia por cada empleado que queremos crear
 */
package cod_ex_employeebuilder;

public class EmployeeBuilder {
//atributos del builder son los mismos que los de la clase Employee

    private String newLastName;
    private String newMiddleName;
    private String newFirstName;
    private long newId;
    private int newBirthYear;
    private int newBirthMonth;
    private int newBirthDate;
    private int newHireYear;
    private int newHireMonth;
    private int newHireDate;

    /*
   El constructor tiene que tener como parametros los atributos obligatorios 
    de la clase employee
     */
    public EmployeeBuilder(final String FirstName, final long Id) {
        this.newId = Id;
        this.newFirstName = FirstName;
    }

    /*por cada paramatetro generamos su set de los atributos no obligatorios
    devuelve un Objeto de la clase en el cual cambiamos solo el atributo que 
    deseemos
    Los atributos obligatorios no necesitan de set aunque los cree el ID no 
    son necesarios
     */
    public EmployeeBuilder setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }

    public EmployeeBuilder setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

//    public EmployeeBuilder setNewFirstName(String newFirstName) {
//        this.newFirstName = newFirstName;
//        return this;
//    }
//
//    public EmployeeBuilder setNewId(long newId) {
//        this.newId = newId;
//        return this;
//    }
    public EmployeeBuilder setNewBirthYear(int newBirthYear) {
        this.newBirthYear = newBirthYear;
        return this;
    }

    public EmployeeBuilder setNewBirthMonth(int newBirthMonth) {
        this.newBirthMonth = newBirthMonth;
        return this;
    }

    public EmployeeBuilder setNewBirthDate(int newBirthDate) {
        this.newBirthDate = newBirthDate;
        return this;
    }

    public EmployeeBuilder setNewHireYear(int newHireYear) {
        this.newHireYear = newHireYear;
        return this;
    }

    public EmployeeBuilder setNewHireMonth(int newHireMonth) {
        this.newHireMonth = newHireMonth;
        return this;
    }

    public EmployeeBuilder setNewHireDate(int newHireDate) {
        this.newHireDate = newHireDate;
        return this;
    }

    /*
    se necesita un metodo crear que devuelva un objeto de la clase EMPLEADO
    para que una vez dados los parametros con el builder tengamos un empleado de 
    la clase empleado
     */
    public Employee createEmployee() {
        return new Employee(newLastName, newMiddleName, newFirstName, newId,
                newBirthYear, newBirthMonth, newBirthDate, newHireYear,
                newHireMonth, newHireDate);
    }

}
