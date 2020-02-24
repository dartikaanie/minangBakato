package com.example.minangbakato.ui.petatah;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;
import com.example.minangbakato.ui.kamus.KamusAdapter;

import java.util.ArrayList;

public class petatahFragment extends Fragment implements PepatahAdapter.OnKlikKeyword {

    RecyclerView rvKamus;
    PepatahAdapter adapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_petatah, container, false);
        ArrayList<Kamus> kamusList = getDataKamus();
        adapter = new PepatahAdapter();
        adapter.addItem(kamusList);
        adapter.setClickHandler(this);

        rvKamus = root.findViewById(R.id.rvKamus);
        rvKamus.setAdapter(adapter);
        rvKamus.setLayoutManager(new LinearLayoutManager(getContext()));
        return root;
    }

    public ArrayList<Kamus> getDataKamus() {
        ArrayList<Kamus> kamusList = new ArrayList<>();
        kamusList.add(new Kamus("Dima bumi dipijak disimpan langik di junjuang", "harus pandai menempatkan diri dimanapun berada"));
        kamusList.add(new Kamus("Lain Padang lain ilalang, lain Lubuak lain ikannyo", " setiap daerah memiliki adatnya masing-masing"));
        kamusList.add(new Kamus("Samuik tapijak indak mati", " Sifat seseorang yang tegas bertindak atas kebenaran dengan bijaksana"));
        kamusList.add(new Kamus("Walau kaie nan di bantuak, ikan di lauik nan di hadang ", "mengajak orang untuk memikirkan visi misi dari pekerjaan yang dilakukan"));
        kamusList.add(new Kamus("Buruak Muko Camin dibalah", "seseorang yang melakukan kesalahan karena kebodohannya, tapi menyalahkan orang lain atau aturan"));
        return kamusList;
    }


    @Override
    public void OnKlikKeyword(Kamus kamusItem) {

    }
}
