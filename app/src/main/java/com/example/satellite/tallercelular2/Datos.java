package com.example.satellite.tallercelular2;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Celular> celular = new ArrayList<>();
    public static void guardar(Celular c){
        celular.add(c);
    }
    public static ArrayList<Celular> obtener(){
        return celular;
    }
}
