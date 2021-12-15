package br.senai.sp.jandira.everypetspp.model

import br.senai.sp.jandira.everypetspp.data.User
import com.google.gson.annotations.SerializedName

class Login{
    var email: String = ""
    var password:String = ""
    //part of rsponse
    var user: UserRes = UserRes()
    var token:String = ""
}

class UserRes {
    var email: String = ""
}