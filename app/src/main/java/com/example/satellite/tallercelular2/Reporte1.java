package com.example.satellite.tallercelular2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte1 extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte1);

        tabla=(TableLayout) findViewById(R.id.tabla);
        celular = Datos.obtener();

        for (int i = 0; i < celular.size() ; i++) {
            TableRow fila = new TableRow(this);

            if(celular.get(i).getMarca().equals("Samsung")&& (celular.get(i).getColor().equals("Negro"))||celular.get(i).getColor().equals("Black")){
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);
                TextView c6 = new TextView(this);
                c1.setText("" + (i + 1));
                c2.setText("" + celular.get(i).getPrecio());
                c3.setText("" + celular.get(i).getRam());
                c4.setText("" + celular.get(i).getMarca());
                c5.setText("" + celular.get(i).getSo());
                c6.setText("" + celular.get(i).getColor());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);
                tabla.addView(fila);
            }

        }
    }
}
