package com.koutram

class Appointment {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    
    }

    String toString(){
        roomNumber + ' ' + appDateTime
    }

    Date appDateTime
    int appDuration
    String roomNumber

    static hasOne = [doctor:Doctor, patient:Patient, surgery: Surgery]

}
