/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public final class Patient extends Person{
   
  private  int Patient_ID;
  private String Disease;  
  private Appointment []appointments;

    public Patient(String name, int ID, int Age, String gender, String phoneNumber ,int Patient_ID, String Disease, int size) {
        super(name, ID, Age, gender, phoneNumber);
        this.Patient_ID = Patient_ID;
        this.Disease = Disease;
        this.appointments = new Appointment[size];
    }
    
    public Patient() {
      this("",0,0,"","",0,"",0);
    }
    
    
    
    private int x ;
   public void add(Appointment s){
    try{
    appointments[x ]= s;
      x++;}
    catch(Exception m){
        System.out.println("i can’t add more index !!");
    }
}
      public void cancel (int i){      
    try{
            appointments[i]=appointments[x-i];       
            x--;
        }catch(Exception e){  
            System.out.println(" Worng index!!");
        }
         
    }


 

  @Override
        public String toString() {
        return super.toString()+"\n Patient_ID :" + Patient_ID+"\n"+"Disease :"+Disease;
   
     
      }
     public int getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(int Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }
    
    }


