package com.koutram

class Patient extends Person {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        prescriptions(nullable: true)
    }

    String patientAddress
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegistered
    
    String toString(){
        return(name)
    }

    static hasMany = [surgeries:Surgery, appointments:Appointment, prescriptions:Prescription]

}

