package com.koutram

class Doctor {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String doctorName
    String qualifications
    String position
    String doctorEmail
    String password
    String doctorOffice
    int doctorPhone
    String bio

    String toString(){
        return(doctorName)
    }

}
static hasMany = [prescriptions:Prescription, nurses:Nurse]
static belongsTo = [surgery:Surgery]
// Doctor 1 to Many Prescriptions
// Doctor Many to Many Nurses
// Doctors Many to 1 (belongsto) Surgery