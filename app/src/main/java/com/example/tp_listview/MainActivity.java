package com.example.tp_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView(){


        ArrayAdapter<Inmueble> adapter=new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv=findViewById(R.id.lista);
        lv.setAdapter(adapter);

    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"Juana Koslay",100000));
        lista.add(new Inmueble(R.drawable.casa2,"Villa Mercedes",80000));
        lista.add(new Inmueble(R.drawable.casa3,"San Luis",150000));
        lista.add(new Inmueble(R.drawable.casa4,"Nogoli",50000));
        lista.add(new Inmueble(R.drawable.casa5,"Potrero de los Funes",200000));
    }
}