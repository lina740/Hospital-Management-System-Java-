/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public class Appointment implements HospitalSystem {

    
    private String day;
    private double time;
    private int appointmentNumber;
    private String doctorName;
    private boolean isAvailable;

    public Appointment(String day, double  time, int appointmentNumber, String doctorName, boolean isAvailable) {
        this.day = day;
        this.time = time;
        this.appointmentNumber = appointmentNumber;
        this.doctorName = doctorName;
        this.isAvailable = isAvailable; // true
    }

    public Appointment() {
        this("",0,0,"",false);
    }
    
    

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double  getTime() {
        return time;
    }

    public void setTime(double  time) {
        
        if(getTime()> 12 && getTime()<0){
            System.out.println("Invalid Time");
        } else{
            this.time = time;
        }
        
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    @Override
    public void printSystem() {
        System.out.println("----- Appointment Information -----");
        System.out.println("The Day of Appointment is: "+getDay()); 
        System.out.println("The Time is : "+getTime()); 
        System.out.println("Appointment Number :"+getAppointmentNumber());
        System.out.println("Doctor Name :"+getDoctorName());
       
    }
    
    public  void CheekApoointment (){
        
        if(isAvailable== true ) {
                    System.out.println("The Appointment is Available");
        } else {
            System.out.println("The Appointment is Available for book");
        }
    }
    
    
    public void cancelAppointment (){
        setIsAvailable(true);
        System.out.println("The Appointment has been canceled and is availabl now ");
    }
    
}


