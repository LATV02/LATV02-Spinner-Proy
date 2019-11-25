package com.example.latv02_spinner_proy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Agregar_Activity extends AppCompatActivity {

    EditText txtadd;
    ArrayList<String> abc = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_);
        txtadd = (EditText) findViewById(R.id.txtadd);
    }

    public void add(View v) {
        String ingres = txtadd.getText().toString();


        if (abc.contains(ingres)) {
            Toast.makeText(this, "No se ha ingresado nada", Toast.LENGTH_LONG).show();
        } else {
            VariableGlobal.add(txtadd.getText().toString());
            txtadd.setText("");
            Toast.makeText(getApplicationContext(), "Se registro con éxito " + ingres, Toast.LENGTH_LONG).show();


        }
    }


    public void Mostrarscreen(View view) {
        Intent Mostrarscreen = new Intent(this, View_Activity.class);
        startActivity(Mostrarscreen);

    }

    public void menuprincipal(View view) {
        Intent menuprincipal = new Intent(this, MainActivity.class);
        startActivity(menuprincipal);

    }
}
