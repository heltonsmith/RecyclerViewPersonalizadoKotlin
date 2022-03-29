package com.heltonbustos.recy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listaPersonaje: ArrayList<PersonajeKotlin> = ArrayList()

        var myRecyclerView: RecyclerView = findViewById(R.id.myRecyclerView)

        myRecyclerView.layoutManager =
            LinearLayoutManager(applicationContext,
                LinearLayoutManager.VERTICAL, false)

        listaPersonaje.add(
            PersonajeKotlin(
                R.drawable.uno,
                "Fruta 1",
                "Frutita linda 1") )

        listaPersonaje.add( PersonajeKotlin( R.drawable.dos, "Fruta 2", "Frutita linda 2") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.tres, "Fruta 3", "Frutita linda 3") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.cuatro, "Fruta 4", "Frutita linda 4") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.cinco, "Fruta 5", "Frutita linda 5") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.seis, "Fruta 6", "Frutita linda 6") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.uno, "Fruta 1", "Frutita linda 1") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.dos, "Fruta 2", "Frutita linda 2") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.tres, "Fruta 3", "Frutita linda 3") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.cuatro, "Fruta 4", "Frutita linda 4") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.cinco, "Fruta 5", "Frutita linda 5") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.seis, "Fruta 6", "Frutita linda 6") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.uno, "Fruta 1", "Frutita linda 1") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.dos, "Fruta 2", "Frutita linda 2") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.tres, "Fruta 3", "Frutita linda 3") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.cuatro, "Fruta 4", "Frutita linda 4") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.cinco, "Fruta 5", "Frutita linda 5") )
        listaPersonaje.add( PersonajeKotlin( R.drawable.seis, "Fruta 6", "Frutita linda 6") )

        var adaptador:AdaptadorKotlin = AdaptadorKotlin(applicationContext, listaPersonaje)
        myRecyclerView.adapter = adaptador
    }
}