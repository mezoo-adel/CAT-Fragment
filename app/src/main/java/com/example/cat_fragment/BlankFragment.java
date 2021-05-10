package com.example.cat_fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cat_fragmwent.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    ArrayList<String> namesOfAllah = new ArrayList<>();
    int counter =-1;

    public BlankFragment() {
    }

    public BlankFragment(ArrayList<String> namesOfAllah) {
        this.namesOfAllah.addAll(namesOfAllah);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final TextView textView = view.findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter < namesOfAllah.size()-1) {
                   counter++;
                    textView.setText(namesOfAllah.get(counter));
                    textView.setShadowLayer(5,0,0, Color.RED);
                } else {
                counter=-1;
                }
            }
        });
    }


}