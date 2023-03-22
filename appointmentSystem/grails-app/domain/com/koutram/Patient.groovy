package com.koutram

class Patient {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        prescriptions(nullable: true)
    }

    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    int patientID
    Date dateRegistered
    int patientPhone

    String toString(){
        return(patientName)
    }
}

static hasMany = [doctors:Doctor, surgeries:Surgery, prescriptions:Prescription]

// Patient 1 to 0 or many Prescriptions
// Patient Many to Many Doctors
// Patient Many to Many Surgeries
// Patient One to One Appointment