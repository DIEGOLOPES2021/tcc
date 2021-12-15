package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import br.senai.sp.jandira.everypetspp.R

class RegistrarPet : AppCompatActivity() {
    lateinit var  proximaTela: Button
    lateinit var voltar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registrar_pet)
        proximaTela = findViewById(R.id.btn_registrar_pet)
        proximaTela.setOnClickListener {
            Trocartela()
        }
        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, Localizacao::class.java)
            startActivity(intent)
        }
    }
    private fun Trocartela(){
        val intent = Intent(this, CadastroComAnimalSalvo::class.java)
        startActivity(intent)
    }
}

