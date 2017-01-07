package com.udacity.gradle.jokedisplay;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeDisplayFragment extends Fragment {


    public JokeDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_joke_display, container, false);

        TextView jokeDisplayTv = (TextView) rootView.findViewById(R.id.joke_display_tv);

        Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String intentExtra = intent.getStringExtra(Intent.EXTRA_TEXT);
            jokeDisplayTv.setText(intentExtra);
        }
        return rootView;
    }
}
