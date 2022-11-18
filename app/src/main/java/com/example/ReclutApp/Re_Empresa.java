package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Re_Empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_empresa);
    }

    public void prueba(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }

    public void irACrearEmpresa(View view){
        Intent i = new Intent(this, CrearPerfilEmpresa.class);
        startActivity(i);
    }


}