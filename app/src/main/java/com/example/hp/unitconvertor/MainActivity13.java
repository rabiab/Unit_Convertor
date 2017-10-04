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


public class MainActivity13 extends ActionBarActivity {
    private EditText e1;
    private TextView result;
    private Button convert;
    private ImageButton back;
    private Spinner spin ,spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity13);
        e1 = (EditText) findViewById(R.id.edit1);
        spin = (Spinner) findViewById(R.id.s1);
        convert = (Button) findViewById(R.id.b1);
        result = (TextView) findViewById(R.id.text1);
        back = (ImageButton) findViewById(R.id.back);
        spin2= (Spinner) findViewById(R.id.s2);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "please Enter velue", Toast.LENGTH_LONG).show();
                }
                else{
                    switch(spin.getSelectedItemPosition())
                    {
                        case 0:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double bi1 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(bi1));
                                    break;
                                case 1:
                                    double bi2 = Double.valueOf(e1.getText().toString());
                                    double by1 = (bi2 / 8);
                                    result.setText(String.valueOf(by1));
                                    break;
                                case 2:
                                    double bi3 = Double.valueOf(e1.getText().toString());
                                    double  g1 = (bi3 *1.25E-10);
                                    result.setText(String.valueOf(g1));
                                    break;
                                case 3:
                                    double bi4 = Double.valueOf(e1.getText().toString());
                                    double k1 = (bi4 * 0.0001220703125);
                                    result.setText(String.valueOf(k1));
                                    break;

                            }
                            break;
                        case 1 :
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double by2 = Double.valueOf(e1.getText().toString());
                                    double bi5 = (by2*8);
                                    result.setText(String.valueOf(bi5));
                                    break;
                                case 1:
                                    double by3 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(by3));
                                    break;
                                case 2:
                                    double by4= Double.valueOf(e1.getText().toString());
                                    double g2 = (by4 *1.0E-9);
                                    result.setText(String.valueOf(g2));
                                break;
                                case 3:
                                    double by5= Double.valueOf(e1.getText().toString());
                                    double k2 = (by5 *0.001);
                                    result.setText(String.valueOf(k2));
                                    break;


                            }
                            break;
                        case 2:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double g3= Double.valueOf(e1.getText().toString());
                                    double bi7= (g3 *858993459);
                                    result.setText(String.valueOf(bi7));
                                    break;
                                case 1:
                                    double g4 = Double.valueOf(e1.getText().toString());
                                    double by5 = (g4* 1073741824 );
                                    result.setText(String.valueOf(by5));
                                    break;
                                case 2:
                                    double m1 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(m1));
                                    break;
                                case 3:
                                    double g5= Double.valueOf(e1.getText().toString());
                                    double k4 = (g5*1048576);
                                    result.setText(String.valueOf(k4));
                                    break;

                            }
                            break;
                        case 3:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double k9= Double.valueOf(e1.getText().toString());
                                    double bi8= (k9 *8192);
                                    result.setText(String.valueOf(bi8));
                                    break;
                                case 1:
                                    double k8 = Double.valueOf(e1.getText().toString());
                                    double by8 = (k8 * 1024 );
                                    result.setText(String.valueOf(by8));
                                    break;

                                case 2:
                                    double k7= Double.valueOf(e1.getText().toString());
                                    double g2 = (k7 /1048576);
                                    result.setText(String.valueOf(g2));
                                    break;

                                case 3:
                                    double k6 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(k6));
                                    break;
                            }

                            break;

                    }




                }
            }

        });





    }
    public void storage(View v)
    {

        finish();
    }
}
