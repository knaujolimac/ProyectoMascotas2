package com.knaujolimac.proyectomascotas.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.knaujolimac.miappcorporativa.R;
import com.knaujolimac.proyectomascotas.adapter.PerfilMascotaAdaptador;
import com.knaujolimac.proyectomascotas.pojo.Mascota;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    ArrayList<Mascota> listFotosPerfil;
    private RecyclerView rvMiPerfil;



    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil,container,false);

        rvMiPerfil = (RecyclerView) view.findViewById(R.id.rvMiPerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        rvMiPerfil.setLayoutManager(glm);

        //Inicializar mascotas
        this.inicializarMascotas();
        //Inicializar adaptador
        this.inicializarAdaptador();

        return view;
    }

    /**
     * Inicializa el adaptador
     */
    private void inicializarAdaptador() {
        PerfilMascotaAdaptador perfilMascotaAdaptador = new PerfilMascotaAdaptador(this.listFotosPerfil, getActivity());
        rvMiPerfil.setAdapter(perfilMascotaAdaptador);
    }

    /**
     * Método encargado de inicializar las mascotas
     */
    private void inicializarMascotas() {
        listFotosPerfil = new ArrayList<Mascota>();
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 15));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 20));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 30));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 7));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 4));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 3));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 2));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 7));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 6));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 15));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 20));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 30));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 15));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 20));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 30));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 7));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 4));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 3));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 2));
        listFotosPerfil.add(new Mascota(R.drawable.mascotaperfilb, 7));

    }


}
