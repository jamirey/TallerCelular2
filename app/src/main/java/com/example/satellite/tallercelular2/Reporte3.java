package com.example.satellite.tallercelular2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte3 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte3);

        tabla=(TableLayout) findViewById(R.id.tabla3);
        celular = Datos.obtener();
        Double price=Double.parseDouble(celular.get(0).getPrecio().toString());;
        int pos=0;
        for (int i = 0; i < celular.size() ; i++) {

            if (price > Double.parseDouble(celular.get(i).getPrecio().toString())) {
                price = Double.parseDouble(celular.get(i).getPrecio().toString());
                pos=i;
            }
        }
        if(price!=0.0){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);
            c1.setText("" + (pos + 1));
            c2.setText("" + celular.get(pos).getPrecio());
            c3.setText("" + celular.get(pos).getRam());
            c4.setText("" + celular.get(pos).getMarca());
            c5.setText("" + celular.get(pos).getSo());
            c6.setText("" + celular.get(pos).getColor());
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
