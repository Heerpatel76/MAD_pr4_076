package com.example.mad_pr4_076

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login: Button =findViewById(R.id.login)
        val register: Button =findViewById(R.id.register)

        login.setOnClickListener()
        {
            val i = Intent(this,LoginActivity :: class.java)
            startActivity(i)
        }

        register.setOnClickListener()
        {
            val i = Intent(this,RegisterActivity :: class.java)
            startActivity(i)
        }
    }
}