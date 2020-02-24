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

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;
import com.example.minangbakato.ui.petatah.PepatahAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PituahPerempuanFragment extends Fragment implements PepatahAdapter.OnKlikKeyword {

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
        //PEREMPUAN
        kamusList.add(new Kamus("Pabaiak lakuan, pa elok Taratik. Jikok datang laki dari jauah," +
                " sambuiklah jo muko manih, " +
                "hidangkanlah minum jo makannyo", "Saat suami pulang kerja atau dari bepergian karena suatu keperluan, maka sambutlah beliau dengan muka manis, penuhi apa yang dia minta, senangkan hatinya, sediakan makan dan minumnya. Bagaimanapun, kelelahan seorang suami yang pulang mencari nafkah adalah untuk kebaikan keluarga, maka dari itu, layani dia"));
        kamusList.add(new Kamus("Kok upiak nak pai ka pakan, mamintak izinlah dahulu bakeh inyo. Kok upiak naiak bendi, usahlah sabendi jo urang lain nan bukan dunsanak.", "Jika kamu hendak keluar rumah untuk menuju suatu tempat, jangan pergi tanpa seizin suami, semua hak yang berlaku ada ditangannya. Selain itu, jika bepergian menaiki kendaraan, jangan sampai bersinggungan duduk dengan orang yang bukan mukhrim. Usahakan untuk bersama-sama dengan sanak saudara"));
        kamusList.add(new Kamus("Kok padusi indak bamalu, jadi cacek saumua hiduik. Bak pintu indak bapasak, mudah rang maliang mamasukinyo. Bak parahu indak ba kamudi, biaso sasek dalam balayia.", "Pituah Minang untuk Perempuan yang tidak memiliki rasa malu, dalam artian malu yang bertujuan menjaga kehormatan dan kekhasan seorang wanita muslimah, maka akan mengalami penyesalan dan kesia-siaan seumur hidup \n" +
                "Ibarat sebuah pintu tanpa pengunci yang kuat, sehingga pencuri mudah masuk. Ibarat kapal tanpa nahkoda, akan terombang-ambing di tengah lautan. Maka dari itu, jangan jadi perempuan yang lemah soal akidah dan ilmu agama, haruslah menguasai dan memahami syariat-syariat Islam dengan baik"));
        kamusList.add(new Kamus("Oh upiak sibiran tulang, pagang bana pituah Bundo ko. Buhua dalam kabek pinggang, buruak urang dek lakunyo. Kok roman nan indak dapek diubah, tapi kok laku jo parangai lai dapek ba ubah", "Tolok ukur kualitas seseorang bisa diukur dari tingkah laku dan kepribadiannya di keluarga, lingkungan dan masyarakat. Seorang perempuan haruslah menyadari bahwa cukup rupa yang tidak bisa diubah, namun kelakuan dan perangai dapat berubah ke arah yang baik, dengan niat dan usaha yang pasti"));
        kamusList.add(new Kamus("Kok basuo jo urang lain, kok duduak ditangah rami atau didalam alek jamu, caliak nan usah dipatinggi,  mato usah dipailia. Pandang sakali lalu sajo, usahlah galak dipabahak", "Jika seorang perempuan tengah berada di tempat keramaian, terutama banyak kaum pria di situ, maka peliharalah mata dan sikap. Tidak perlu melirik kesana-kemari secara liar, cukup pandang sekali saja dan jangan pula bercengkrama hingga tertawa terbahak bersama mereka kamu pria yang bukan mukhrim dan saudara (family)."));
        kamusList.add(new Kamus("Lambak nan dari pado itu, sopan dan santun tak babateh, baso jo basi tak bahinggo, bia jo laki awak bana, janlah ilang baso basi.", "Pituah Minang di atas mengisyaratkan bahwa, sebagai seorang perempuan yang merupakan istri, meskipun dengan suami kita sendiri, jangan menghilangkan sikap basa-basi, namun harus tetap dalam batas wajar, dalam artian selaku menjaga sopan dan santun."));

        return kamusList;
    }

    @Override
    public void OnKlikKeyword(Kamus item) {
        Intent detail = new Intent(getActivity(), DetailPituahActivity.class);
        detail.putExtra("pituah", item);
        detail.putExtra("jns", "1");
        startActivity(detail);
    }
}
