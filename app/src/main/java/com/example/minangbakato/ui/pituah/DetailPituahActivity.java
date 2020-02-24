package com.example.minangbakato.ui.pituah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;

public class DetailPituahActivity extends AppCompatActivity {

    TextView key, arti, kategori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pituah);
        key = findViewById(R.id.keyword_detail);
        arti = findViewById(R.id.detail_arti);
        kategori = findViewById(R.id.kategori);

        Intent detailIntent = getIntent();
        if(null != detailIntent) {
            Kamus kamusItem = detailIntent.getParcelableExtra("pituah");
            key.setText(kamusItem.getKeyword());
            arti.setText(kamusItem.getArti());
        }
        if(detailIntent.getStringExtra("jns").equals("0")){
            kategori.setText("Laki - Laki");
        }else{
            kategori.setText("Perempuan");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}
