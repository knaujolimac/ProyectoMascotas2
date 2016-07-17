package com.knaujolimac.proyectomascotas.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.knaujolimac.miappcorporativa.R;
import com.knaujolimac.proyectomascotas.pojo.Mascota;
import com.knaujolimac.proyectomascotas.adapter.MascotaAdaptador;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MascotasFragment extends Fragment {

    ArrayList<Mascota> listMascotas;
    private RecyclerView rvMascotas;


    public MascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mascotas,container,false);

        rvMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

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
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(this.listMascotas, getActivity(),this);
        rvMascotas.setAdapter(mascotaAdaptador);
    }

    /**
     * Método encargado de inicializar las mascotas
     */
    private void inicializarMascotas() {
        listMascotas = new ArrayList<Mascota>();
        listMascotas.add(new Mascota(R.drawable.perroa, "Ander"));
        listMascotas.add(new Mascota(R.drawable.perrob, "Barry"));
        listMascotas.add(new Mascota(R.drawable.perroc, "Bruno"));
        listMascotas.add(new Mascota(R.drawable.perrod, "Chispita"));
        listMascotas.add(new Mascota(R.drawable.perroe, "Chispi"));
        listMascotas.add(new Mascota(R.drawable.perrof, "Dardo"));
        listMascotas.add(new Mascota(R.drawable.perrog, "Deus"));
        listMascotas.add(new Mascota(R.drawable.perroh, "Darwin"));
        listMascotas.add(new Mascota(R.drawable.gatoa, "Diosa"));
        listMascotas.add(new Mascota(R.drawable.gatob, "Dinamita"));
        listMascotas.add(new Mascota(R.drawable.gatoc, "Cash"));
        listMascotas.add(new Mascota(R.drawable.gatod, "Cornelius"));
    }

    /**
     * Método encargado de actualizar los valores de la lista principal
     *
     * @param mascota
     * @param index
     */
    public void actualizarObjetoLista(Mascota mascota, int index) {
        listMascotas.set(index, mascota);
    }

}
