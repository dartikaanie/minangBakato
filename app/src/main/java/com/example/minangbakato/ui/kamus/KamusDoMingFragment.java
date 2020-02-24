package com.example.minangbakato.ui.kamus;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class KamusDoMingFragment extends Fragment implements KamusAdapter.OnKlikKeyword{
    RecyclerView rvKamus;
    KamusAdapter kamusAdapter;
    Activity activity;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity = (Activity) context;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_kamus_do_ming, container, false);
        ArrayList<Kamus> kamusList = getDataKamus();
        kamusAdapter = new KamusAdapter();
        kamusAdapter.addItem(kamusList);
        kamusAdapter.setClickHandler(this);

        rvKamus = root.findViewById(R.id.rvKamus);
        rvKamus.setAdapter(kamusAdapter);
        rvKamus.setLayoutManager(new LinearLayoutManager(activity));

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    public ArrayList<Kamus> getDataKamus() {
        ArrayList<Kamus> kamusList = new ArrayList<>();
        kamusList.add(new Kamus("Bantal" , "Sukuang"));
        kamusList.add(new Kamus("Kalung","Dukuah"));
        kamusList.add(new Kamus("Kiri", "Kida"));
        kamusList.add(new Kamus("Pipa paralon", "Barumbuang"));
        kamusList.add(new Kamus("Nampan", "Talam"));
        kamusList.add(new Kamus("Obor" , "Suluah"));
        kamusList.add(new Kamus("Pensil", "Pituluik" ));
        kamusList.add(new Kamus("Piring" , "Pinggan"));
        kamusList.add(new Kamus("Sendok nasi" , "Sonduak"));
        kamusList.add(new Kamus("wajah" , "Roman"));

        return kamusList;
    }

    @Override
    public void OnKlikKeyword(Kamus kamusItem) {

    }

}
