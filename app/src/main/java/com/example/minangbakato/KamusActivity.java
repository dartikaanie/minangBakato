package com.example.minangbakato;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.minangbakato.ui.kamus.KamusFragment;
import com.example.minangbakato.ui.kamus.KamusMingDoFragment;
import com.example.minangbakato.ui.petatah.petatahFragment;
import com.example.minangbakato.ui.pituah.pituahFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class KamusActivity extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamus);
        toolbar = getSupportActionBar();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        toolbar.setTitle("MINANG BAKATO");
        loadFragment(new KamusFragment());
        toolbar.setSubtitle("Kamus");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.nav_kamus:
                    loadFragment(new KamusFragment());
                    toolbar.setSubtitle("Kamus");
                    return true;
                case R.id.nav_pepatah:
                    toolbar.setSubtitle("Pepatah");
                    loadFragment(new petatahFragment());
                    return true;
                case R.id.nav_pituah:
                    loadFragment(new pituahFragment());
                    toolbar.setSubtitle("Pituah");
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

//        if (fragment != null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.nav_host_fragment, fragment)
//                    .commit();
//            return true;
//        }
//        return false;
    }


//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.nav_kamus) {
//            loadFragment(new KamusMingDoFragment());
//        } else if (id == R.id.nav_pepatah) {
//            loadFragment(new petatahFragment());
//        }else if (id == R.id.nav_pituah) {
//            loadFragment(new pituahFragment());
//        }
//        return true;
//    }

}
