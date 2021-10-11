
package college;

public class Students extends Person {
    private int curse;
    private String career;

    public Students(String name, String lastName, String maritalStatus, long dni, int curse, String career) {
        super(name, lastName, maritalStatus, dni);
        this.curse = curse;
        this.career = career;
    }
//-----------------------------Getters/Setters----------------------------------------------------------------------------------------------//
    public int getCurse() {
        return curse;
    }

    public String getCareer() {
        return career;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public void setCareer(String career) {
        this.career = career;
    }
//------------------------------Methods----------------------------------------------------------------------------------------------------//    
    @Override
    public void showInfo(){
        System.out.println("Person of College: \t\t\t"+"Student");
        System.out.println("Name: \t\t\t"+getName()+" "+getLastName());
        System.out.println("Marital status: \t\t\t"+getMaritalStatus());
        System.out.println("DNI: \t\t\t"+getDni());
        System.out.println("Career: \t\t\t"+getCareer());
        System.out.println("Curse: \t\t\t"+getCurse());
        System.out.println("--------------------------------------------");
    }

}
