package com.example.talkids.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.talkids.R;


public class NumerosFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;


    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        ImageButton buttonUm = view.findViewById(R.id.buttonUm);
        ImageButton buttonDois = view.findViewById(R.id.buttonDois);
        ImageButton buttonTres = view.findViewById(R.id.buttonTreis);
        ImageButton buttonQuatro = view.findViewById(R.id.buttonQuatro);
        ImageButton buttonCinco = view.findViewById(R.id.buttonCinco);
        ImageButton buttonSeis = view.findViewById(R.id.buttonSeis);

        buttonUm.setOnClickListener(this);
        buttonDois.setOnClickListener(this);
        buttonTres.setOnClickListener(this);
        buttonQuatro.setOnClickListener(this);
        buttonCinco.setOnClickListener(this);
        buttonSeis.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonUm) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
            tocarSom();
        } else if (view.getId() == R.id.buttonDois) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
            tocarSom();
        } else if (view.getId() == R.id.buttonTreis) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
            tocarSom();

        } else if (view.getId() == R.id.buttonQuatro) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
            tocarSom();

        } else if (view.getId() == R.id.buttonCinco) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
            tocarSom();
        } else if (view.getId() == R.id.buttonSeis) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
            tocarSom();
        }

    }
    public void tocarSom () {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();

                }
            });
        }
    }
}