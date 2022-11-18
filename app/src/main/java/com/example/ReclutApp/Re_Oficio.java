package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Re_Oficio extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton btnSonido;

    MediaPlayer MP;
    ImageButton btnSonidoM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_oficio);

        btnSonido = (ImageButton) findViewById(R.id.btnSonido3);
        mp = MediaPlayer.create(this, R.raw.audio2);
        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });


        btnSonidoM = (ImageButton) findViewById(R.id.btnSonidoM);
        MP = MediaPlayer.create(this, R.raw.maya2);
        btnSonidoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MP.start();
            }
        });

    }



    public void irTest(View view){
        Intent i = new Intent(this, Test.class);
        //finish();
        startActivity(i);
    }
    public void yatienes(View view){
        Intent i = new Intent(this, Login.class);
        //finish();
        startActivity(i);
    }

    public void irAviso(View view){
        Intent i = new Intent(this, aviso.class);
        //finish();
        startActivity(i);
    }
}