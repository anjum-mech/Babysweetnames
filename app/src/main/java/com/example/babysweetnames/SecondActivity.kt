package com.example.babysweetnames


import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        image1.setOnClickListener {
            Toast.makeText(this, "Thank you for selecting Gender", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }


        }







    }




