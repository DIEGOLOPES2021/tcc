package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import br.senai.sp.jandira.everypetspp.R
import br.senai.sp.jandira.everypetspp.utils.MaskFormatUtil

class Localizacao : AppCompatActivity() {
    lateinit var edCep: EditText
    lateinit var  proximaTela: Button
    lateinit var voltar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localizacao)

        proximaTela = findViewById(R.id.btn_localizacao)
        proximaTela.setOnClickListener {
            Trocartela()
        }
        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
        //mascara cep

        edCep=findViewById(R.id.ed_cep)
        edCep.addTextChangedListener(
            MaskFormatUtil.mask(
                edCep,
                MaskFormatUtil.FORMAT_CEP
            )
        )
    }
    private fun Trocartela(){
        val intent = Intent(this, RegistrarPet::class.java)
        startActivity(intent)
    }
}

