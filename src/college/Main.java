package college;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name, lastName, maritalStatus, department;
        int yearInc, nEmploy;
        long dni;
        int curse, section;
        String career;
        int options = 0, optionsPerson = 0;

        ArrayList<Person> personList = new ArrayList<>();
        do {
            do {
                try {
                    Functions.showMenu();
                    options = scan.nextInt();
                } catch (Exception e) {
                    System.out.println("Not a valid type");
                    options = 0;
                    scan.next();
                }
            } while (options > 4 && options < 1);
            switch (options) {

                case 1:
                    Functions.choosePerson();
                    do {
                        try {
                            optionsPerson = scan.nextInt();
                        } catch (Exception e) {
                            System.out.println("Not a valid type");
                            optionsPerson = 0;
                            scan.next();
                        }
                        if (optionsPerson > 3 || optionsPerson < 1) {
                            System.out.println("Not a valid option. Try again.");
                        }
                    } while (optionsPerson > 3 || optionsPerson < 1);

                    if (optionsPerson == 1) {
                        System.out.println("Teacher.");
                        System.out.println("Name: ");
                        name = scan.next();
                        System.out.println("Last name:");
                        lastName = scan.next();
                        System.out.println("Marital status:");
                        maritalStatus = scan.next();
                        System.out.println("DNI: ");
                        dni = scan.nextLong();
                        System.out.println("Year of incorporation: ");
                        yearInc = scan.nextInt();
                        System.out.println("Number of Employ:");
                        nEmploy = scan.nextInt();
                        System.out.println("Department:");
                        department = scan.next();
                        personList.add(new Teacher(name, lastName, maritalStatus, dni, yearInc, nEmploy, department));
                    }
                    if (optionsPerson == 2) {
                        System.out.println("Cleaning staff");
                        System.out.println("Name: ");
                        name = scan.next();
                        System.out.println("Last name:");
                        lastName = scan.next();
                        System.out.println("Marital status:");
                        maritalStatus = scan.next();
                        System.out.println("DNI: ");
                        dni = scan.nextLong();
                        System.out.println("Year of incorporation: ");
                        yearInc = scan.nextInt();
                        System.out.println("Number of Employ:");
                        nEmploy = scan.nextInt();
                        System.out.println("Section:");
                        section = scan.nextInt();
                        personList.add(new CleaningStuff(name, lastName, maritalStatus, dni, yearInc, nEmploy, section));
                    }
                    if (optionsPerson == 3) {
                        System.out.println("Student");
                        System.out.println("Name: ");
                        name = scan.next();
                        System.out.println("Last name:");
                        lastName = scan.next();
                        System.out.println("Marital status:");
                        maritalStatus = scan.next();
                        System.out.println("DNI: ");
                        dni = scan.nextLong();
                        System.out.println("Curse: ");
                        curse = scan.nextInt();
                        System.out.println("Career: ");
                        career = scan.next();
                        personList.add(new Students(name, lastName, maritalStatus, dni, curse, career));
                    }

                    break;

                case 2:
                    System.out.println("DNI of the person you want to remove");
                    long x = scan.nextLong();
                    int cont = 0;
                    for (Person i : personList) {
                        if (i.getDni() == x) {
                            personList.remove(cont);
                        }
                        cont++;
                    }
                    break;
                case 3:
                    for (Person i : personList)
                        i.showInfo();
                   
                    break;
                    

            }
        } while (options != 4);
    }
}
