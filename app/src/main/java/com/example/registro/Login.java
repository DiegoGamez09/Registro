package com.example.registro;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    Button registrar;
    TextView usuario;
    TextView contra;
    Usuario userRegistrado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registrar=findViewById(R.id.buttonRegistrar);

        usuario=findViewById(R.id.editTextUsuario);
        contra=findViewById(R.id.editTextPass);

        Bundle desempaquetar=getIntent().getExtras();

        if(desempaquetar!=null){
            userRegistrado=(Usuario) desempaquetar.getSerializable("Usuario");

            usuario.setText(userRegistrado.getNombre());
            contra.setText(userRegistrado.getContra());
        }

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirRegistro = new Intent(getApplicationContext(), Registro.class);
                startActivity(abrirRegistro);
            }
        });



    }
}