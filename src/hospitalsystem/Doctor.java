/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public final class Doctor extends Staff {

    private String Specialty;
    private static int numOfD;
    private int numDoc;

    public Doctor(String name, int ID, int Age, String gender, String phoneNumber, int YearOfwork, int Staff_ID, String Department, double Salary, String Specialty) {
        super(name, ID, Age, gender, phoneNumber, YearOfwork, Staff_ID, Department, Salary);
        this.Specialty = Specialty;
        numDoc = ++numOfD;
    }
    
     public Doctor (){
        this("",0,0,"","",0,0,"",0,"");
    }


    @Override
    public double SalaryCalc() {
        if (getYearOfwork() >= 3) {
            return getSalary() + 3000;
        } else {
            return getSalary();
        }
    }

    @Override
    public String toString() {
        return String.format(" %s \n -------- Doctors  Info --------  \n Specialty: %s  \n The number Doctor: %d\n ", super.toString(), Specialty , numDoc);

    }

    public static int getNumOfD() {
        return numOfD;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }
}
