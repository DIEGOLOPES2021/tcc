package br.senai.sp.jandira.everypetspp.api

import br.senai.sp.jandira.everypetspp.model.Login
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


class MainApiEveryPet {

    interface Sessions {
        @POST("sessionuser")
        fun login(@Body body: Login): Call<Login>
    }

    class MainEndPoint {
        val url = "http://10.0.0.101:8080/"
        //val url = "URL deploy"
        val service =
            Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create())
                .build()

        fun sessionsService(): Sessions {
            return service.create(Sessions::class.java)
        }
    }
}