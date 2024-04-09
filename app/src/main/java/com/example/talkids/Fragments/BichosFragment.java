package com.example.talkids.Fragments;


import static com.example.talkids.R.id.buttonCao;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.talkids.R;
import com.example.talkids.R.id;


/**
 * A simple {@link Fragment} subclass.
 * <p>
 * create an instance of this fragment.
 */
public class BichosFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;


    public BichosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        ImageButton buttonCao = view.findViewById(R.id.buttonCao);
        ImageButton buttonGato = view.findViewById(R.id.buttonGato);
        ImageButton buttonLeao = view.findViewById(R.id.buttonLeao);
        ImageButton buttonOvelha = view.findViewById(R.id.buttonOvelha);
        ImageButton buttonMacaco = view.findViewById(R.id.buttonMacaco);
        ImageButton buttonVaca = view.findViewById(R.id.buttonVaca);


        buttonCao.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);


        return view;


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == id.buttonCao) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
            tocarSom();
        } else if (view.getId() == id.buttonGato) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
            tocarSom();
        } else if (view.getId() == id.buttonLeao) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
            tocarSom();
        } else if (view.getId() == id.buttonMacaco) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
            tocarSom();
        } else if (view.getId() == id.buttonOvelha) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
            tocarSom();
        } else if (view.getId() == id.buttonVaca) {
            mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
            tocarSom();

        }

    }

    public void tocarSom() {
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