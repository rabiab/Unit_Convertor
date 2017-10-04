package com.example.hp.unitconvertor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.Vector;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void temp(View v)

    {
        Toast.makeText(MainActivity.this,"Convert from celsius to fahrenheit",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity2.class);
        startActivity(ac2);



    }
    public void weight(View v)

    {
        Toast.makeText(MainActivity.this,"Convert from kilogram to gram",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity3.class);
        startActivity(ac2);



    }
    public void lenght(View v)
    {
        Toast.makeText(MainActivity.this,"Convert from meter to kilometer",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity4.class);
        startActivity(ac2);



    }

    public void speed(View v)
    {
        Toast.makeText(MainActivity.this,"Convert speed from meter/sec to km/hr",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity5.class);
        startActivity(ac2);



    }
    public void currency(View v)
    {
        Toast.makeText(MainActivity.this,"Convert speed from USA $ to PAK rs",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity6.class);
        startActivity(ac2);
    }
    public void volume(View v)
    {
        Toast.makeText(MainActivity.this,"Convert speed from Cubic  KiloMeter  to Cubic Meter ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity7.class);
        startActivity(ac2);
    }
    public void time(View v)
    {
        Toast.makeText(MainActivity.this,"Convert time from hr/min/sec  to hr/min/sec ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity8.class);
        startActivity(ac2);
    }
    public void area(View v)
    {
        Toast.makeText(MainActivity.this,"Convert area from ft to km ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity9.class);
        startActivity(ac2);
    }
    public void fuel(View v)
    {
        Toast.makeText(MainActivity.this,"Convert fuel Meter/liter to Kilometer/liter ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity10.class);
        startActivity(ac2);
    }
    public void pressure(View v)
    {
        Toast.makeText(MainActivity.this,"Convert pressure from /to Pa/KPa/bars ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity11.class);
        startActivity(ac2);
    }
    public void energy(View v)
    {
        Toast.makeText(MainActivity.this,"Convert energy  calories to kilocalories ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity12.class);
        startActivity(ac2);
    }
    public void storage(View v)
    {
        Toast.makeText(MainActivity.this,"Convert storage from/to bits/bytes/gigabytes/kilobytess ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity13.class);
        startActivity(ac2);
    }
    public void frequency(View v)
    {
        Toast.makeText(MainActivity.this,"Convert frequency from/to gHz/mhz/hz ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity14.class);
        startActivity(ac2);
    }
    public void sound(View v)
    {
        Toast.makeText(MainActivity.this,"Convert volume from B/DB/NP ",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity15.class);
        startActivity(ac2);
    }
    public void force(View v)
    {
        Toast.makeText(MainActivity.this,"Convert area from kilonewton to newton",Toast.LENGTH_LONG).show();
        Intent ac2=new Intent(this,MainActivity16.class);
        startActivity(ac2);
    }

}
