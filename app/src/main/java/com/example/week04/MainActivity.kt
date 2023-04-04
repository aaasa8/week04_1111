package com.example.week04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        val name = findViewById<EditText>(R.id.etName) //xml파일 힌트 속성으로 고치기
        val phone = findViewById<EditText>(R.id.etPhone)
        val btnHello = findViewById<Button>(R.id.btnHello)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnHello.setOnClickListener {
            val msg1 = name.getText().toString()
            val msg2 = phone.getText().toString()
            val msg = "안녕하세요, 저는 " + msg1 + "입니다. 전화번호는 " + msg2 + "입니다."
            Toast.makeText(this, msg, Toast.LENGHTH_SHORT).show()
        }

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish()
            }

        })

    }
}
