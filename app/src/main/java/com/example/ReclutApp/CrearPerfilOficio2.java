package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CrearPerfilOficio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_perfil_oficio2);
    }

    public void inicioOficio(View view){
        Intent i = new Intent(this, MainOficio.class);
       //finish();
        startActivity(i);
    }
}