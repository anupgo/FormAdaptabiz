package com.androidlapp.formadaptabiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidlapp.formadaptabiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addNew.setOnClickListener {
            startActivity(Intent(this,FillFormActivity::class.java))
        }

        binding.showAll.setOnClickListener {
            startActivity(Intent(this,ShowEntryActivity::class.java))
        }
    }
}