package com.example.intents_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.name)
        var email = findViewById<EditText>(R.id.email)
        var number = findViewById<EditText>(R.id.phone)
        var but = findViewById<Button>(R.id.submit)

        but.setOnClickListener{

            val intent  = Intent(this,SecondActivity::class.java)
            intent.putExtra("Name",name.text.toString())
            intent.putExtra("Email",email.text.toString())
            intent.putExtra("Number",number.text.toString())
            startActivity(intent)
        }


        val action = supportActionBar
        action!!.title = "Main Activity"
    }
}