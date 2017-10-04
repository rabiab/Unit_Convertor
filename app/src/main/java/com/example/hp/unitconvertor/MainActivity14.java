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


public class MainActivity14 extends ActionBarActivity {
    private EditText e1;
    private TextView result;
    private Button convert;
    private ImageButton back;
    private Spinner spin ,spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity14);

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

                                    double h = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(h));
                                    break;
                                case 1:
                                    double ghz = Double.valueOf(e1.getText().toString());
                                    double db = (ghz *1000000000
                                    );
                                    result.setText(String.valueOf(db));
                                    break;
                                case 2:
                                    double GHz = Double.valueOf(e1.getText().toString());
                                    double np1 = (GHz * 1000);
                                    result.setText(String.valueOf(np1));

                            }
                            break;
                        case 1 :
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double hz = Double.valueOf(e1.getText().toString());
                                    double b1 = (hz/ 1000000000);
                                    result.setText(String.valueOf(b1));
                                    break;
                                case 1:
                                    double min1 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(min1));
                                    break;
                                case 2:
                                    double hz1= Double.valueOf(e1.getText().toString());
                                    double np6 = (hz1 / 1000000);
                                    result.setText(String.valueOf(np6));

                            }
                            break;
                        case 2:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:

                                    double mz= Double.valueOf(e1.getText().toString());
                                    double b2= (mz / 1000);
                                    result.setText(String.valueOf(b2));
                                    break;
                                case 1:
                                    double m = Double.valueOf(e1.getText().toString());
                                    double db4 = (m * 1000000 );
                                    result.setText(String.valueOf(db4));
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
    public void frequency1(View v)
    {

        finish();
    }

}
