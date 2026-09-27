/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
public class Person {
    private String name;
    private int ID ;
    private int Age ;
    private String  gender ;
    private String phoneNumber ;

    public Person(String name, int ID, int Age, String gender, String phoneNumber) {
        this.name = name;
        this.ID = ID;
        this.Age = Age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
        this("",0,0,"","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    @Override
    public String toString(){
        
        return " -------- Personal Data -------- \n name :"+name +"\n "+"ID :"+ID+"\n "+"Age :"+Age +"\n "+"gender :"+gender ; }

}

