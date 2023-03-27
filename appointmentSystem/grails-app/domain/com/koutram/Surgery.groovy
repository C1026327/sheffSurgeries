package com.koutram

class Surgery {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String name
    String address
    String postcode
    int telephone
    int numberOfPatients
    Date openingTime
    Boolean registeringNewPatients

    String toString(){
        name
    }

    static hasMany = [doctors:Doctor, receptionists:Receptionist, nurses:Nurse, patients:Patient]

}
