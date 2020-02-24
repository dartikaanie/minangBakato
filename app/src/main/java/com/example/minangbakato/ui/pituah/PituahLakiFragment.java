package com.example.minangbakato.ui.pituah;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;
import com.example.minangbakato.ui.petatah.PepatahAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PituahLakiFragment extends Fragment implements PepatahAdapter.OnKlikKeyword{


    RecyclerView rvKamus;
    PepatahAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pituah_perempuan, container, false);
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
        //LAki- Laki
        kamusList.add(new Kamus("Hati lapang paham tak sampik \n" +
                "Pandai maninbang jo manaka \n" +
                "Walau batenggang di nan rumik \n" +
                "Indak bakisa di nan bana", "Disaat bekerja dengan siapapun, tetaplah berpegang pada prinsip kejujuran, menjunjung norma agama, mengatahui mana yang benar dan salah serta jangan melupakan adanya Allah SWT"));
        kamusList.add(new Kamus("Di nan dalam tak bagalombang \n" +
                "Di nan dangka nyo tak bariak  \n" +
                "Di sakik hiduik indak tagamang  \n" +
                "Ka nan kuaso inyo mamintak", " Seberat dan sebesar apapun cobaan hidup yang dialami, tetaplah meminta pertolongan kepada Allah SWT, karena memang Dia-lah tempat meminta dan mengabulkan hajat, bukan malah berlaku Musrik dengan menyekutukan-Nya."));
        kamusList.add(new Kamus("Iman nyo taguah bapandirian \n" +
                "Ba istiqamah ba tauhid pulo \n" +
                "Dek kawan-kawan jadi panutan \n" +
                "Rang kampuang sayang kasadoannyo", "Jadilah orang yang selalu disenangi dan disukai oleh siapapun, baik itu karena kecerdasan, kebaikan, motivator dan sahabat bagi siapa saja, dalam keadaan suka maupun duka. Dengan begitu, lingkungan akan menyenangi kehadiran kamu diantara mereka."));
        kamusList.add(new Kamus("Indak mangecek ba hati nan kusuik \n" +
                "Muko nan janiah di nampakkan \n" +
                "Walau harimau di dalam paruik \n" +
                "Kambiang juo nan di kaluakan", "Bagaimanapun orang lain memperlakukan kamu, jadilah orang yang memiliki jiwa penyabar dan lemah lembut kepada siapapun. Meski saat itu kamu sedang berada dalam kemarahan besar, tetap perlihatkan senyuman, disertai tutur kata yang baik."));
        kamusList.add(new Kamus("Kalau baragiah jo mambari \n" +
                "ndak maharok baleh jaso \n" +
                "Jariah nan indak di kana lai \n" +
                "Bia Nan Satu manilai nyo", "Bila di masa mendatang, banyak hal baik yang kamu lakukan namun tidak lagi dianggao oleh orang banyak, jangan berkecil hati dan jangan pula mendendam, biarkan Allah SWT yang menilai semuanya."));
        kamusList.add(new Kamus("Indak barajo ka hati surang \n" +
                "Basutan ka mato inyo tido \n" +
                "Kayo katampek rang batenggang \n" +
                "Cadiak ka bakeh rang batanyo", "Bila ingin meminta bantuan soal ekonomi, carilah yang orang baik dengan harta yang baik. Begitu juga saat meminta pendapat atau bertanya suatu hal, maka carilah orang yang cerdas akan bidang tersebut."));
        kamusList.add(new Kamus("Alu tataruang patah tigo, samuik tapijak indak mati", "Jadilah laki-laki yang tegas dan bijaksana dalam bertindak, maupun saat memutuskan suatu kebijakan tertentu."));

        return kamusList;
    }

    @Override
    public void OnKlikKeyword(Kamus item) {
        Intent detail = new Intent(getActivity(), DetailPituahActivity.class);
        detail.putExtra("pituah", item);
        detail.putExtra("jns", "0");
        startActivity(detail);
    }
}
