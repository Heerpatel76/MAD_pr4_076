package com.example.mad_pr4_076

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup:TextView=findViewById(R.id.signup)
        signup.setOnClickListener() {
            val i=Intent(this,RegisterActivity ::class.java).also { startActivity(it) }

        }
    }

}