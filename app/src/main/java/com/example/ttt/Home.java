package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_home);
    }

    public void singlePlayer(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void twoPlayer(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
