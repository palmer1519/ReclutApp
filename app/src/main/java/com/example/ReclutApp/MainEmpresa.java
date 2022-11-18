package com.example.ReclutApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ReclutApp.databinding.ActivityMainEmpresaBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainEmpresa extends AppCompatActivity {

    private ActivityMainEmpresaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainEmpresaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_inicioE, R.id.navigation_busquedaE, R.id.navigation_agregarE, R.id.navigation_pagoE)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main_profesion);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    public void perfilemp(View view){
        Intent i = new Intent(this, PerfilEmp.class);
        //finish();
        startActivity(i);
    }

}