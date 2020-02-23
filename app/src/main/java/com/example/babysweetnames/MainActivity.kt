package com.example.babysweetnames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Welcome.setOnClickListener {
            Toast.makeText(this,"Welcome to Baby sweet names",Toast.LENGTH_LONG).show()

          val  intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }

}
