package com.koutram

class Prescription {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String pharmacyName
    int prescriptionNumber
    String medicine
    Date daysSupply
    BigDecimal totalCost
    Date dateIssued
    Boolean patientPaying
}

// Many prescriptions to one doctor
// 0 or More prescriptions to one patient
