package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String operacionRelaizar="?";
    String operacion="";
    byte limiOp=1,masMenos=-1;
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar=findViewById(R.id.textView);
    }
    public void boton0(View v){
        operacion=operacion+"0";
        mostrar.setText(operacion);
    }
    public void boton1(View v){
        operacion=operacion+"1";
        mostrar.setText(operacion);
    }
    public void boton2(View v){
        operacion=operacion+"2";
        mostrar.setText(operacion);
    }
    public void boton3(View v){
        operacion=operacion+"3";
        mostrar.setText(operacion);
    }
    public void boton4(View v){
        operacion=operacion+"4";
        mostrar.setText(operacion);
    }
    public void boton5(View v){
        operacion=operacion+"5";
        mostrar.setText(operacion);
    }
    public void boton6(View v){
        operacion=operacion+"6";
        mostrar.setText(operacion);
    }
    public void boton7(View v){
        operacion=operacion+"7";
        mostrar.setText(operacion);
    }
    public void boton8(View v){
        operacion=operacion+"8";
        mostrar.setText(operacion);
    }
    public void boton9(View v){
        operacion=operacion+"9";
        mostrar.setText(operacion);
    }
    public void botonResiduo(View v){
        if(limiOp>0) {
            operacion = operacion + "%";
            operacionRelaizar="%";
            mostrar.setText(operacion);
        }
    }
    public void botonCuadrado(View v){
        double raiz=0.0;
        if(!operacion.equals("")) {
             raiz = Double.parseDouble(operacion);
            raiz = Math.pow(raiz,2);
        }
        mostrar.setText(String.valueOf(raiz));
    }
    public void botonRaiz(View v) {
        double raiz=0.0;
        if(!operacion.equals("")) {
             raiz = Double.parseDouble(operacion);
            raiz = Math.sqrt(raiz);
        }
        mostrar.setText(String.valueOf(raiz));
    }
    public void botonpunto(View v){
        operacion=operacion+".";
        mostrar.setText(operacion);
    }
    public void botonCE(View v){
        operacion="";
        mostrar.setText("");
    }
    public void botonC(View v){
        mostrar.setText("");
        operacion="";
    }
    public void botonBorrar(View v){//"±"
        if(!operacion.equals("")) {
            String temp = operacion;
            temp = temp.substring(0, temp.length() - 1);
            operacion = temp;
            mostrar.setText(operacion);
        }
    }
    public void botonpor(View v){
        if(limiOp>0) {
            limiOp--;
            operacionRelaizar = "~";
            operacion = operacion + "~";
            mostrar.setText(operacion);
        }
    }
    public void botonDiv(View v){
        if(limiOp>0) {
            limiOp--;
            operacionRelaizar = "/";
            operacion = operacion + "/";
            mostrar.setText(operacion);
        }
    }
    public void botonResta(View v){
        if(limiOp>0) {
            limiOp--;
            operacionRelaizar = "-";
            operacion = operacion + "-";
            mostrar.setText(operacion);
        }
    }
    public void botonSuma(View v){
        if(limiOp>0) {
            limiOp--;
            operacionRelaizar = "±";
            operacion = operacion + "±";
            mostrar.setText(operacion);
        }
    }
    public void unoSobreX(View v){
        if(limiOp==1 && !operacion.equals("")){
            double p1=Double.parseDouble(operacion);
            p1=1/p1;
            mostrar.setText(String.valueOf(p1));
            operacion="";
        }
    }

    public void igual(View v){
        String[] parts;
        limiOp++;
        if(operacionRelaizar.equals("±")){
            parts = operacion.split("±");
            if(parts.length==2) {
                double p1 = Double.parseDouble(parts[0]);
                double p2 = Double.parseDouble(parts[1]);
                p1 = p1 + p2;
                mostrar.setText(String.valueOf(p1));
                operacion = "";
            }
        }else  if(operacionRelaizar.equals("-")) {
            parts = operacion.split("-");
            if(parts.length==2) {
                double p1 = Double.parseDouble(parts[0]);
                double p2 = Double.parseDouble(parts[1]);
                p1 = p1 - p2;
                mostrar.setText(String.valueOf(p1));
                operacion = "";
            }
        }else  if(operacionRelaizar.equals("~")){
            parts = operacion.split("~");//-----------------------------------
            if(parts.length==2) {
                double p1 = Double.parseDouble(parts[0]);
                double p2 = Double.parseDouble(parts[1]);
                p1 = p1 * p2;
                mostrar.setText(String.valueOf(p1));
                operacion = "";
            }
        }else  if(operacionRelaizar.equals("/")){
            parts = operacion.split("/");
            if(parts.length==2) {
                double p1 = Double.parseDouble(parts[0]);
                double p2 = Double.parseDouble(parts[1]);
                p1 = p1 / p2;
                mostrar.setText(String.valueOf(p1));
                operacion = "";
            }
        }else  if(operacionRelaizar.equals("%")){
            parts = operacion.split("%");
            if(parts.length==2) {
                double p1 = Double.parseDouble(parts[0]);
                double p2 = Double.parseDouble(parts[1]);
                p1 = p1 % p2;
                mostrar.setText(String.valueOf(p1));
                operacion = "";
            }
        }
    }



}