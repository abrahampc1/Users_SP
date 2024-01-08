package com.example.users_sp

class User (val id:Long, var name:String, var LastName: String, var url : String){

    fun getFulName() : String = "$name $LastName"

}