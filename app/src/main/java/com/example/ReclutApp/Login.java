package com.example.ReclutApp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    int contador = 0;

    MediaPlayer mp;
    ImageButton btnSonido;

    MediaPlayer MP;
    ImageButton btnSonidoM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSonido = (ImageButton) findViewById(R.id.btnSonidos);
        mp = MediaPlayer.create(this, R.raw.audio1);
        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        btnSonidoM = (ImageButton) findViewById(R.id.btnSonidoM);
        MP = MediaPlayer.create(this, R.raw.maya1);
        btnSonidoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MP.start();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (contador == 0) {
            Toast.makeText(getApplicationContext(),"Presione de nuevo para salir", Toast.LENGTH_SHORT).show();
            contador++;
        }else{
            super.onBackPressed();
        }
        new CountDownTimer(3000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                contador = 0;
            }
        }.start();
    }

    public void irSeleccion(View view){
        Intent i = new Intent(this, Seleccion.class);
        //finish();
        startActivity(i);
    }

    public void prueba(View view){
        Intent i = new Intent(this, MainOficio.class);
        startActivity(i);
    }

    public void prueba2(View view){
        Intent i = new Intent(this, MainProfesion.class);
        startActivity(i);
    }

    public void prueba3(View view){
        Intent i = new Intent(this, MainEmpresa.class);
        startActivity(i);
    }

}