package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CrearPerfilOficio extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton btnSonido;

    MediaPlayer MP;
    ImageButton btnSonidoM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_perfil_oficio);

        btnSonido = (ImageButton) findViewById(R.id.btnSonido4);
        mp = MediaPlayer.create(this, R.raw.audio4);
        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        btnSonidoM = (ImageButton) findViewById(R.id.btnSonidoM);
        MP = MediaPlayer.create(this, R.raw.maya4);
        btnSonidoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MP.start();
            }
        });

    }

    public void IrCrearOfiicio2(View view){
        Intent i = new Intent(this, CrearPerfilOficio2.class);
        //(finish();
        startActivity(i);
    }
}