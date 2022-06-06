package com.example.analiticsinvertidors

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding
import com.example.analiticsinvertidors.databinding.FragmentQuestionTwoBinding



class QuestionTwo : Fragment() {



    private var _binding : FragmentQuestionTwoBinding?=null
    private val binding get()= _binding!!

    val args : QuestionTwoArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionTwoBinding.inflate(inflater, container, false)
        val view = binding.root



        Toast.makeText(requireContext(), args.name, Toast.LENGTH_LONG).show()

        _binding!!.btnQuestionOne.setOnClickListener{
            val direction = QuestionTwoDirections
            val pontoA = 0
            val pontoB = 2
            val pontoC = 3
            val pontoD = 4

            if(binding.rbA.isChecked)
            {
                val action = direction.navigateToQuestionThree(pontoA)
                findNavController().navigate(action)
            }

            if(binding.rbB.isChecked)
            {
                val action = direction.navigateToQuestionThree(pontoB)
                findNavController().navigate(action)
            }


            if(binding.rbC.isChecked)
            {
                val action = direction.navigateToQuestionThree(pontoC)
                findNavController().navigate(action)
            }

            if(binding.rbD.isChecked)
            {
                val action = direction.navigateToQuestionThree(pontoD)
                findNavController().navigate(action)
            }



        }

        return view
    }

}