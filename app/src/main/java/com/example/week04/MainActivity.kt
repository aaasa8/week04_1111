package com.example.week04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        val name = findViewById<EditText>(R.id.etName)
        val phone = findViewById<EditText>(R.id.etPhone)
        val btnHello = findViewById<Button>(R.id.btnHello)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnHello.setOnClickListener {
            val msg = name.getText().toString()
            val msg2 = name.getText().toString()
        }

        btnExit.setOnClickListener {

        }

    }
}