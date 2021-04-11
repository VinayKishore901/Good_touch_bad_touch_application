 package com.example.toycathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Menu : AppCompatActivity() {

    private lateinit var btn1 : Button
    private lateinit var btn2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var b1 = findViewById<Button>(R.id.btn1)
        var b2 = findViewById<Button>(R.id.btn2)


        b1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        b2.setOnClickListener(View.OnClickListener {
            var intent =Intent(this , Information::class.java)
            startActivity(intent)
        })

    }
}