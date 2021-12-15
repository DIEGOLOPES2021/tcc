package br.senai.sp.jandira.everypetspp.data

import com.google.gson.annotations.SerializedName

data class Adress (

        @SerializedName("name_adress")
        var name_adress: String,

        @SerializedName("number")
        var number: String,

        @SerializedName("cep")
        var cep: String,

        @SerializedName("district")
        var district: String,

        @SerializedName("complement")
        var complement: String,

        @SerializedName("city")
        var city: String,

        @SerializedName("state")
        var state: String,

        @SerializedName("initials_state")
        var initials_state: String

)

