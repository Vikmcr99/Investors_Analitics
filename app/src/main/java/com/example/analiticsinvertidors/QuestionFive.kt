package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionFiveBinding
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding


class QuestionFive : Fragment() {

    private var _binding : FragmentQuestionFiveBinding?=null
    private val binding get()= _binding!!

    val args : QuestionFiveArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionFiveBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ4.text = args.ponto.toString()

        _binding!!.btnQuestionFour.setOnClickListener{

            val direction = QuestionFiveDirections

            if(binding.rb4A.isChecked)
            {
                val action = direction.navigateToQuestionSix(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb4B.isChecked)
            {
                val action = direction.navigateToQuestionSix(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb4C.isChecked)
            {
                val action = direction.navigateToQuestionSix(args.ponto + 4)
                findNavController().navigate(action)
            }


        }

        return view
    }

}