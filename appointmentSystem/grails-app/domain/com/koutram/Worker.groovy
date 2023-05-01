package com.koutram

class Worker extends Person {

    String email
    String username
    String password

    static constraints = {
        email(email:true)
        password(password:true)
    }

        static hasOne = [surgery: Surgery]
}
