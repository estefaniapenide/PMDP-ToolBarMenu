package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbarmenu.databinding.ActivityEj5ToolbarBinding

class Ej5ToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj5ToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityEj5ToolbarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar!!.title="TOOLBAR"
        supportActionBar!!.subtitle="Creada en el layout porque estoy usando NoActionBar"
    }
}