package com.example.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuCemilan extends AppCompatActivity {

    private Button btnPancake;
    private Button btnCake;
    private Button btnGinger;
    private Button btnPie;
    private Button btnFriedBanana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cemilan);

        btnPancake= (Button)findViewById(R.id.btnPancake);
        btnCake= (Button)findViewById(R.id.btnCake);
        btnGinger= (Button)findViewById(R.id.btnGinger);
        btnPie= (Button)findViewById(R.id.btnPie);
        btnFriedBanana= (Button)findViewById(R.id.btnFriedBanana);


        btnPancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuCemilan.this, Pancake.class);
                startActivity(intent);
            }
        });

        btnCake.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuCemilan.this, Cake.class);
                startActivity(intent);
            }
        });

        btnGinger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuCemilan.this, Ginger.class);
                startActivity(intent);
            }
        });

        btnPie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuCemilan.this, Pie.class);
                startActivity(intent);
            }
        });

        btnFriedBanana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuCemilan.this, FriedBanana.class);
                startActivity(intent);
            }
        });
    }
}