package com.moviles.salt.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moviles.salt.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static final int BLUE = 0;
    public static final int RED = 1;
    public static final int YELLOW = 2;
    public static final int ORANGE = 3;
    public static final int GREEN = 4;
    public static final int VIOLET=5;

    int color;

    public void init(int color)
    {
        this.color = color;
    }

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_color, container, false);

        String colorNames[] = getResources().getStringArray(R.array.colores_nombre);
        int colors[] = getResources().getIntArray(R.array.colores);

        v.setBackgroundColor(colors[color]);

        TextView txt = (TextView) v.findViewById(R.id.txt);
        txt.setText(colorNames[color]);

        return v;
    }


}
