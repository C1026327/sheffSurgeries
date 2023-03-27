package com.koutram

class Prescription {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
        patient nullable:true
    }

    String pharmacyName
    int prescriptionNumber
    String medicine
    Date daysSupply
    BigDecimal totalCost
    Date dateIssued

    String toString(){
        return (medicine + " " + patient? patientName())
    }

    static belongsTo = [doctor:Doctor, patient:Patient]

}

