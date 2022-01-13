package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.toolbarmenu.databinding.ActivityEj1MenuOpcionesBinding

class Ej1MenuOpcionesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj1MenuOpcionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityEj1MenuOpcionesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.title="TOOLBAR"
        supportActionBar!!.subtitle="toolbar"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1,menu)
        menuInflater.inflate(R.menu.menu1_delete_add,menu)
        return super.onCreateOptionsMenu(menu)
    }
}