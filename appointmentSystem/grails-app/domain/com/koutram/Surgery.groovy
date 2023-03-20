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
}

// Surgery belongsto Many Nurses
// Surgery belongsto many receptionists
// Surgery belongsto many doctors
// Surgery many to 1? appointment
// Surgery many to many patients.