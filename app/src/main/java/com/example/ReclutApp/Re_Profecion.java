package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Re_Profecion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_profecion);
    }

    public void prueba(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
    public void irACrearProfesion(View view){
        Intent i = new Intent(this, CrearPerfilProfesion.class);
        startActivity(i);
    }

    public void irAviso(View view){
        Intent i = new Intent(this, aviso.class);
        //finish();
        startActivity(i);
    }
}