package com.example.minangbakato;

import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.minangbakato.model.Kamus;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    TextView load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        load = findViewById(R.id.loading);
        LoadData load = new LoadData();
        load.execute();
    }

    private class LoadData extends AsyncTask<Void, Integer, Void> {
        int status =0;
        double progress;
        double maxprogress = 100;

        @Override
        protected void onPreExecute() {

        }


        @Override
        protected Void doInBackground(Void... params) {
                publishProgress((int) progress);
                Double progressMaxInsert2 = 80.0;
                Double progressDiff2 = 10.0;
                publishProgress((int) maxprogress);
                try {
                    synchronized (this) {
                        publishProgress((int) maxprogress);
                    }
                } catch (Exception e) {
                }


            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Intent i = new Intent(MainActivity.this, KamusActivity.class);
            startActivity(i);
            finish();
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            String loadingDoeng = String.format(getString(R.string.loading));
            String loaddingEngdo = String.format(getString(R.string.loading));
            if(status == 1){
                load.setText(loaddingEngdo);
            }else{
                load.setText(loadingDoeng);
            }


            progressBar.setProgress(values[0]);
        }
    }


    public ArrayList<Kamus> preLoadMingDo() {
        ArrayList<Kamus> kamusList = new ArrayList<>();
        kamusList.add(new Kamus("tes", "arti"));
        return kamusList;
    }

    public ArrayList<Kamus> preLoadDoMing() {
        ArrayList<Kamus> kamusList = new ArrayList<>();
        kamusList.add(new Kamus("tes", "arti"));
        return kamusList;
    }

}
