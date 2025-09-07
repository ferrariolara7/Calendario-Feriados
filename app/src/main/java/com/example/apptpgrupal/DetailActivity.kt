package com.example.apptpgrupal

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDetalle = findViewById<TextView>(R.id.tvDetalle)

        val mesSeleccionado = intent.getStringExtra("MES_SELECCIONADO") ?: "Enero"

        val todosLosFeriados = mapOf(
            "Marzo" to listOf("FERIADO/S NACIONALES:","- 3/3 Carnaval", "- 4/3 Carnaval",
                "- 24/3 Día Nacional de la Memoria por la Verdad y la Justicia", "FERIADO/S NO LABORABLE/S:",
                "- 31/3 Fiesta de la Ruptura del Ayuno del Ramadán"),
            //aca agregar mas meses despues
        )

        val feriados = todosLosFeriados[mesSeleccionado] ?: listOf("No hay feriados registrados")

        tvDetalle.text = "Feriados de $mesSeleccionado:\n\n${feriados.joinToString("\n")}"
    }
}

