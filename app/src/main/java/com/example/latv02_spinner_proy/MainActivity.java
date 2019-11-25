package com.example.latv02_spinner_proy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Agregarscreen(View view) {
        Intent Agregarscreen = new Intent(this, Agregar_Activity.class);
        startActivity(Agregarscreen);
        Toast.makeText(getApplicationContext(), "Pantalla Agregar Color ", Toast.LENGTH_LONG).show();
    }

    public void Mostrarscreen(View view) {
        Intent Mostrarscreen = new Intent(this, View_Activity.class);
        startActivity(Mostrarscreen);
        Toast.makeText(getApplicationContext(), "Pantalla Mostrar Color", Toast.LENGTH_LONG).show();
    }
}
