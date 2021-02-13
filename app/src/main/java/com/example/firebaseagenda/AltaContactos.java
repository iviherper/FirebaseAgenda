package com.example.firebaseagenda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AltaContactos extends AppCompatActivity {
    EditText nombree;
    EditText emaill;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_contactos);
        nombree=findViewById(R.id.txtName);
        emaill= findViewById(R.id.txtEmail);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Agenda");
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombree.getText().toString();
                String email = emaill.getText().toString();
                if(nombre.length()>0 && email.length()>0) {
                    Contacto con = new Contacto(nombre, email);
                    myRef.push().setValue(con);
                }else{
                    Toast.makeText(getApplicationContext(),"Debes rellenar ambos campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}