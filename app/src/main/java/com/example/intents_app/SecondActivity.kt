package com.example.intents_app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar = supportActionBar
        if(actionBar!=null){
            actionBar!!.title = "Second Activity"
            actionBar.setDisplayHomeAsUpEnabled(true)

        }

        var intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val number = intent.getStringExtra("Number")

        val textview = findViewById<TextView>(R.id.textview)
        textview.text = "Name: "+name + "\nEmail: "+email + "\nNumber: "+number
    }
}