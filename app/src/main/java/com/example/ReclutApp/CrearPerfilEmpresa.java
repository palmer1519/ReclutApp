package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CrearPerfilEmpresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_perfil_empresa);
    }

    public void inicioEmpresa(View view){
        Intent i = new Intent(this, MainEmpresa.class);
        startActivity(i);
    }
}