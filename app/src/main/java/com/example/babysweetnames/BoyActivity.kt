package com.example.babysweetnames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.babysweetnames.boyfragments.A1Fragment
import com.example.babysweetnames.boyfragments.B1Fragment
import kotlinx.android.synthetic.main.activity_boy.*

class BoyActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boy)

        loadA1(A1Fragment())
        btnA1.setOnClickListener {
            loadA1(A1Fragment())
        }
        btnB1.setOnClickListener {
            loadB1(B1Fragment())
        }


    }

    private fun loadA1(frag1 : A1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragmentboy,frag1)
        ft.commit()
    }

    private fun loadB1(frag2 : B1Fragment){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragmentboy,frag2)
        ft.commit()
    }
}