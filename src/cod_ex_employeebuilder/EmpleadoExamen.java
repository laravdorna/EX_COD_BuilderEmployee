package cod_ex_employeebuilder;

/**
 *
 * @author lara vazquez dorna
 */
public class EmpleadoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Instancio un builder con los parametros obligatorios, y luego le añado 
        los parametros que quiera con los set y una vez añadidos los atributos
        deseados llamo a crearEmployee para crear un empleado
         */
 /*
        Defino un objeto employee pero lo instancio con el contructor y los set de 
        builder y luego llamo al metodo crear empleado que me devuelve un 
        objeto del tipo empleado.
        Para añadir los parametros deseados se llama a los set antes de llamar al 
        metodo crearEmployee
         */
        Employee em1 = new EmployeeBuilder("Pepe", 254).setNewLastName("Alonso")
                .setNewMiddleName("Perez").createEmployee();
        
        System.out.println(em1.toString());

    }

}
