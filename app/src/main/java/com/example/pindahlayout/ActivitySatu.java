package com.example.pindahlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySatu extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_satu);

        TextView halU = findViewById(R.id.halU1);
        Button btn1 = findViewById(R.id.pindah5);
        Button btn2 = findViewById(R.id.pindah6);
        Button btn3 = findViewById(R.id.pindah7);
        Button btn4 = findViewById(R.id.pindah8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(ActivitySatu.this, MainActivity.class);
                startActivity(pindah1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(ActivitySatu.this, ActivityDua.class);
                startActivity(pindah2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(ActivitySatu.this, ActivityTiga.class);
                startActivity(pindah3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah4 = new Intent(ActivitySatu.this, ActivityEmpat.class);
                startActivity(pindah4);
            }
        });
    }
}
