package br.senai.sp.jandira.everypetspp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import br.senai.sp.jandira.everypetspp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBoard : AppCompatActivity(), View.OnClickListener {
//    private lateinit var buttonHome: Button
//    private lateinit var buttonPerfil: Button
//    private lateinit var buttonCarrinho: Button

    ///////
    private lateinit var btnCarrinho  : ImageView

    private lateinit var homeFragment: HomeFragment
    private lateinit var pesquisaFragment: PesquisaFragment
    private lateinit var carrinhoFragment: CarrinhoFragment
    private lateinit var perfilFragment: PerfilFragment
    private lateinit var meuPetFragment: MeuPetFragment
    private lateinit var bottom_navigation : BottomNavigationView

    //

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dash_board)

//        buttonHome = findViewById(R.id.button_home)
//
//        buttonPerfil = findViewById(R.id.button_perfil)
//
//        buttonCarrinho = findViewById(R.id.button_carrinho)

        //////
        btnCarrinho = findViewById(R.id.button_carrinho)
        btnCarrinho.setOnClickListener(this)


        homeFragment = HomeFragment()
        pesquisaFragment = PesquisaFragment()
        carrinhoFragment = CarrinhoFragment()
        perfilFragment= PerfilFragment()
        meuPetFragment = MeuPetFragment()

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        //
        bottom_navigation = findViewById(R.id.bottom_navigation)

        setFragment(homeFragment)
        bottom_navigation.selectedItemId = R.id.menu_home


//
//        bottom_navigation.selectedItemId = R.id.ic_home
//
//        buttonHome.setOnClickListener {
//            setFragment(homeFragment)
//        }
//        buttonPerfil.setOnClickListener {
//            setFragment(perfilFragment)
//        }
//        buttonCarrinho.setOnClickListener {
//            setFragment(carrinhoFragment)
//        }

        bottomNavigationView.setOnItemSelectedListener {
            onNavigationItemSelected(it)
        }

    }

    private fun setFragment(fragment: Fragment) {

        val fragmentTrasaction = //gerencia os fragmentos/ transacoes
            supportFragmentManager.beginTransaction()
        fragmentTrasaction.replace(R.id.frame_fragments, fragment)
        //faz a acontecer
        fragmentTrasaction.commit()

    }

    fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.i("xpto", "caiu")
        when (item.itemId) {
            R.id.menu_home -> {
                setFragment(homeFragment)
            }
            R.id.menu_pesquisa -> {
                setFragment(pesquisaFragment)
            }
            R.id.menu_perfil ->{
                setFragment(perfilFragment)
            }
            R.id.menu_meu_pet ->{
                setFragment(meuPetFragment)
            }
            else -> {
                setFragment(carrinhoFragment)
            }
        }
        return true
    }
    ///////
    override fun onClick(v: View) {
        when (v.id){
            R.id.button_carrinho ->{
                setFragment(carrinhoFragment)
                bottom_navigation.selectedItemId = R.id.menu_carrinho
            }
        }
    }


}