package com.codermonklab.medicinalplants

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_open_item.*

class OpenItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_item)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val data=intent.getSerializableExtra("DATA") as MedData
        supportActionBar!!.title=data.name
        Glide.with(applicationContext)
            .load(data.imagePath)
            .into(myZoomageView)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}