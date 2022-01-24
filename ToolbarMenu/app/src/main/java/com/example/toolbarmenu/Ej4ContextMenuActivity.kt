package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.MenuInflater
import android.view.View
import android.widget.AdapterView
import com.example.toolbarmenu.databinding.ActivityEj4ContextMenuBinding

class Ej4ContextMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj4ContextMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityEj4ContextMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        registerForContextMenu(binding.textView)

    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View?, menuInfo: ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu2, menu)
        menu.setHeaderTitle("Menú contextual")
    }
}