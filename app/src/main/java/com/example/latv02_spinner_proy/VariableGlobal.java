package com.example.latv02_spinner_proy;

import java.util.ArrayList;

public class VariableGlobal {
    public static ArrayList<String> colorX = new ArrayList<String>();

    public  static  void add(String coloresY){
        colorX.add(coloresY);
    }

    public static ArrayList<String> colores(){
        return colorX;
    }
}
