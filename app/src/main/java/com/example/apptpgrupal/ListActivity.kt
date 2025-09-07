package com.example.apptpgrupal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerMeses)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val meses = mutableListOf<String>()
        meses.add("Enero")
        meses.add("Febrero")
        meses.add("Marzo")
        meses.add("Abril")
        meses.add("Mayo")
        meses.add("Junio")
        meses.add("Julio")
        meses.add("Agosto")
        meses.add("Septiembre")
        meses.add("Octubre")
        meses.add("Noviembre")
        meses.add("Diciembre")

        

        val adapter = MesAdapter(meses) { mesSeleccionado ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("MES_SELECCIONADO", mesSeleccionado)
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}

