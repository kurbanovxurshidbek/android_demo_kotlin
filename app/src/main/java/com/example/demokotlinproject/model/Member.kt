package com.example.demokotlinproject.model

import java.io.Serializable

class Member(var profile:Int, var fullname:String){

    override fun toString(): String {
        return profile.toString()+ " : " + fullname;
    }
}