package com.akator369.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.akator369.petagram.adapter.MascotaAdaptador;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        ImageButton favoritos = (ImageButton) findViewById(R.id.ibFavoritos);
        favoritos.setClickable(false);

        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void irFavoritos (View view){
        Intent intent = new Intent(this, Favoritos.class);
        startActivity(intent);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(mascotaAdaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.pug, "Capi"));
        mascotas.add(new Mascota(R.drawable.beagle, "Chester"));
        mascotas.add(new Mascota(R.drawable.bernese_mountain_dog, "Bob"));
        mascotas.add(new Mascota(R.drawable.german_shepherd, "Bobby"));
        mascotas.add(new Mascota(R.drawable.dachshund, "Coby"));
    }
}
