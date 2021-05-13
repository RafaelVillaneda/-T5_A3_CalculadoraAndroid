package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String operacionRelaizar="?";
    String operacion="";
    String segundaParte="";
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
}