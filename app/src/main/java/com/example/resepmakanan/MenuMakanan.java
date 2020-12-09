package com.example.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuMakanan extends AppCompatActivity {

    private Button btnNasigoreng;
    private Button btnSushi;
    private Button btnSpagheti;
    private Button btnBaked;
    private Button btnBeef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        btnNasigoreng= (Button)findViewById(R.id.btnNasiGoreng);
        btnSushi= (Button)findViewById(R.id.btnSushi);
        btnSpagheti= (Button)findViewById(R.id.btnSpagheti);
        btnBaked= (Button)findViewById(R.id.btnBaked);
        btnBeef= (Button)findViewById(R.id.btnBeef);


        btnNasigoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuMakanan.this, NasiGoreng.class);
                startActivity(intent);
            }
        });

        btnSushi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMakanan.this, Sushi.class);
                startActivity(intent);
            }
        });

        btnSpagheti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMakanan.this, Spagheti.class);
                startActivity(intent);
            }
        });

        btnBaked.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMakanan.this, Baked.class);
                startActivity(intent);
            }
        });

        btnBeef.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMakanan.this, Beef.class);
                startActivity(intent);
            }
        });
    }
}