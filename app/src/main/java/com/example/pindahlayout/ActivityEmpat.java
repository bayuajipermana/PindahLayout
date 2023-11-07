package com.example.pindahlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityEmpat extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_empat);

        TextView halU = findViewById(R.id.halU4);
        Button btn1 = findViewById(R.id.pindah17);
        Button btn2 = findViewById(R.id.pindah18);
        Button btn3 = findViewById(R.id.pindah19);
        Button btn4 = findViewById(R.id.pindah20);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(ActivityEmpat.this, ActivityTiga.class);
                startActivity(pindah1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(ActivityEmpat.this, ActivityDua.class);
                startActivity(pindah2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(ActivityEmpat.this, ActivitySatu.class);
                startActivity(pindah3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah4 = new Intent(ActivityEmpat.this, MainActivity.class);
                startActivity(pindah4);
            }
        });
    }
}
