package com.heltonbustos.recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorDatosAntiguoJava extends RecyclerView.Adapter<AdaptadorDatosAntiguoJava.ViewHolderDatos> {

    ArrayList<PersonajeKotlin> listDatos;
    Context context;

    public AdaptadorDatosAntiguoJava(Context context, ArrayList<PersonajeKotlin> listDatos) {
        this.context = context;
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycler, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition));
        holder.texto.setText(listDatos.get(position).getTexto());
        holder.des.setText(listDatos.get(position).getDes());
        holder.imagen.setImageResource(listDatos.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        ImageView imagen;
        TextView texto;
        TextView des;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.myImagen);
            texto = itemView.findViewById(R.id.myDato);
            des = itemView.findViewById(R.id.myDes);
        }
    }
}
