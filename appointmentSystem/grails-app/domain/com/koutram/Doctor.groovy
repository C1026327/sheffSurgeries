package com.koutram

class Doctor extends Worker {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        //email (email:true)
        //doctorPhone (matches:"[1-0]")
        //password (password:true)
        //doctorPhone(phoneNumber:true)
    }

    String qualifications
    String position
    String doctorOffice
    String bio

    String toString(){
        return(name)
    }

    static hasMany = [appointments:Appointment,prescriptions:Prescription, nurses:Nurse]
    static belongsTo = [Nurse]


}


