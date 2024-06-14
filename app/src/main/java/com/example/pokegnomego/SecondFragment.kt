package com.example.pokegnomego

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.pokegnomego.R
import com.example.pokegnomego.databinding.FragmentSecondBinding



/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        val buttonX: Button = binding.buttonSecond
        val imageY: ImageView = binding.gnomeShaker

        // Set an OnClickListener on the button
        buttonX.setOnClickListener {
            // Change the image resource of the ImageView
            imageY.setImageResource(R.drawable.android)
        }

        return binding.root

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}