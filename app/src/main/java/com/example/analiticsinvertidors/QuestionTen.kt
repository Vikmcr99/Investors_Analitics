package com.example.analiticsinvertidors

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding
import com.example.analiticsinvertidors.databinding.FragmentQuestionTenBinding


class QuestionTen : Fragment() {

    private var _binding : FragmentQuestionTenBinding?=null
    private val binding get()= _binding!!

    val args : QuestionTenArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionTenBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ9.text = args.ponto.toString()

       _binding!!.btnQuestionNine.setOnClickListener(){
           val direction = QuestionTenDirections

           if(binding.rb9D2.isChecked)
           {
               val action = direction.navigateToResults(args.ponto)
               findNavController().navigate(action)
           }

           if(binding.rb9A.isChecked)
           {
               val action = direction.navigateToResults(args.ponto + 1)
               findNavController().navigate(action)
           }

           if(binding.rb9B.isChecked)
           {
               val action = direction.navigateToResults(args.ponto + 2)
               findNavController().navigate(action)
           }

           if(binding.rb9C.isChecked)
           {
               val action = direction.navigateToResults(args.ponto + 4)
               findNavController().navigate(action)
           }
           if(binding.rb9D.isChecked)
           {
               val action = direction.navigateToResults(args.ponto + 5)
               findNavController().navigate(action)
           }
       }

        return view
    }

}