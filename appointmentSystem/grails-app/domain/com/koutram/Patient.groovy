package com.koutram

class Patient {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    int patientID
    Date dateRegistered
    int patientPhone
}
