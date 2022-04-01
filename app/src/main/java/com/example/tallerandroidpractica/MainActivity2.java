package com.example.tallerandroidpractica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity2 extends AppCompatActivity {

    TextView datosMostrar;
    Integer contador = 0;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    WebView miweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        datosMostrar = findViewById(R.id.textView);
        Bundle delivery = getIntent().getExtras();
        datosMostrar.setText("Curso de Android Studio");
        miweb=findViewById(R.id.videos);
        miweb.getSettings().setJavaScriptEnabled(true);
        miweb.setWebViewClient(new WebViewClient());
        miweb.loadUrl("https://www.youtube.com/watch?v=tyx05coXixw&list=PLyvsggKtwbLX06iMtXnRGX5lyjiiMaT2y");
        //miweb.loadUrl("https://earth.google.com/web/@0,0,0a,22251752.77375655d,35y,0h,0t,0r?authuser=0");


    }

    public void atras(View v){

        Intent ir = new Intent(this,MainActivity.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);
    }

    public void contar(View v){
        contador = contador + 1;
        datosMostrar.setText("Contador: "+contador);
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"aplicacion en pause", Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("contador",contador);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        contador = savedInstanceState.getInt("contador");
    }
}