package com.example.a9weeks


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.example.a9weeks.databinding.ActivitySignupBinding


class SignupActivity : AppCompatActivity() {
    lateinit var binding : ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}