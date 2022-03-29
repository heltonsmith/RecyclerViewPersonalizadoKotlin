package com.heltonbustos.recy

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class AdaptadorKotlin(var context: Context, var listDatos: ArrayList<PersonajeKotlin>) :
    RecyclerView.Adapter<AdaptadorKotlin.ViewHolderDatos>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDatos {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_recycler, null, false)
        return ViewHolderDatos(view)
    }

    override fun onBindViewHolder(holder: ViewHolderDatos, position: Int) {
        holder.itemView.animation =
            AnimationUtils.loadAnimation(context, R.anim.fade_transition)
        holder.texto.text = listDatos[position].texto
        holder.des.text = listDatos[position].des
        holder.imagen.setImageResource(listDatos[position].imagen)
    }

    override fun getItemCount(): Int {
        return listDatos.size
    }

    inner class ViewHolderDatos(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagen: ImageView
        var texto: TextView
        var des: TextView

        init {
            imagen = itemView.findViewById(R.id.myImagen)
            texto = itemView.findViewById(R.id.myDato)
            des = itemView.findViewById(R.id.myDes)
        }
    }
}