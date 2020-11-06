package com.tugastengahsemester.farhanrizkyaditya.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.tugastengahsemester.farhanrizkyaditya.R

class DaftarRoleLol : AppCompatActivity(), View.OnClickListener{
    private lateinit var gambar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_role_lol)
        gambar = findViewById(R.id.kembaliKeBeranda)
        gambar.setOnClickListener(this)
        gambar = findViewById(R.id.image1)
        gambar.setOnClickListener(this)
        gambar = findViewById(R.id.image2)
        gambar.setOnClickListener(this)
        gambar = findViewById(R.id.image3)
        gambar.setOnClickListener(this)
        gambar = findViewById(R.id.image4)
        gambar.setOnClickListener(this)
        gambar = findViewById(R.id.image5)
        gambar.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.kembaliKeBeranda->{
                val midlaner = Intent(this@DaftarRoleLol, HomeActivity::class.java)
                startActivity(midlaner)
            }
            R.id.image1->{
                val golaner = Intent(this@DaftarRoleLol, FragmentMidLanerList::class.java)
                startActivity(golaner)
            }
            R.id.image2->{
                val gobottom = Intent(this@DaftarRoleLol, FragmentTopLanerList::class.java)
                startActivity(gobottom)
            }
            R.id.image3->{
                val gobottom = Intent(this@DaftarRoleLol, FragmentBottomLanerList::class.java)
                startActivity(gobottom)
            }
            R.id.image4->{
                val gosupport = Intent(this@DaftarRoleLol, FragmentSupportList::class.java)
                startActivity(gosupport)
            }
            R.id.image5->{
                val gojungle = Intent(this@DaftarRoleLol, FragmentJungleList::class.java)
                startActivity(gojungle)
            }
        }
    }
}