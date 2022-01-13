package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.toolbarmenu.databinding.ActivityEj2MenuOpcionesBinding

class Ej2MenuOpcionesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj2MenuOpcionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj2MenuOpcionesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title="TOOLBAR"
        supportActionBar!!.subtitle="toolbar"
    }

    override fun onCreateOptionsMenu(menu: Menu?):Boolean{
        menuInflater.inflate(R.menu.menu2,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item:MenuItem):Boolean{
        when(item.itemId){
            R.id.nuevo->{ Toast.makeText(this,"Añadir uno nuevo",Toast.LENGTH_LONG).show()}
            R.id.info->{ Toast.makeText(this,"Información",Toast.LENGTH_LONG).show()}
        }
        return super.onOptionsItemSelected(item)
    }
}