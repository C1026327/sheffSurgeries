package com.attendanceSystem.controller

class ReceptionistController {

    def scaffold = com.koutram.Receptionist
    def login(){

    }
    def validate(){
        def user = com.koutram.Receptionist.findByUsername(params.username)

        if (user&&user.password==params.password){
            session.user=user
            render view:'home'
        }
        else{
            flash.message="Invalid username and password."
            render view:'login'
        }
    }
    def logout = {
        session.user = null
        redirect (uri:'/')
    }
}
