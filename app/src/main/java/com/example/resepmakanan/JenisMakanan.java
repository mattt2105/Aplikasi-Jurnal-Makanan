package com.example.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JenisMakanan extends AppCompatActivity {

    private Button btnMakanan;
    private Button btnCemilan;
    private Button btnMinuman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_makanan);

        btnMakanan = (Button)findViewById(R.id.btnMakanan);
        btnCemilan = (Button)findViewById(R.id.btnCemilan);
        btnMinuman = (Button)findViewById(R.id.btnMinuman);

        btnMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JenisMakanan.this, MenuMakanan.class);
                startActivity(intent);
            }
        });

        btnCemilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JenisMakanan.this, MenuCemilan.class);
                startActivity(intent);
            }
        });

        btnMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JenisMakanan.this, MenuMinuman.class);
                startActivity(intent);
            }
        });
    }
}