package com.akator369.petagram.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akator369.petagram.Mascota;
import com.akator369.petagram.R;
import com.akator369.petagram.adapter.MascotaAdaptador;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        int nColumnas=3;

        GridLayoutManager glm = new GridLayoutManager(getActivity(), nColumnas);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        listaMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas, getActivity());
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
