package br.senai.sp.jandira.everypetspp.api

import br.senai.sp.jandira.everypetspp.data.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

class retrofitFactoryUser {

    class userEndPoin{
        val url = "https://everypets-backend.herokuapp.com/"
        val service = Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()

        fun login():Login{
            return  service.create(Login::class.java)
        }
    }

    interface Login {
        @POST("/user")
        fun login(): User
    }

}
