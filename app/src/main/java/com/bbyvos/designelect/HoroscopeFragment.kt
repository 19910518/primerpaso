package com.bbyvos.designelect

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bbyvos.designelect.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {
    private var _bindin: FragmentHoroscopeBinding? = null
    private val binding get() = _bindin!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bindin = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root


    }
}
