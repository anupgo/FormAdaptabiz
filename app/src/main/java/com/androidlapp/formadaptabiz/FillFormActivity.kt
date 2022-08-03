package com.androidlapp.formadaptabiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androidlapp.formadaptabiz.databinding.ActivityFillFormBinding

class FillFormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFillFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFillFormBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addNew.setOnClickListener {
            checkInput()
        }
    }

    private fun checkInput() {

        if (binding.editName.text.toString().isNullOrEmpty()
                .not() && binding.editEmail.text.toString().isNullOrEmpty().not()
            && binding.editPhone.text.toString().isNullOrEmpty()
                .not() && !binding.editDesc.text.toString().isNullOrEmpty().not()
        ) {
            Toast.makeText(this,"All field is required",Toast.LENGTH_SHORT).show()
        }
//        else if (!binding.male.isChecked || !binding.female.isChecked){
//            Toast.makeText(this, "All fields are required",Toast.LENGTH_SHORT).show()
//        }
        else{
            addNewEntry()
        }
    }

    private fun addNewEntry() {

    }
}