package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText paswword;
    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login= findViewById(R.id.login);
        paswword=findViewById(R.id.paswword);
        buton = findViewById(R.id.buton);

        buton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (login.getText().toString().equals("user") && pasword.getText().toString());
            }
        });
    }
}