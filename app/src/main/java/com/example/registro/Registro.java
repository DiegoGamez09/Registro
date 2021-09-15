package com.example.registro;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    TextView nombre;
    TextView telefono;
    TextView email;
    TextView contra;
    Button guardar;
    Button cancelar;
    Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.editTextNombre);
        telefono=findViewById(R.id.editTextTelefono);
        email=findViewById(R.id.editTextEmail);
        contra=findViewById(R.id.editTextContrasenia);

        guardar=findViewById(R.id.buttonGuardar);
        cancelar=findViewById(R.id.buttonCancelar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user=new Usuario(nombre.getText().toString(), telefono.getText().toString(),
                        email.getText().toString(), contra.getText().toString());

                Bundle coyote=new Bundle();
                coyote.putSerializable("Usuario", user);

                Intent usuario=new Intent(getApplicationContext(), Login.class);
                usuario.putExtras(coyote);

                startActivity(usuario);

            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}