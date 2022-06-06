package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding
import com.example.analiticsinvertidors.databinding.FragmentQuestionSevenBinding


class QuestionSeven: Fragment() {

    private var _binding : FragmentQuestionSevenBinding?=null
    private val binding get()= _binding!!

    val args : QuestionSevenArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionSevenBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ6.text = args.ponto.toString()

        _binding!!.btnQuestionSix.setOnClickListener{
            val direction = QuestionSevenDirections

            if(binding.rb6A.isChecked)
            {
                val action = direction.navigateToQuestionEight(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb6B.isChecked)
            {
                val action = direction.navigateToQuestionEight(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb6C.isChecked)
            {
                val action = direction.navigateToQuestionEight(args.ponto + 3)
                findNavController().navigate(action)
            }

            if(binding.rb6D.isChecked)
            {
                val action = direction.navigateToQuestionEight(args.ponto + 4)
                findNavController().navigate(action)
            }
        }

        return view
    }

}