package com.example.ReclutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerfilEmp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_emp);
    }

    public void atrasemp(View view){
        Intent i = new Intent(this, MainEmpresa.class);
        //finish();
        startActivity(i);
    }

    public void noti(View view){
        Intent i = new Intent(this, Notificaciones.class);
        //finish();
        startActivity(i);
    }

}