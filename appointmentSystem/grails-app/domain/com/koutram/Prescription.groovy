package com.koutram

class Prescription {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        patient(nullable:true)
        prescriptionNumber(unique: true)
    }

    String pharmacyName
    int prescriptionNumber
    String medicine
    int daysSupply
    BigDecimal totalCost
    Date dateIssued
    boolean patientPaying

    String toString(){
        return (medicine)
    }

    static hasOne = [doctor:Doctor, patient:Patient]

}

