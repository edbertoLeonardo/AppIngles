package com.example.appingles.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.appingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener{

    private ImageButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix;
    private MediaPlayer mediaPlayer;


    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_numeros, container, false);


        buttonOne = view.findViewById(R.id.buttonOne);
        buttonTwo = view.findViewById(R.id.buttonTwo);
        buttonThree = view.findViewById(R.id.buttonThree);
        buttonFour = view.findViewById(R.id.buttonFour);
        buttonFive = view.findViewById(R.id.buttonFive);
        buttonSix = view.findViewById(R.id.buttonSix);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonOne :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.one);
                tocarSom();
                break;
            case R.id.buttonTwo :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.two);
                tocarSom();
                break;
            case R.id.buttonThree :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.three);
                tocarSom();
                break;
            case R.id.buttonFour :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.four);
                tocarSom();
                break;
            case R.id.buttonFive :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.five);
                tocarSom();
                break;
            case R.id.buttonSix:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.six);
                tocarSom();
                break;
        }

    }

    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();

                }
            });
        }
    }

    public void onDestoy(){
        super.onDestroy();
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }

    }
}
