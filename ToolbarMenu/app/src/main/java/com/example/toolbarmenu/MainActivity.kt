package com.example.toolbarmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbarmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            startActivity(Intent(this,Ej1MenuOpcionesActivity::class.java))
        }

        binding.button2.setOnClickListener{
            startActivity(Intent(this,Ej2MenuOpcionesActivity::class.java))
        }

        binding.button3.setOnClickListener{
            startActivity(Intent(this,Ej3AtrasActivity::class.java))
        }

        binding.button4.setOnClickListener{
            startActivity(Intent(this,Ej4ContextMenuActivity::class.java))
        }

        binding.button42.setOnClickListener{
            startActivity(Intent(this,Ej4ContextMenu2Activity::class.java))
        }
    }
}