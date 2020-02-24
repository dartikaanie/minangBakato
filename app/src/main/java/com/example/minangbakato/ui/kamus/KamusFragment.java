package com.example.minangbakato.ui.kamus;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.minangbakato.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class KamusFragment extends Fragment implements TabLayout.BaseOnTabSelectedListener {
    TabLayout tabLayout;
    FrameLayout frameLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_kamus, container, false);
        frameLayout=(FrameLayout)root.findViewById(R.id.frameLayout);
        tabLayout=root.findViewById(R.id.tab_kamus);
        tabLayout.addOnTabSelectedListener(this);
        loadFragment(new KamusMingDoFragment());
        return root;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0:
                loadFragment(new KamusMingDoFragment());
                break;
            case 1:
                loadFragment(new KamusDoMingFragment());
                break;
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
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
