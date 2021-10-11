
package college;

public class Teacher extends Employees {
    
    private String department;

    public Teacher( String name, String lastName, String maritalStatus, long dni, int yearInc, int nEmploy, String department) {
        super(name, lastName, maritalStatus, dni, yearInc, nEmploy);
        this.department = department;
    }

    public Teacher() {
       
    }
    
    
    
//-----------------------------Getters/Setters----------------------------------------------------------------------------------------------//    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
 //------------------------------Methods----------------------------------------------------------------------------------------------------//        
    @Override
    public void showInfo(){
        System.out.println("Person of College: \t\t\t"+"Employee");
        System.out.println("Teacher ");
        System.out.println("Name: \t\t\t"+getName()+" "+getLastName());
        System.out.println("Marital status: \t\t\t"+getMaritalStatus());
        System.out.println("DNI: \t\t\t"+getDni());
        System.out.println("Year of incorporation: \t\t\t"+ getYearInc());
        System.out.println("Number of Employ: \t\t\t"+getnEmploy());
        System.out.println("Department: \t\t\t"+getDepartment());
        System.out.println("--------------------------------------------");
    }
}
