/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public class HospitalInfo implements HospitalSystem {

    public final String HOSPITALNAME;
    public final String CITY;
    public final String HOSPITALPHONE;

    public HospitalInfo() {
        HOSPITALNAME = " Central City Hospital ";
        CITY = "Riyadh ";
        HOSPITALPHONE = "0116498";
    }
  

    public String getCity() {
        return CITY;
    }

    public String getHospitalPhone() {
        return HOSPITALPHONE;
    }

    public final String getHospitalName() {

        return HOSPITALNAME;

    }

   

    @Override
    public void printSystem() {
        System.out.println("hospital Name : " + getHospitalName());
        System.out.println("city : " + getCity());
        System.out.println("Hospital Phone : " + getHospitalPhone());
    }

}
