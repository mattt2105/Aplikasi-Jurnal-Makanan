package com.example.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuMinuman extends AppCompatActivity {

    private Button btnLemonTea;
    private Button btnMojitoLeci;
    private Button btnMilkshake;
    private Button btnMatchaLatte;
    private Button btnTaroMilk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_minuman);

        btnLemonTea= (Button)findViewById(R.id.btnLemonTea);
        btnMojitoLeci= (Button)findViewById(R.id.btnMojitoLeci);
        btnMilkshake= (Button)findViewById(R.id.btnMilkshake);
        btnMatchaLatte= (Button)findViewById(R.id.btnMatchaLatte);
        btnTaroMilk= (Button)findViewById(R.id.btnTaroMilk);


        btnLemonTea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMinuman.this, LemonTea.class);
                startActivity(intent);
            }
        });

        btnMojitoLeci.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMinuman.this, MojitoLeci.class);
                startActivity(intent);
            }
        });

        btnMilkshake.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMinuman.this, Milkshake.class);
                startActivity(intent);
            }
        });

        btnMatchaLatte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMinuman.this, MatchaLatte.class);
                startActivity(intent);
            }
        });

        btnTaroMilk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuMinuman.this, TaroMilk.class);
                startActivity(intent);
            }
        });
    }
}