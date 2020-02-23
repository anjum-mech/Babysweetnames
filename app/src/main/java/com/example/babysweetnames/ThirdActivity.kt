package com.example.babysweetnames

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        image3.setOnClickListener {
            Toast.makeText(this,"Thank you for selecting Gender",Toast.LENGTH_LONG).show()

            val intent = Intent(this,BoyActivity::class.java)
            startActivity(intent)
        }
    }
}