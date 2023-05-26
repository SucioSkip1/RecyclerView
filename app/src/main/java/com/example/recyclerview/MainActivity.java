package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
    private List <String> pagina = new ArrayList<>();
    private List <String> email = new ArrayList<>();
    private List <String> tel = new ArrayList<>();
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
        Des.add("Ramones fue una banda estadounidense de punk formada en Forest Hills, en el distrito de Queens en 1974.");
        Des.add("Dead Kennedys fue una banda estadounidense de punk rock y hardcore punk, surgida a fines de la década de 1970 en la ciudad de San Francisco.");
        Des.add("The Cramps fue una banda de punk rock estadounidense formada en 1976, activa hasta 2009.");
        Des.add("The Who es una banda británica de rock formada en 1962 con el nombre de The Detours cambió a The Who.");
        Des.add("Los Rolling Stones,es un grupo británico de rock originario de Londres. La banda fue formada en abril de 19623 por Brian Jones, Mick Jagger.");
        Des.add("Megadeth es un grupo musical estadounidense de heavy metal y thrash metal, formado en Los Ángeles, California.");
        Des.add("Metallica es un grupo estadounidense de thrash metal originario de Los Ángeles,pero con base en San Francisco.");
        Des.add("Queen es una banda británica de rock formada en 1970 en Londres, integrada por el cantante y pianista Freddie Mercury.");
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
        //GPS de las bandas
        gps.add("google.streetview:cbll=48.859417,2.393827=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=52.477873,-1.911008=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=51.516873,-0.142620=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=40.729464,-73.845649=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=50.822458,-0.430013=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=52.477873,-1.911008=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=51.516873,-0.142620=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=52.477873,-1.911008=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=40.729464,-73.845649=&cbp=3,75,158.8,77.6");
        gps.add("google.streetview:cbll=50.822458,-0.430013=&cbp=3,75,158.8,77.6");
        //pagina de las bandas
        pagina.add("https://thedoors.com");
        pagina.add("https://www.blacksabbath.com");
        pagina.add("https://www.pinkfloyd.com");
        pagina.add("https://www.ramones.com");
        pagina.add("http://www.deadkennedys.com");
        pagina.add("https://punkrockshop.co.uk/collections/cramps");
        pagina.add("https://www.thewho.com");
        pagina.add("https://rollingstones.com");
        pagina.add("https://megadeth.com");
        pagina.add("https://metallica.com");
        pagina.add("https://www.queenonlinestore.com");
        // Telefonos de las bandas
        tel.add("001");
        tel.add("002");
        tel.add("003");
        tel.add("004");
        tel.add("005");
        tel.add("006");
        tel.add("007");
        tel.add("008");
        tel.add("009");
        tel.add("010");
        tel.add("011");
        // Correo de las bandas
        email.add("the_doors_oficial@thedoors.com");
        email.add("black_sabbath_oficial@blacksabbath.com");
        email.add("pink-floyd_oficial@pinkfloyd.com");
        email.add("the_ramones_oficial@ramones.com");
         email.add("dead_kennedy_oficial@deadkennedy.com");
        email.add("the_cramps_oficial@thecramps.com");
         email.add("the_who_oficial@thewho.com");
        email.add( "megadeth_oficial@megadeth.com");
       email.add("metallica_oficial@metallica.com");
        email.add("queen_oficial@queen.com");


        adapter.notifyDataSetChanged();
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
               Toast.makeText(getApplicationContext(),"presionaste item :"+position,Toast.LENGTH_LONG).show();
                Bundle envioDatos = new Bundle();
                    envioDatos.putString("Titulo", String.valueOf(NombreBanda.get(position)));
                    envioDatos.putString("Des",String.valueOf(Des.get(position)));
                    envioDatos.putString("imgCover", String.valueOf(listaLogos.get(position)));
                        envioDatos.putString("Gps", gps.get(position));
                envioDatos.putString("web", pagina.get(position));
                envioDatos.putString("tel", tel.get(position));
                envioDatos.putString("email", email.get(position));
                Intent i = new Intent(getApplicationContext(), interCover.class);
                i.putExtras(envioDatos);
                startActivity(i);

                //i.putExtra("titulo",dataList.get(position));
            }
        });
    }
}