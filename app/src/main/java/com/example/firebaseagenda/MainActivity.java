package com.example.firebaseagenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button alta = findViewById(R.id.btnAlta);
        Button agenda = findViewById(R.id.btnVerAgenda);

        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.firebaseagenda.MainActivity.this, VistaContactos.class);
                startActivity(intent);
            }
        });

        alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.firebaseagenda.MainActivity.this, AltaContactos.class);
                startActivity(intent);
            }
        });
    }
}