package com.zmei.a30lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.zmei.a30lessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            navigator.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.item1 -> {
                        Toast.makeText(this@MainActivity, "Item1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item2 ->  Toast.makeText(this@MainActivity, "Item2", Toast.LENGTH_SHORT).show()
                     }
                drawer.closeDrawer(GravityCompat.START)
                 true
            }
            open.setOnClickListener{
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}