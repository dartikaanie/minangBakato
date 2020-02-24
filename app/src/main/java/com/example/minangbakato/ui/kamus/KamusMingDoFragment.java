package com.example.minangbakato.ui.kamus;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;

import java.util.ArrayList;

public class KamusMingDoFragment extends Fragment implements KamusAdapter.OnKlikKeyword {

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
        View root = inflater.inflate(R.layout.fragment_kamus_ming_do, container, false);
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
        kamusList.add(new Kamus("Barumbuang", "Pipa paralon"));
        kamusList.add(new Kamus("Dukuah", "Kalung"));
        kamusList.add(new Kamus("Kida", "Kiri"));
        kamusList.add(new Kamus("Pinggan", "Piring"));
        kamusList.add(new Kamus("Pituluik", "Pensil"));
        kamusList.add(new Kamus("Roman", "wajah"));
        kamusList.add(new Kamus("Sonduak", "Sendok nasi"));
        kamusList.add(new Kamus("Suluah", "Obor"));
        kamusList.add(new Kamus("Talam", "Nampan"));
        kamusList.add(new Kamus("Sukuang", "Bantal"));
        return kamusList;
    }

    @Override
    public void OnKlikKeyword(Kamus kamusItem) {

    }
}
