package com.games.kids.dnz.matchlearn.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.games.kids.dnz.matchlearn.R;

/**
 * Created by dnz on 01.06.2015.
 */
public class TextFragment extends Fragment {
    private static TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.text_fragment,
                container, false);

        textview = (TextView) view.findViewById(R.id.textView1);

        return view;
    }

    public void changeTextProperties(int fontsize, String text)
    {
        textview.setTextSize(fontsize);
        textview.setText(text);
    }
}