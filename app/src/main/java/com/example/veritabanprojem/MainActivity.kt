package com.example.veritabanprojem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button>(R.id.OgrenciGiris)
        button.setOnClickListener{
            val intent= Intent (this,GirisEkrani::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.EgitmenGiris)
        button1.setOnClickListener{
            val intent= Intent (this,EgitmenGiris::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.YoneticiGİris)
        button2.setOnClickListener{
            val intent= Intent (this,Yonetici::class.java)
            startActivity(intent)
        }
        val button3=findViewById<Button>(R.id.cikis)
        button3.setOnClickListener({
            System.exit(0)
        })
    }


}