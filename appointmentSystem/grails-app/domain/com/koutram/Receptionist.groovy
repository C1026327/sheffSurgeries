package com.koutram

class Receptionist {

    static constraints = {
        //Constraints can be defined to limit what kind of input is 
        //submitted towards this class, which is more important for verification.
    }

    String recepName
    String recepEmail
    String recepusername
    String recepPassword
    int recepPhone

    String toString(){
        recepName
    }
}
static belongsTo = [surgery:Surgery]
// Many receptionists to 1 (belongsto) surgery