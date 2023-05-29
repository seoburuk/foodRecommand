package com.professionalandroid.apps.foodrecommand

import QuestionsActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart: Button = findViewById(R.id.btn_start)
        buttonStart.setOnClickListener {
            val intent = Intent(this@MainActivity, QuestionsActivity::class.java)
            //intent.putExtra(Constants.USER_NAME, etName.text.toString())
            startActivity(intent)
            finish()
        }
    }
}