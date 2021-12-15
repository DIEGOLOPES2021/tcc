package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.senai.sp.jandira.everypetspp.R
import br.senai.sp.jandira.everypetspp.api.MainApiEveryPet
import br.senai.sp.jandira.everypetspp.model.Login
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var ed_email: EditText
    lateinit var ed_password: EditText
    lateinit var btn_login: Button

    lateinit var edCrieSuaConta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_email = findViewById(R.id.ed_email)
        ed_password = findViewById(R.id.ed_password)
        btn_login = findViewById(R.id.btn_login)
        edCrieSuaConta = findViewById(R.id.ed_criar_conta)

        btn_login.setOnClickListener {
            Log.i("Xpto Validate Form Lo", validateForm().toString())
            if(validateForm()){
                login()
            }else{
                Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_LONG)
            }
        }
        edCrieSuaConta.setOnClickListener {
            Trocartela()
        }
    }

    private fun Trocartela(){
        val intent = Intent(this, CadastroEmail::class.java)
        startActivity(intent)
    }

    private fun validateForm(): Boolean {
        var formValide: Boolean = true

        if(ed_email.text.isEmpty()){
            ed_email.error = "Campo vazio"
            formValide = false
        }else if(ed_password.text.isEmpty()){
            ed_password.error = "Campo vazio"
            formValide = true
        }
        return formValide
    }

    private fun login(){

        var login: Login = Login()
        login.email = ed_email.text.toString()
        login.password = ed_password.text.toString()

        val remote = MainApiEveryPet.MainEndPoint().sessionsService()
        val call: Call<Login> = remote.login(login)


        //call api login
        call.enqueue(object : Callback<Login> {
            override fun onResponse(call: Call<Login>, response: Response<Login>) {

                Log.i("XPTO LOGIN sucess", response.body().toString())

            }

            override fun onFailure(call: Call<Login>, error: Throwable) {
                Toast.makeText(applicationContext, "Erro ao fazer login!", Toast.LENGTH_LONG).show()
                Log.i("XPTO LOGIN error", error.message.toString())
            }
        })
    }
}