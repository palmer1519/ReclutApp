package com.example.ReclutApp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ReclutApp.databinding.ActivityMainOficioBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainOficio extends AppCompatActivity {
    int contador = 0;


    private ActivityMainOficioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainOficioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_busqueda, R.id.navigation_agregar)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_oficio);
        NavigationUI.setupWithNavController(binding.navView, navController);
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

    public void irPerfil(View view){
        Intent i = new Intent(this, Perfil.class);
        startActivity(i);
    }

}