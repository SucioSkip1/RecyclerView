package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Variables de instancia clase principal
RecyclerView Recyclerview;
private List <String> NombreBanda = new ArrayList<>();
    private List <String> Des = new ArrayList<>();
    private List <String> gps = new ArrayList<>();
    private List<Integer> listaLogos = new ArrayList();
MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Vinculacion del recycler view
        Recyclerview = findViewById(R.id.recyvlerView);
        Recyclerview.setLayoutManager(new LinearLayoutManager(this));
        //Creacion de la instancia de la lista
        adapter = new MyAdapter(NombreBanda,Des,gps,listaLogos);
        Recyclerview.setAdapter(adapter);
        //Nombres banda
        NombreBanda.add("The doors");
        NombreBanda.add("Black Sabbath");
        NombreBanda.add("Pink Floyd");
        NombreBanda.add("Ramones");
        NombreBanda.add("Dead Kennedy");
        NombreBanda.add("The Cramps");
        NombreBanda.add("The Who");
        NombreBanda.add("Roling Stones");
        NombreBanda.add("Megadeth");
        NombreBanda.add("Metallica");
        NombreBanda.add("Queen");

        //Descripciones
        Des.add("The Doors fue una banda de rock estadounidense, formada en Los Ángeles, California en julio de 1965 y disuelta en 1973.");
        Des.add("Black Sabbath fue una banda británica de heavy metal y hard rock formada en 1968 en Birmingham por Tony Iommi, Ozzy Osbourne.");
        Des.add("Pink Floyd es una banda de rock británica, fundada en Londres en 1965. Considerada un icono cultural del siglo XX.");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        Des.add("Es una banda europea jeje");
        //Lista de las bandas
        listaLogos.add(R.drawable.doors_img);
        listaLogos.add(R.drawable.vol4);
        listaLogos.add(R.drawable.pink_floyd_img);
        listaLogos.add(R.drawable.ramones_img);
        listaLogos.add(R.drawable.dk_image);
        listaLogos.add(R.drawable.cramps_img);
        listaLogos.add(R.drawable.who_img);
        listaLogos.add(R.drawable.roling_img);
        listaLogos.add(R.drawable.mega_img);
        listaLogos.add(R.drawable.metallica_img);
        listaLogos.add(R.drawable.queen_img);

        adapter.notifyDataSetChanged();
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
               Toast.makeText(getApplicationContext(),"presionaste item :"+position,Toast.LENGTH_LONG).show();

                //i.putExtra("titulo",dataList.get(position));
            }
        });
    }
}