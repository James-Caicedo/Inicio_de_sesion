package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Registro_de_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_usuario);

        Button btn2 = findViewById(R.id.registro);
        TextView image = findViewById(R.id.help);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(),"¡SESION INICIADA!",Toast.LENGTH_SHORT).show();


            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irApag1 = new Intent(Registro_de_usuario.this, MainActivity.class);

                startActivity(irApag1);
            }
        });




    }
}