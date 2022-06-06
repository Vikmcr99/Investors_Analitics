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
import com.example.analiticsinvertidors.databinding.FragmentQuestionThreeBinding


class QuestionThree : Fragment() {

    private var _binding : FragmentQuestionThreeBinding?=null
    private val binding get()= _binding!!

    val args : QuestionThreeArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionThreeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvPonto.text = args.ponto.toString()

        _binding!!.btnQuestionTwo.setOnClickListener{
            val direction = QuestionThreeDirections

            if(binding.rb2A.isChecked)
            {
                val action = direction.navigateToQuestionfour(args.ponto)
                findNavController().navigate(action)
            }

            if(binding.rb2B.isChecked)
            {
                val action = direction.navigateToQuestionfour(args.ponto + 2)
                findNavController().navigate(action)
            }

            if(binding.rb2C.isChecked)
            {
                val action = direction.navigateToQuestionfour(args.ponto + 4)
                findNavController().navigate(action)
            }

            if(binding.rb2D.isChecked)
            {
                val action = direction.navigateToQuestionfour(args.ponto + 5)
                findNavController().navigate(action)
            }

        }

        return view
    }

}