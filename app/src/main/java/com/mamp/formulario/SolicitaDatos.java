package com.mamp.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SolicitaDatos extends AppCompatActivity {

    private EditText tvNombre, tvTelefono;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicita_datos);


        tvNombre = (EditText) findViewById(R.id.txtInEdiTxtNombre);
        tvTelefono = (EditText) findViewById(R.id.txtInEdiTxtTelefono);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(
                new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent explicit_intent;

                explicit_intent = new Intent(SolicitaDatos.this , ConfirmaDatos.class);
                String auxTvNombre = tvNombre.getText().toString();
                String auxTvTelefono = tvTelefono.getText().toString();

                explicit_intent.putExtra("nombre",auxTvNombre);
                explicit_intent.putExtra("telefono",auxTvTelefono);

                startActivity(explicit_intent);

                Toast.makeText(getBaseContext(), auxTvNombre, Toast.LENGTH_SHORT).show();

            }
        });


    }



}
