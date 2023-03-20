package com.koutram

class Appointment {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    
    }

    Date appDay
    Date appTime
    Date appDuration
    String rooNumber

}

// 1 Appointment? to Many Surgeries
// 1 Appointment to 1 patient