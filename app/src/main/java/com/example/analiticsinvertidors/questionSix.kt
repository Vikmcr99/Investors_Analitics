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
import com.example.analiticsinvertidors.databinding.FragmentQuestionSixBinding


class questionSix : Fragment() {

    private var _binding : FragmentQuestionSixBinding?=null
    private val binding get()= _binding!!

    val args : questionSixArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionSixBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPontoQ5.text = args.ponto.toString()

        _binding!!.btnQuestionFive.setOnClickListener{

            val direction = questionSixDirections

            if(binding.rb5A.isChecked)
            {
                val action = direction.navigateToQuestionSeven(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb5B.isChecked)
            {
                val action = direction.navigateToQuestionSeven(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb5C.isChecked)
            {
                val action = direction.navigateToQuestionSeven(args.ponto + 4)
                findNavController().navigate(action)
            }


        }

        return view
    }

}