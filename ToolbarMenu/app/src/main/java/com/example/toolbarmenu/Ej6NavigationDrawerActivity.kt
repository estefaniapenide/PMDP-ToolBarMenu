package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.toolbarmenu.databinding.ActivityEj6NavigationDrawerBinding
import com.google.android.material.snackbar.Snackbar

class Ej6NavigationDrawerActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEj6NavigationDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityEj6NavigationDrawerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.contenido.barraNavegacion)
        supportActionBar!!.title="TOOLBAR"

        val botonVentNav = ActionBarDrawerToggle(this, binding.root, binding.contenido.barraNavegacion,R.string.abrir,R.string.cerrar)

        binding.root.addDrawerListener(botonVentNav)
        botonVentNav.syncState()

        binding.ventanaNavegacion.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.itemInicio-> cambio(R.string.inicio)
                R.id.itemAbout -> cambio(R.string.about)
                R.id.itemContacto -> cambio(R.string.contacto)
                R.id.itemValoracion -> cambio(R.string.valoracion)

            }
            true
        }
    }

    private fun cambio(s:String){
        binding.root.closeDrawer(GravityCompat.START)
        Snackbar.make(binding.root,s,Snackbar.LENGTH_LONG).show()
        supportActionBar!!.title=s
    }

    private fun cambio(id:Int){
        cambio(getString(id))
    }
}