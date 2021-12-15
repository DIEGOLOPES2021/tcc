package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import br.senai.sp.jandira.everypetspp.R

class CadastroComAnimalSalvo : AppCompatActivity() {
    lateinit var voltar: ImageView
    lateinit var  proximaTela: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_com_animal_salvo)

        proximaTela = findViewById(R.id.btn_login_cadastro_animal)
        proximaTela.setOnClickListener {
            Trocartela()
        }

        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, RegistrarPet::class.java)
            startActivity(intent)
        }


    }
    private fun Trocartela(){
        val intent = Intent(this, DashBoard::class.java)
        startActivity(intent)
    }
}