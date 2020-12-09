package com.example.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public EditText username,password;
    public Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.btnLogin){

            String ambilUsername = username.getText().toString().trim();
            String ambilPassword = password.getText().toString().trim();

            if(ambilUsername.equals("arham") && ambilPassword.equals("123456")){
                Toast.makeText(this, "Selamat, Login berhasil", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, JenisMakanan.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "Username atau Password anda salah", Toast.LENGTH_SHORT).show();
            }
        }
    }

}