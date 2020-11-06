package com.tugastengahsemester.farhanrizkyaditya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tugastengahsemester.farhanrizkyaditya.R

class HomeActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        button = findViewById(R.id.next)
        button.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.next ->{
                val keDaftar = Intent(this@HomeActivity, DaftarRoleLol::class.java)
                startActivity(keDaftar)
            }
        }
    }
}