package br.senai.sp.jandira.everypetspp.data

import com.google.gson.annotations.SerializedName

data class User(
        @SerializedName("email")
        var email: String,

        @SerializedName("password")
        var password: String,

        @SerializedName("confirm_password")
        var confirm_password: String,

        @SerializedName("name")
        var name: String,

        @SerializedName("telephone")
        var telephone: String,

        @SerializedName("birth_date")
        var birth: String,

        @SerializedName("cpf")
        var cpf: String
)
