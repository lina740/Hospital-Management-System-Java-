/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public final class Nurse extends Staff {

    private int Hours;
    private static int numOfN;
    private int numNur ;
    public Nurse(String name, int ID, int Age, String gender, String phoneNumber, int YearOfwork, int Staff_ID, String Department, double Salary, int Hours) {
        super(name, ID, Age, gender, phoneNumber, YearOfwork, Staff_ID, Department, Salary);
        this.Hours = Hours;
        numNur = ++numOfN;
    }
 public Nurse (){
        this("",0,0,"","",0,0,"",0,0);
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
        return String.format("%s \n -------- Nurse Info -------- \n Hours : %d \n The number nurse: %d\n ", super.toString(), Hours , numNur);

    }

    public static int getNumOfN() {
        return numOfN;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

}
