package com.example.analiticsinvertidors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.analiticsinvertidors.databinding.FragmentQuestionOneBinding


class QuestionOne : Fragment() {

    private var _binding : FragmentQuestionOneBinding?=null
    private val binding get()= _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionOneBinding.inflate(inflater, container, false)
        val view = binding.root

        _binding!!.btnBegin.setOnClickListener{
            val direction = QuestionOneDirections
            val name = binding.inputName.text.toString()
            val action = direction.navigateToQuestionTwo(name)
            findNavController().navigate(action)
            //Navigation.findNavController(view).navigate(R.id.navigateToQuestionTwo)
            }

        return view
    }

}