
package college;

/**
 * @author Marco Peñafort
 */
public abstract class Person {
    
    private String name, lastName, maritalStatus;
    private long dni;
    
    public Person(String name, String lastName, String maritalStatus, long dni) {
        this.name = name;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.dni = dni;
    }

    public Person() {
    }
    

//-----------------------------Getters/Setters----------------------------------------------------------------------------------------------//
    protected String getName() {
        return name;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getMaritalStatus() {
        return maritalStatus;
    }

    protected long getDni() {
        return dni;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    protected void setDni(long dni) {
        this.dni = dni;
    }
//------------------------------Methods----------------------------------------------------------------------------------------------------//     
    public abstract void showInfo();
}
