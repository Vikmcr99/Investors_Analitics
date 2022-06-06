package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionEightBinding
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding


class QuestionEight : Fragment() {

    private var _binding : FragmentQuestionEightBinding?=null
    private val binding get()= _binding!!

    val args : QuestionEightArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionEightBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ7.text = args.ponto.toString()

        _binding!!.btnQuestionSeven.setOnClickListener{
            val direction = QuestionEightDirections

            if(binding.rb7A.isChecked)
            {
                val action = direction.navigateToQuestionNine(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb7B.isChecked)
            {
                val action = direction.navigateToQuestionNine(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb7C.isChecked)
            {
                val action = direction.navigateToQuestionNine(args.ponto + 3)
                findNavController().navigate(action)
            }

            if(binding.rb7D.isChecked)
            {
                val action = direction.navigateToQuestionNine(args.ponto + 4)
                findNavController().navigate(action)
            }
        }

        return view
    }

}