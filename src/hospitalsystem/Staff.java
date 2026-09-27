/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public abstract class Staff extends Person  {
    private int YearOfwork;
    private  int Staff_ID;
    private String Department;
    private double Salary;

    public Staff( String name, int ID, int Age, String gender, String phoneNumber,int YearOfwork, int Staff_ID, String Department, double Salary) {
        super(name, ID, Age, gender, phoneNumber);
        this.YearOfwork = YearOfwork;
        this.Staff_ID = Staff_ID;
        this.Department = Department;
        this.Salary = Salary;
    }
    
    public Staff (){
        this("",0,0,"","",0,0,"",0);
    }
    public abstract double SalaryCalc();

    @Override
    public String toString() {
        return super.toString()+ "\n   -------- Staff Info -------- \n YearOfwork :" + YearOfwork + "\n Staff_ID :" + Staff_ID + "\n Department :" + Department + "\n Salary :" + Salary ;
    }

   

    public int getYearOfwork() {
        return YearOfwork;
    }

    public void setYearOfwork(int YearOfwork) {
        this.YearOfwork = YearOfwork;
    }

    public int getStaff_ID() {
        return Staff_ID;
    }

    public void setStaff_ID(int Staff_ID) {
        this.Staff_ID = Staff_ID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }   
}   


