package com.koutram

class Doctor {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        doctorEmail (email:true)
        //doctorPhone (matches:"[1-0]")
        password (password:true)
        //doctorPhone(phoneNumber:true)
    }

    String doctorName
    String qualifications
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    String toString(){
        return(doctorName)
    }

    static hasMany = [appointments:Appointment,prescriptions:Prescription, nurses:Nurse, patients:Patient]
    static belongsTo = [surgery:Surgery]


}


