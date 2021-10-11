
package college;

public abstract class Employees extends Person {
    private int yearInc, nEmploy;

    public Employees (String name, String lastName, String maritalStatus, long dni, int yearInc, int nEmploy) {
        super(name, lastName, maritalStatus, dni);
        this.yearInc = yearInc;
        this.nEmploy = nEmploy;
    }

    public Employees() {
       
    }
    
    
//-----------------------------Getters/Setters----------------------------------------------------------------------------------------------//
    protected int getYearInc() {
        return yearInc;
    }

    protected int getnEmploy() {
        return nEmploy;
    }

    protected void setYearInc(int yearInc) {
        this.yearInc = yearInc;
    }

    protected void setnEmploy(int nEmploy) {
        this.nEmploy = nEmploy;
    }
 
}
