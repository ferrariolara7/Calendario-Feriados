package com.example.apptpgrupal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    lateinit var editUsuario : EditText
    lateinit var editContraseña: EditText
    lateinit var btnLogin : Button
    lateinit var btnRegistrarse : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.listaCalendario)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editUsuario = findViewById(R.id.editUsuario)
        editContraseña = findViewById(R.id.editContraseña)
        btnLogin = findViewById(R.id.btnLogin)
        btnRegistrarse = findViewById(R.id.btnRegistrarse)

        btnRegistrarse.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {

            if (editUsuario.text.toString().isEmpty() || editContraseña.text.toString().isEmpty()) {
                Toast.makeText(this, "Completar Datos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ListActivity::class.java)
                startActivity(intent)
            }

            }

    }
}