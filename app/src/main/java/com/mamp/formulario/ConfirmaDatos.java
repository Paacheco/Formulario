package com.mamp.formulario;

/**
 * Created by unime on 12/06/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class  ConfirmaDatos extends AppCompatActivity
{

    TextView tvMuestraNombre, tvMuestraTelefon;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_datos);

        tvMuestraNombre = (TextView) findViewById(R.id.tvMuestraNombre);
        tvMuestraTelefon = (TextView) findViewById(R.id.tvMuestraTelefono);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {
            String datoNombre = (String) extras.get("nombre");
            String datoTelefono = (String) extras.get("telefono");

            tvMuestraNombre.setText(datoNombre);
            tvMuestraTelefon.setText(datoTelefono);
        }
        else
        {
            Toast.makeText(getBaseContext(),"No hay datos",Toast.LENGTH_SHORT ).show();
        }
    }
}
