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


public class MainActivity11 extends ActionBarActivity {
    private EditText e1;
    private TextView result;
    private Button convert;
    private ImageButton back;
   private Spinner spin,spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity11);


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

                                    double p4= Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(p4));
                                    break;
                                case 1:
                                    double p5 = Double.valueOf(e1.getText().toString());
                                    double kp6 = (p5*0.001);
                                    result.setText(String.valueOf(kp6));
                                    break;
                                case 2:
                                    double p7= Double.valueOf(e1.getText().toString());
                                    double br7 = (1.0E-5*p7);
                                    result.setText(String.valueOf(br7));

                            }
                            break;
                        case 1 :
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double kp3 = Double.valueOf(e1.getText().toString());
                                    double p2 = (1000 *kp3);
                                    result.setText(String.valueOf(p2));
                                    break;
                                case 1:
                                    double kp2 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(kp2));
                                    break;
                                case 2:
                                    double kp1= Double.valueOf(e1.getText().toString());
                                    double br3 = (0.01*kp1);
                                    result.setText(String.valueOf(br3));

                            }
                            break;
                        case 2:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double br= Double.valueOf(e1.getText().toString());
                                    double pa= (br* 100000);
                                    result.setText(String.valueOf(pa));
                                    break;
                                case 1:
                                    double br1 = Double.valueOf(e1.getText().toString());
                                    double kp = (br1*100 );
                                    result.setText(String.valueOf(kp));
                                    break;
                                case 2:
                                    double br2 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(br2));
                                    break;
                            }
                            break;


                    }




                }
            }

        });





    }
    public void pressure(View v)
    {

        finish();
    }

}
