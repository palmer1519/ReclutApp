package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Seleccion extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton btnSonido;

    MediaPlayer MP;
    ImageButton btnSonidoM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        btnSonido = (ImageButton) findViewById(R.id.btnSonido2);
        mp = MediaPlayer.create(this, R.raw.audio3);
        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        btnSonidoM = (ImageButton) findViewById(R.id.btnSonidoM);
        MP = MediaPlayer.create(this, R.raw.maya3);
        btnSonidoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MP.start();
            }
        });

    }
    public void irRe_Empresa(View view){
        Intent i = new Intent(this, Re_Empresa.class);
        startActivity(i);
    }
    public void irProfecion(View view){
        Intent i = new Intent(this, Re_Profecion.class);
        startActivity(i);
    }
    public void irRe_Oficio(View view){
        Intent i = new Intent(this, Re_Oficio.class);
        //finish();
        startActivity(i);

    }
}