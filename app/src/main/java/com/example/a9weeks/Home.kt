package com.example.a9weeks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.a9weeks.dataClass.BaseData
import com.example.a9weeks.dataClass.PostResult
import com.example.a9weeks.databinding.FragmentHomeBinding
import com.example.a9weeks.retrofitIf.RetrofitIF
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Home : Fragment() {
    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

}