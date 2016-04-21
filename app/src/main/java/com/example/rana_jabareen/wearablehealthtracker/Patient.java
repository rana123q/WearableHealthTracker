package com.example.rana_jabareen.wearablehealthtracker;


public class Patient {
    private int PatientID;
    private String FirstName;
    private String LastName;
    //private Date BirthDate;
    private String Gender;
    private String Email;
    private String PatientPassword;
    private int PhoneNo;

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int patientID) {
        PatientID = patientID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

  /*  public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }*/

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPatientPassword() {
        return PatientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        PatientPassword = patientPassword;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }
}
