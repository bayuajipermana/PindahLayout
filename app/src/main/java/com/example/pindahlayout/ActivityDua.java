package com.example.pindahlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityDua extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dua);

        TextView halU = findViewById(R.id.halU2);
        Button btn1 = findViewById(R.id.pindah9);
        Button btn2 = findViewById(R.id.pindah10);
        Button btn3 = findViewById(R.id.pindah11);
        Button btn4 = findViewById(R.id.pindah12);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(ActivityDua.this, ActivitySatu.class);
                startActivity(pindah1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(ActivityDua.this, MainActivity.class);
                startActivity(pindah2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(ActivityDua.this, ActivityTiga.class);
                startActivity(pindah3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah4 = new Intent(ActivityDua.this, ActivityEmpat.class);
                startActivity(pindah4);
            }
        });
    }
}
