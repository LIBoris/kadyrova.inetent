package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val imageView = findViewById<ImageView>(R.id.image1)

        imageView.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }

    }
}