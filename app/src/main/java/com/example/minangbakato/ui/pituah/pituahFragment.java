package com.example.minangbakato.ui.pituah;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;
import com.example.minangbakato.ui.kamus.KamusDoMingFragment;
import com.example.minangbakato.ui.kamus.KamusMingDoFragment;
import com.example.minangbakato.ui.petatah.PepatahAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class pituahFragment extends Fragment implements TabLayout.BaseOnTabSelectedListener {


    TabLayout tabLayout;
    FrameLayout frameLayout;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pituah, container, false);
        frameLayout=(FrameLayout)root.findViewById(R.id.frameLayout);
        tabLayout=root.findViewById(R.id.tab_pituah);
        tabLayout.addOnTabSelectedListener(this);
        loadFragment(new PituahLakiFragment());
        return root;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0:
                loadFragment(new PituahLakiFragment());
                break;
            case 1:
                loadFragment(new PituahPerempuanFragment());
                break;
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayoutPituah, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


}
