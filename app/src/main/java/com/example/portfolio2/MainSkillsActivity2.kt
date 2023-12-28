package com.example.portfolio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainSkillsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_skills2)

        val buttonBack= findViewById<Button>(R.id.btnBack)
        buttonBack.setOnClickListener {
            intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}