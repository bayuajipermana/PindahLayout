package com.example.pindahlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTiga extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tiga);

        TextView halU = findViewById(R.id.halU3);
        Button btn1 = findViewById(R.id.pindah13);
        Button btn2 = findViewById(R.id.pindah14);
        Button btn3 = findViewById(R.id.pindah15);
        Button btn4 = findViewById(R.id.pindah16);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(ActivityTiga.this, ActivityDua.class);
                startActivity(pindah1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(ActivityTiga.this, ActivitySatu.class);
                startActivity(pindah2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(ActivityTiga.this, MainActivity.class);
                startActivity(pindah3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah4 = new Intent(ActivityTiga.this, ActivityEmpat.class);
                startActivity(pindah4);
            }
        });
    }
}
