package com.example.ReclutApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ReclutApp.databinding.ActivityMainProfesionBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainProfesion extends AppCompatActivity {

    private ActivityMainProfesionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainProfesionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_inicioP, R.id.navigation_busquedaP, R.id.navigation_agregarP)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_profesion);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }


    public void perfilpro(View view){
        Intent i = new Intent(this, PerfilPro.class);
        //finish();
        startActivity(i);
    }

}