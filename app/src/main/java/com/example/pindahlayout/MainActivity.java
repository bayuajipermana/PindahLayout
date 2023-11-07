package com.example.pindahlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView halU = findViewById(R.id.halU);
        Button btn1 = findViewById(R.id.pindah1);
        Button btn2 = findViewById(R.id.pindah2);
        Button btn3 = findViewById(R.id.pindah3);
        Button btn4 = findViewById(R.id.pindah4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(MainActivity.this, ActivitySatu.class);
                startActivity(pindah1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(MainActivity.this, ActivityDua.class);
                startActivity(pindah2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(MainActivity.this, ActivityTiga.class);
                startActivity(pindah3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah4 = new Intent(MainActivity.this, ActivityEmpat.class);
                startActivity(pindah4);
            }
        });
    }
}