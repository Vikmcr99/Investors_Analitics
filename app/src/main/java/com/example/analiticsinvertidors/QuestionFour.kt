package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionFourBinding
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding


class QuestionFour : Fragment() {

    private var _binding : FragmentQuestionFourBinding?=null
    private val binding get()= _binding!!

    val args : QuestionFourArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionFourBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ2.text = args.ponto.toString()

        _binding!!.btnQuestionThree.setOnClickListener{

            val direction = QuestionFourDirections

            if(binding.rb3A.isChecked)
            {
                val action = direction.navigateToQuestionFive(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb3B.isChecked)
            {
                val action = direction.navigateToQuestionFive(args.ponto + 1)
                findNavController().navigate(action)
            }

            if(binding.rb3C.isChecked)
            {
                val action = direction.navigateToQuestionFive(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb3D.isChecked)
            {
                val action = direction.navigateToQuestionFive(args.ponto + 4)
                findNavController().navigate(action)
            }
        }

        return view
    }

}