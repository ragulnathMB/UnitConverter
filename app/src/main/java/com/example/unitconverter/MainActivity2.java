package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView text1,text2;
    EditText editNumber;
    Button convert;
    public static HashMap<String,Double> hp=new HashMap<String,Double>();
    Spinner spinner,spinner2;
    String s1,s2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String strr=intent.getStringExtra("key");
        text1=findViewById(R.id.textView11);
        text2=findViewById(R.id.textView12);
        convert=findViewById(R.id.button29);
        editNumber=findViewById(R.id.editTextNumberDecimal);
        hp.put("meter(m)",0.001);
        hp.put("Kilometer(km)",1.0);
        hp.put("mile(mi)",1.609344);
        hp.put("yard(yd)",0.0009144);
        hp.put("inch(in)",0.0000254);
        hp.put("foot(f)",0.0003048);
        hp.put("millimeter(mm)",0.000001);
        hp.put("nautical mile(international)",1.852);
        hp.put("parsec(pc)",30856775812800.0);
        hp.put("centimeter(cm)",0.00001);
        hp.put("Kilogram(kg)",1.0);
        hp.put("gram(g)",0.001);
        hp.put("ton(t)",1000.0);
        hp.put("pound(lbs)",0.45359237);
        hp.put("ounce(oz)",0.028349523);
        hp.put("carat(ct)",0.0002);
        hp.put("grain(gr)",0.0000647989);
        hp.put("quintal(cwt)",100.0);
        hp.put("Celsius(ºC)",274.15);
        hp.put("Fahrenheit(ºF)",255.92777778);
        hp.put("Kelvin(K)",1.0);
        hp.put("Square meter(m^2)",1.0);
        hp.put("Square Km(km^2)",1000000.0);
        hp.put("Square cm(cm^2)",0.0001);
        hp.put("hectare(ha)",10000.0);
        hp.put("Acre(ac)",4046.8564224);
        hp.put("Square mile(mi^2)",2589990.0);
        hp.put("Square yard(yd^2)",0.83612736);
        hp.put("Square Foot(f^2)",0.09290304);
        hp.put("Square Inch(in^2)",0.00064516);
        hp.put("second(sec)",0.0000115741);
        hp.put("hour(hr)",0.0416666667);
        hp.put("minute(min)",0.0006944444);
        hp.put("day(d)",1.0);
        hp.put("week(wk)",7.0);
        hp.put("month(mon)",30.4375);
        hp.put("year(yr)",365.25);
        hp.put("decade(dec)",3652.5);
        hp.put("century(cnt)",36525.0);
        hp.put("nibble",0.0005);
        hp.put("Byte",0.001);
        hp.put("Bit",0.000125);
        hp.put("KiloByte(KB)",1.0);
        hp.put("Megabyte(MB)",1024.0);
        hp.put("GigaByte(GB)",1048576.0);
        hp.put("TeraByte(TB)",1073741824.0);
        hp.put("Joule(J)",1.0);
        hp.put("KiloJoule(KJ)",1000.0);
        hp.put("KiloWatt-hour(Kwh)",3600000.0);
        hp.put("watt-hour(wh)",3600.0);
        hp.put("Calorie(cal)",4186.8);
        hp.put("horse-power(hp)",745.69987158237);
        hp.put("Cubic centimeter(cm^3)",0.000001);
        hp.put("Cubic meter(m^3)",1.0);
        hp.put("Cubic Kilometer(km^3)",1000000000.0);
        hp.put("liter(L)",0.001);
        hp.put("milli liter(mL)",0.000001);
        hp.put("Gallon",0.00378541);
        hp.put("US table Spoon",0.0000147868);
        hp.put("US teaspoon",0.0000049289);
        hp.put("Imperial teaspoon",0.0000059194);
        hp.put("Imperial tablespoon",0.0000177582);

        if(strr.equals("weight")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.weight, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.weight, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);


        }else if(strr.equals("length")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.length, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.length, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("temperature")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.temperature, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.temperature, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("area")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Area, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.Area, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("time")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.time, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.time, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("data")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.data, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.data, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("energy")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.energy, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.energy, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("volume")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.volume, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.volume, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);
        }else if(strr.equals("numeralSystem")){
            spinner=findViewById(R.id.spinner1);
            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.numeralSystem, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
            spinner2=findViewById(R.id.spinner2);
            ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.numeralSystem, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner2.setAdapter(adapter2);
            spinner2.setOnItemSelectedListener(this);

        }


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=spinner.getSelectedItem().toString();
                s2=spinner2.getSelectedItem().toString();
                double num=Double.parseDouble(editNumber.getText().toString());
                double result;
                if(strr.equals("temperature")){
                    if(s1.equals("Celsius(ºC)")){
                        if(s2.equals("Fahrenheit(ºF)")){
                            result=celsiusToFahrenheit(num);
                        }else if(s2.equals("Celsius(ºC)")){
                            result=num;
                        }else{
                            result=num+273.15;
                        }
                    }else if(s1.equals("Fahrenheit(ºF)")){
                        if(s2.equals("Celsius(ºC)")){
                            result=fahrenheitToCelsius(num);
                        }else if(s2.equals("Fahrenheit(ºF)")){
                            result=num;
                        }else{
                            result=fahrenheitToCelsius(num)+273.15;
                        }
                    }else{
                        if(s2.equals("Celsius(ºC)")){
                            result=num-273.15;
                        }else if(s2.equals("Fahrenheit(ºF)")){
                            result=fahrenheitToCelsius(num)-273.15;
                        }else{
                            result=num;
                        }
                    }
                    text1.setText(String.valueOf(result));
                    text2.setText(String.valueOf(num)+" "+s1+" = "+String.valueOf(result)+" "+s2);
                    return;
                }
                if(strr.equals("numeralSystem")){
                    int n=(int)num;
                    String res="";
                    if(s1.equals("decimal")){
                        if(s2.equals("binary")){
                            res=decToBin(n);
                        }else if(s2.equals("octal")){
                            res=decToOct(n);
                        }else if(s2.equals("hexadecimal")){
                            res=decToHex(n);
                        }else {
                            res=String.valueOf(n);
                        }
                    }else if(s1.equals("binary")){
                        if(s2.equals("decimal")){
                            res=binToDec(n,2.0);
                        }else if(s2.equals("octal")){
                            double a=Double.parseDouble(binToDec(n,2.0));
                            int b=(int)a;
                            res=decToOct(b);
                        }else if(s2.equals("hexadecimal")){
                            double a=Double.parseDouble(binToDec(n,2.0));
                            int b=(int)a;
                            res=decToHex(b);
                        }else{
                            res=String.valueOf(n);
                        }
                    }else if(s1.equals("octal")){
                        if(s2.equals("decimal")){
                            res=binToDec(n,8.0);
                        }else if(s2.equals("binary")){
                            double a=Double.parseDouble(binToDec(n,8.0));
                            int b=(int)a;
                            res=decToBin(b);
                        }else if(s2.equals("hexadecimal")){
                            double a=Double.parseDouble(binToDec(n,8.0));
                            int b=(int)a;
                            res=decToHex(b);
                        }else{
                            res=String.valueOf(n);
                        }
                    }else if(s1.equals("hexadecimal")){
                        if(s2.equals("decimal")){
                            res=binToDec(n,16.0);
                        }else if(s2.equals("binary")){
                            double a=Double.parseDouble(binToDec(n,16.0));
                            int b=(int)a;
                            res=decToBin(b);
                        }else if(s2.equals("octal")){
                            double a=Double.parseDouble(binToDec(n,16.0));
                            int b=(int)a;
                            res=decToOct(b);
                        }else{
                            res=String.valueOf(n);
                        }
                    }
                    text1.setText(String.valueOf(res));
                    text2.setText("("+String.valueOf(n)+")"+s1+" = "+"("+String.valueOf(res)+") "+s2);
                    return;
                }
                double n1=hp.get(s1);
                double n2=hp.get(s2);
                result=(n1*num)/n2;
                text1.setText(String.valueOf(result));
                text2.setText(String.valueOf(num)+" "+s1+" = "+String.valueOf(result)+" "+s2);

            }
        });
    }


    public String decToBin(int n){
        if(n==0){
            return "";
        }
        return decToBin(n/2)+""+n%2;
    }
    public String decToOct(int n){
        if(n==0){
            return "";
        }
        return decToOct(n/8)+""+n%8;
    }
    public String decToHex(int n){
        if(n==0){
            return "";
        }
        if(n%16==10){
            return decToHex(n/16)+""+"a";
        }else if(n%16==11){
            return decToHex(n/16)+""+"b";
        }else if(n%16==12){
            return decToHex(n/16)+""+"c";
        }else if(n%16==13){
            return decToHex(n/16)+""+"d";
        }else if(n%16==14){
            return decToHex(n/16)+""+"e";
        }else if(n%16==15){
            return decToHex(n/16)+""+"f";
        }else{
            return decToHex(n/16)+""+n%16;
        }
    }
    public String binToDec(int n,double a){
        int i=0;
        double result=0;
        while(n>0){
            result+=(n%10)*(Math.pow(a,i));
            i++;
            n/=10;
        }
        return result+"";

    }
    public double celsiusToFahrenheit(double n){
        return (n*1.8)+32;
    }
    public double fahrenheitToCelsius(double n){
        return (n-32)*5/9;
    }
    public void back(){
        Intent intentback=new Intent(this, MainActivity.class);
        startActivity(intentback);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}