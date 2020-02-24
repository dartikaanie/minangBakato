package com.example.minangbakato.ui.pituah;

import android.content.Context;
import android.net.Uri;
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
import com.example.minangbakato.ui.petatah.PepatahAdapter;

import java.util.ArrayList;

public class pituahFragment extends Fragment implements PepatahAdapter.OnKlikKeyword{

    RecyclerView rvKamus;
    PepatahAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pituah, container, false);
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
        //PEREMPUAN
        kamusList.add(new Kamus("Hati lapang paham tak sampik \n" +
                "Pandai maninbang jo manaka \n" +
                "Walau batenggang di nan rumik \n" +
                "Indak bakisa di nan bana", "Disaat bekerja dengan siapapun, tetaplah berpegang pada prinsip kejujuran, menjunjung norma agama, . . ."));
        kamusList.add(new Kamus("Di nan dalam tak bagalombang \n" +
                "Di nan dangka nyo tak bariak  \n" +
                "Di sakik hiduik indak tagamang  \n" +
                "Ka nan kuaso inyo mamintak", " Seberat dan sebesar apapun cobaan hidup yang dialami, tetaplah meminta pertolongan kepada Allah SWT, . . ."));
        kamusList.add(new Kamus("Iman nyo taguah bapandirian \n" +
                "Ba istiqamah ba tauhid pulo \n" +
                "Dek kawan-kawan jadi panutan \n" +
                "Rang kampuang sayang kasadoannyo", " adilah orang yang selalu disenangi dan disukai oleh siapapun, baik itu karena kecerdasan, . . . "));
        kamusList.add(new Kamus("Indak mangecek ba hati nan kusuik \n" +
                "Muko nan janiah di nampakkan \n" +
                "Walau harimau di dalam paruik \n" +
                "Kambiang juo nan di kaluakan", "Bagaimanapun orang lain memperlakukan kamu, jadilah orang yang memiliki jiwa penyabar dan . . ."));
        kamusList.add(new Kamus("Kalau baragiah jo mambari \n" +
                "ndak maharok baleh jaso \n" +
                "Jariah nan indak di kana lai \n" +
                "Bia Nan Satu manilai nyo", "Bila di masa mendatang, banyak hal baik yang kamu lakukan namun tidak lagi dianggap . . ."));


        return kamusList;
    }

    @Override
    public void OnKlikKeyword(Kamus kamusItem) {

    }
}
