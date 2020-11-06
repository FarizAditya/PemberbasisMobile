package com.tugastengahsemester.farhanrizkyaditya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.tugastengahsemester.farhanrizkyaditya.R
class FragmentJungleList : AppCompatActivity(), View.OnClickListener{
    private lateinit var gambar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_jungle_list)
        gambar = findViewById(R.id.back5)
        gambar.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.back5->{
                val kemabli = Intent(this@FragmentJungleList, DaftarRoleLol::class.java)
                startActivity(kemabli)
            }
        }
    }
}