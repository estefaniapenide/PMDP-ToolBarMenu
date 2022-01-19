package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.NavUtils
import com.example.toolbarmenu.databinding.ActivityEj3AtrasBinding

class Ej3AtrasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj3AtrasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj3AtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        /*Añadiendo en el manifest dentro de esta activity lo siguiente no hace falta añadirle la funcion en la que se usa super.onBackPressed:
        <meta-data
            android:name="android.support.PARENT_ACTIVITY"
            android:value="com.example.toolbarmenu.MainActivity" />
         */
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu2,menu)
        return super.onCreateOptionsMenu(menu)
    }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->super.onBackPressed()
        }
        return true
    }
}