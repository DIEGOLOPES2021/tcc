package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import br.senai.sp.jandira.everypetspp.R

class CadastroEmail : AppCompatActivity() {

    lateinit var button: Button
    lateinit var voltar: ImageView
    lateinit var email: TextView
    lateinit var password: TextView
    lateinit var confirm_password: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_email)

        email = findViewById(R.id.et_email)
        password = findViewById(R.id.ed_senha)
        confirm_password = findViewById(R.id.ed_confirma)

        button = findViewById(R.id.btn_login_cadastro_email)
        button.setOnClickListener {
            if (password == confirm_password){
                Trocartela()
            }else{
                confirm_password.error = "Senhas não conferem"
            }

        }


        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun Trocartela(){
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }

}
