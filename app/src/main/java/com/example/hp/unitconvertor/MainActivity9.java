package com.example.hp.unitconvertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;


public class MainActivity9 extends ActionBarActivity {
    private EditText e1;
    private TextView result;
    private Button convert;
    private ImageButton back;
  private Spinner spin1,spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity9);
        spin1=(Spinner)findViewById(R.id.spin);
        spin2 =(Spinner)findViewById(R.id.spn);
        e1 = (EditText) findViewById(R.id.edit1);
        convert = (Button) findViewById(R.id.b1);
        result = (TextView) findViewById(R.id.text1);
        back = (ImageButton) findViewById(R.id.back);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "please Enter velue", Toast.LENGTH_LONG).show();
                }


                else {
                    switch (spin1.getSelectedItemPosition()) {
                        case 0:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:

                                    double h = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(h));
                                    break;
                                case 1:

                                    double ft = Double.valueOf(e1.getText().toString());
                                    double km = ft *  0.00000009290304;
                                    result.setText(String.valueOf(km));


                                    break;
                                case 2:
                                    double ft1 = Double.valueOf(e1.getText().toString());
                                    double acr = (ft1/ 43560);
                                    result.setText(String.valueOf(acr));

                            }
                            break;
                        case 1:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:

                                    double k = Double.valueOf(e1.getText().toString());
                                    double f = (k/ 0.00000009290304);
                                    result.setText(String.valueOf(f));
                                    break;
                                case 1:
                                    double min1 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(min1));
                                    break;
                                case 2:
                                    double km2 = Double.valueOf(e1.getText().toString());
                                    double acr = ( km2 / 0.00404685642);
                                    result.setText(String.valueOf(acr));

                            }
                            break;
                        case 2:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:

                                    double acr1 = Double.valueOf(e1.getText().toString());
                                    double f = (acr1 * 43560);
                                    result.setText(String.valueOf(f));
                                    break;
                                case 1:
                                    double acr3 = Double.valueOf(e1.getText().toString());
                                    double km = (acr3 * 0.0040468564224);
                                    result.setText(String.valueOf(km));
                                    break;
                                case 2:
                                    double m1 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(m1));
                                    break;
                            }
                            break;


                    }
                }

        }});




    }
    public void area(View v)
    {

        finish();
    }
}
