package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbarmenu.databinding.ActivityEj4ContextMenuBinding

class Ej4ContextMenu : AppCompatActivity() {

    private lateinit var binding: ActivityEj4ContextMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityEj4ContextMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}