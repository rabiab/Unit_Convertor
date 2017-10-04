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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity8 extends ActionBarActivity {
    private EditText e1;
    private Spinner spin ,spin2;
    private TextView result;
    private Button convert;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity8);
        e1 = (EditText) findViewById(R.id.edit1);
        spin = (Spinner) findViewById(R.id.s1);
        convert = (Button) findViewById(R.id.b1);
        result = (TextView) findViewById(R.id.text);
        back = (ImageButton) findViewById(R.id.back);
        spin2 = (Spinner) findViewById(R.id.s2);


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

                                    double h = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(h));
                                    break;
                                case 1:
                                    double hr1 = Double.valueOf(e1.getText().toString());
                                    double m = (hr1*60);
                                    result.setText(String.valueOf(m));
                                    break;
                                case 2:
                                    double hr2 = Double.valueOf(e1.getText().toString());
                                    double m1 = (hr2*3600);
                                    result.setText(String.valueOf(m1));

                            }
                            break;
                            case 1 :
                                switch (spin2.getSelectedItemPosition())
                                {
                                    case 0:

                                        double min = Double.valueOf(e1.getText().toString());
                                        double h = (min/60);
                                        result.setText(String.valueOf(h));
                                        break;
                                    case 1:
                                        double min1 = Double.valueOf(e1.getText().toString());

                                        result.setText(String.valueOf(min1));
                                        break;
                                    case 2:
                                        double min2 = Double.valueOf(e1.getText().toString());
                                        double m1 = (min2*60);
                                        result.setText(String.valueOf(m1));

                                }
                                break;
                        case 2:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double sec = Double.valueOf(e1.getText().toString());
                                    double h = (sec/3600);
                                    result.setText(String.valueOf(h));
                                    break;
                                case 1:
                                    double sec1 = Double.valueOf(e1.getText().toString());
                                    double m = (sec1/60);
                                    result.setText(String.valueOf(m));
                                    break;
                                case 2:
                                    double m1 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(m1));
                                break;
                            }
                  break;


                    }




                }
            }

        });





    }
    public void time(View v)
    {

        finish();
    }


}





