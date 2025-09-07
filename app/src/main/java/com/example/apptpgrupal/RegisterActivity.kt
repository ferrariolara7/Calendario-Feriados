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

class RegisterActivity : AppCompatActivity() {

    lateinit var editNombreUsuario : EditText
    lateinit var editEmailUsuario : EditText
    lateinit var editContraseña : EditText
    lateinit var editConfirmContraseña : EditText
    lateinit var btnRegistrarse : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        editNombreUsuario = findViewById(R.id.editNombreUsuario)
        editEmailUsuario = findViewById(R.id.editEmailUsuario)
        editContraseña = findViewById(R.id.editContraseña)
        editConfirmContraseña = findViewById(R.id.editConfirmContraseña)
        btnRegistrarse = findViewById(R.id.btnRegistrarse)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.listaCalendario)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnRegistrarse.setOnClickListener {

            if (editNombreUsuario.text.toString().isEmpty() || editContraseña.text.toString()
                    .isEmpty()
                || editEmailUsuario.text.toString()
                    .isEmpty() || editConfirmContraseña.text.toString().isEmpty()
            ) {
                Toast.makeText(this, "Completar Datos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ListActivity::class.java)
                startActivity(intent)
            }
        }
    }
}