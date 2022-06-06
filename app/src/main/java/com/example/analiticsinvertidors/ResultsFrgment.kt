package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionTenBinding
import com.example.analiticsinvertidors.databinding.FragmentResultsFrgmentBinding

class ResultsFrgment : Fragment() {

    private var _binding : FragmentResultsFrgmentBinding?=null
    private val binding get()= _binding!!

    val args : ResultsFrgmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentResultsFrgmentBinding.inflate(inflater, container, false)
        val view = binding.root

        investorProfile()



        return view
    }

    fun investorProfile(){
        if(args.ponto <= 12){
            binding.tvPontoFinal.text = "Conservador"
        }

        if(args.ponto in 13..29){
            binding.tvPontoFinal.text = "Moderado"
        }
        else
            binding.tvPontoFinal.text ="Arrojado"
    }

}