
package college;

public class CleaningStuff extends Employees{
    
    private int section;

    public CleaningStuff(String name, String lastName, String maritalStatus, long dni, int yearInc, int nEmploy, int section) {
        super(name, lastName, maritalStatus, dni, yearInc, nEmploy);
        this.section = section;
    }
//-----------------------------Getters/Setters----------------------------------------------------------------------------------------------//
    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
 //------------------------------Methods----------------------------------------------------------------------------------------------------//     
    @Override
    public void showInfo(){
        System.out.println("Person of College: \t\t\t"+"Employee");
        System.out.println("Cleaning team member ");
        System.out.println("Name: \t\t\t"+getName()+" "+getLastName());
        System.out.println("Marital status: \t\t\t"+getMaritalStatus());
        System.out.println("DNI: \t\t\t"+getDni());
        System.out.println("Year of incorporation: \t\t\t"+ getYearInc());
        System.out.println("Number of Employ: \t\t\t"+getnEmploy());
        System.out.println("Section: \t\t\t"+getSection());
        System.out.println("--------------------------------------------");
    }
}
