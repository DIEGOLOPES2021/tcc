package br.senai.sp.jandira.everypetspp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import br.senai.sp.jandira.everypetspp.R


class HomeFragment : Fragment() {

//    lateinit var voltar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        voltar = view.findViewById(R.id.carrinho)
//        voltar.setOnClickListener {
//        //replace a fragment using fragment manager using kotlin
//            activity?.supportFragmentManager?.beginTransaction()
//                ?.replace(R.id.carrinho, CarrinhoFragment())
//                ?.addToBackStack(null)
//                ?.commit()
//
//        }
    }

}

