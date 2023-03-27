package com.koutram

class Nurse {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    int nursePhone

    String toString(){
        return(nurseName)
    }
}

static hasMany = [doctors:Doctor]
static belongsTo = [Surgery]