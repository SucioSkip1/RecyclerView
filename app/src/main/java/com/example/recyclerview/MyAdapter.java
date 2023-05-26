package com.example.recyclerview;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private final List<String> NombreBanda,des,gps;
    private final List<Integer> logo;

    //Crear una variable de instancia
    private OnItemClickListener listener;
    public MyAdapter(List<String> NombreBanda, List<String> des, List<String> gps, List<Integer> logo)
    {
        this.NombreBanda = NombreBanda;
        this.des = des;
        this.gps = gps;
        this.logo = logo;
    }




    //Creación del item en el holder:
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }
    //mapeo de los datos a la vista del item
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtTitulo.setText(NombreBanda.get(position));
        holder.txtDes.setText(des.get(position));
       holder.imageView.setImageResource(logo.get(position));



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int pos = holder.getAbsoluteAdapterPosition();
                    listener.onItemClick(pos);
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return NombreBanda.size();
    }
    //La interfaz y el metodo de setOnItemClickListener
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
        //Clase del holder para identificar las vistas
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitulo,txtDes;
        public ImageView imageView;

        public ViewHolder( View itemView) {
            super(itemView);
            txtTitulo= itemView.findViewById(R.id.txtTitulo);
            txtDes = itemView.findViewById(R.id.txtDes);
            imageView = itemView.findViewById(R.id.logoBanda);
        }

    }
    //Tamaño de la lista


}
