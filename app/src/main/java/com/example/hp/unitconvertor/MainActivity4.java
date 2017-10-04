package com.example.hp.unitconvertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity4 extends ActionBarActivity {
    private EditText e1;
    private TextView result;
    private Button convert;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);

        e1 = (EditText) findViewById(R.id.edit1);
        convert = (Button) findViewById(R.id.b1);
        result = (TextView) findViewById(R.id.text1);
        back = (ImageButton) findViewById(R.id.back);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "please Enter velue", Toast.LENGTH_LONG).show();
                } else {
                    double kilometer = Double.valueOf(e1.getText().toString());
                    double res_cel = (kilometer /1000);
                    result.setText(String.valueOf(res_cel));

                }  }

        });




    }
    public void back(View v)
    {

        finish();
    }



}
