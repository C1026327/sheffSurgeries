package com.koutram

class Nurse {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        nurseEmail (email:true)
        //nursePhone(phoneNumber:true)
    }

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toString(){
        return(nurseName)
    }

    static hasMany = [doctors:Doctor]
    static hasOne = [surgery: Surgery]

}
