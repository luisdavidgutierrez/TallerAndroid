package com.example.tallerandroidpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText ed1, ed2;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        btLogin = findViewById(R.id.btnLogin);

    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
    @Override
    public void onClick(View view) {

    }



    public void saluda(View vh
    ){

        Intent ir = new Intent(this,MainActivity2.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle data = new Bundle();
        data.putString("name", ed1.getText().toString());
        data.putString("passwd", ed2.getText().toString());
        if (ed1.getText().toString().matches("")||ed2.getText().toString().matches("")){

            Toast.makeText(getApplicationContext(),"los campos no pueden estar vacios", Toast.LENGTH_LONG).show();

        }else{
            ir.putExtras(data);
            startActivity(ir);

        }
    }
}