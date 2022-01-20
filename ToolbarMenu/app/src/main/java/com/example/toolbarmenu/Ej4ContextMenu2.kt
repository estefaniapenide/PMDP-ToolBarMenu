package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.toolbarmenu.databinding.ActivityEj4ContextMenu2Binding

class Ej4ContextMenu2 : AppCompatActivity() {

    private lateinit var binding: ActivityEj4ContextMenu2Binding
    private lateinit var vistaActual:View

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityEj4ContextMenu2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tv1.setOnClickListener{clickNormal()}

        registerForContextMenu(binding.tv1)
        registerForContextMenu(binding.tv2)
       // registerForContextMenu(this as view)

    }

    fun clickNormal(){
        Toast.makeText(this,"Mantén pulsado más tiempo",Toast.LENGTH_LONG).show()
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        vistaActual=v!!
        if(vistaActual==binding.tv1 || vistaActual==binding.tv2) {
            menuInflater.inflate(R.menu.menu4_menu_contextual_ocultar, menu)
        }else {
            menuInflater.inflate(R.menu.menu4_menu_contextual_mostrar, menu)
        }
        menu!!.setHeaderTitle("Menú contextual")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mc_ocultar->{vistaActual.visibility=View.INVISIBLE}
            R.id.mc_mostrar_arriba->{binding.tv1.visibility=View.VISIBLE}
            R.id.mc_mostrar_abajo->{binding.tv2.visibility=View.VISIBLE}
        }
        return super.onContextItemSelected(item)
    }
}