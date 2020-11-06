package com.tugastengahsemester.farhanrizkyaditya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.tugastengahsemester.farhanrizkyaditya.R

class FragmentTopLanerList : AppCompatActivity(), View.OnClickListener{
    private lateinit var gambar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_top_laner_list)
        gambar = findViewById(R.id.back2)
        gambar.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.back2->{
                val kemabli = Intent(this@FragmentTopLanerList, DaftarRoleLol::class.java)
                startActivity(kemabli)
            }
        }
    }
}