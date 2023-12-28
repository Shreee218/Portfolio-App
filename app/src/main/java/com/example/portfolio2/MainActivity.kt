package com.example.portfolio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills= findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent = Intent (this, MainSkillsActivity2::class.java)
            startActivity(intent)
        }
    }
}