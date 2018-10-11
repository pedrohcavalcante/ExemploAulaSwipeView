package com.example.androidbti.exemploaulaswipeview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PageFragment extends Fragment {
    private int position;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null){
            position = savedInstanceState.getInt("fragment");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layoutRes = 0;

        if(position == 0) {
            layoutRes = R.layout.fragment_page1;
        } else if (position == 1) {
            layoutRes = R.layout.fragment_page2;
        } else if (position == 2){
            layoutRes = R.layout.fragment_page3;
        }

        return inflater.inflate(layoutRes, container, false);

    }
    public static PageFragment nerInstance(int position){
        PageFragment pf = new PageFragment();
        pf.position = position;
        return pf;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("fragment", position);
    }
}
