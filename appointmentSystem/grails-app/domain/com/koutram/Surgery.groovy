package com.koutram

class Surgery {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String name
    String address
    String postcode
    String telephone
    Integer numberOfPatients
    String openingTime
    Boolean registeringNewPatients

    String toString(){
        name
    }

    static hasMany = [workers:Worker, patients:Patient, appointments: Appointment]
    
    static belongsTo = Patient
    
    Integer getPatientCount() {
        patients?.size () ?: 0
    }

    void beforeUpdate() {
        numberOfPatients = getPatientCount()
    }
    

}
