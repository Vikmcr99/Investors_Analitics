package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionNineBinding



class QuestionNine : Fragment() {

    private var _binding : FragmentQuestionNineBinding?=null
    private val binding get()= _binding!!

    val args: QuestionNineArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionNineBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ8.text = args.ponto.toString()

        _binding!!.btnQuestionEight.setOnClickListener{
            val direction = QuestionNineDirections

            if(binding.rb8A.isChecked)
            {
                val action = direction.navigateToQuestionTen(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb8B.isChecked)
            {
                val action = direction.navigateToQuestionTen(args.ponto + 1)
                findNavController().navigate(action)
            }

            if(binding.rb8C.isChecked)
            {
                val action = direction.navigateToQuestionTen(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb8D.isChecked)
            {
                val action = direction.navigateToQuestionTen(args.ponto + 4)
                findNavController().navigate(action)
            }
        }

        return view
    }

}