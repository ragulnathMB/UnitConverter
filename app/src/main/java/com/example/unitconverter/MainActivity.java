package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void  openActivity2(View view){
//        Intent intent=new Intent(this, MainActivity2.class);
//        startActivity(intent);
//    }
    public void openLength(View view){
        String str="length";
        Intent intent=new Intent(this, MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openWeight(View view){
        String str="weight";
        Intent intent=new Intent(this, MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openArea(View view){
        String str="area";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openVolume(View view){
        String str="volume";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openData(View view){
        String str="data";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openEnergy(View view){
        String str="energy";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openTime(View view){
        String str="time";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openTemperature(View view){
        String str="temperature";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
    public void openNumeralSystem(View view){
        String str="numeralSystem";
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("key",str);
        startActivity(intent);
    }
}