package com.example.satellite.tallercelular2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Crear extends AppCompatActivity {

    private Spinner marca;
    private String marc[];

    private Spinner so;
    private String s[];

    private Spinner ram;
    private String r[];

    private Spinner color;
    private String c[];

    private Resources resources;
    Intent in;

    private EditText price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        resources  = this.getResources();

        marca = (Spinner)findViewById(R.id.spMarca);
        marc = resources.getStringArray(R.array.tipos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, marc);
        marca.setAdapter(adapter);

        so = (Spinner)findViewById(R.id.spSo);
        s = resources.getStringArray(R.array.sistemas);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s);
        so.setAdapter(adapter2);

        ram = (Spinner)findViewById(R.id.spRam);
        r = resources.getStringArray(R.array.rams);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, r);
        ram.setAdapter(adapter3);

        color = (Spinner)findViewById(R.id.spColor);
        c = resources.getStringArray(R.array.colores);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, c);
        color.setAdapter(adapter4);

        price = (EditText)findViewById(R.id.txtPrecio);
    }

    public boolean validar(){
        if(price.getText().toString().equals("")){
            return false;
        }else{
            return true;
        }
    }
    public void crear(View v) {
        if(validar()){
            Celular av = new Celular(marca.getSelectedItem().toString(),so.getSelectedItem().toString(),ram.getSelectedItem().toString(),color.getSelectedItem().toString(),price.getText().toString());
            av.guardar();
            Toast.makeText(this, resources.getString(R.string.exito01),Toast.LENGTH_SHORT).show();
            in = new Intent(Crear.this,Principal.class);
            startActivity(in);
        }else{
            Toast.makeText(this, resources.getString(R.string.error01),Toast.LENGTH_SHORT).show();
        }
    }
}
