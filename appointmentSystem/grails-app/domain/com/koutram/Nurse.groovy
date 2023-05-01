package com.koutram

class Nurse extends Worker {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        //nursePhone(phoneNumber:true)
    }

    String qualifications
    String nurseOffice

    String toString(){
        return(name)
    }

    static hasMany = [doctors:Doctor]

}
