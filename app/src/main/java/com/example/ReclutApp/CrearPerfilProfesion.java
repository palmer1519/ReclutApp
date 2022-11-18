package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CrearPerfilProfesion extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_perfil_profesion);
    }

    public void irACrearProfesion2(View view){
        Intent i = new Intent(this, CrearPerfilProfesion2.class);
        startActivity(i);
    }
}