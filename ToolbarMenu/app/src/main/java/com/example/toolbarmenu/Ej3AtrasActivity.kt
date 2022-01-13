package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbarmenu.databinding.ActivityEj3AtrasBinding

class Ej3AtrasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj3AtrasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj3AtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}