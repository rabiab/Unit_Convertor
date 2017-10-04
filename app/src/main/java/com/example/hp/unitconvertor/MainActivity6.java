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


public class MainActivity6 extends ActionBarActivity {
    private EditText e1;
    private TextView result;
    private Button convert;
    private ImageButton back;
    private Spinner spin, spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity6);

        e1 = (EditText) findViewById(R.id.edit1);
        convert = (Button) findViewById(R.id.b1);
        result = (TextView) findViewById(R.id.text1);
        back = (ImageButton) findViewById(R.id.back);
        spin=(Spinner)findViewById(R.id.s1);
        spin2=(Spinner)findViewById(R.id.s2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "please Enter velue", Toast.LENGTH_LONG).show();
                } else {
                    switch(spin.getSelectedItemPosition())
                    {
                        case 0:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:
                                    double us = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us));
                                    break;
                                case 1:
                                double us1 = Double.valueOf(e1.getText().toString());
                                double e = (us1*0.85023);
                                result.setText(String.valueOf(e));
                                break;
                                case 2:
                                double us2 = Double.valueOf(e1.getText().toString());
                                double in = (us2*64.0859);
                                result.setText(String.valueOf(in));
                                break;
                                case 3:
                                double us3 = Double.valueOf(e1.getText().toString());
                                double ae = (us3* 3.673018);
                                result.setText(String.valueOf(ae));
                                break;
                                case 4:
                                double us4 = Double.valueOf(e1.getText().toString());
                                double eg = (us4*17.7715);
                                result.setText(String.valueOf(eg));
                                break;
                                case 5:
                                double us5 = Double.valueOf(e1.getText().toString());
                                double idr = (us5*1165.8);
                                result.setText(String.valueOf(idr));
                                break;
                                case 6:
                                    double us6 = Double.valueOf(e1.getText().toString());
                                    double sau = (us6*3.75025);
                                    result.setText(String.valueOf(sau));
                                    break;
                                case 7:
                                 double us7 = Double.valueOf(e1.getText().toString());
                                double pk = (us7*105.334);
                                result.setText(String.valueOf(pk));
                                break;
                            }
                        case 1:
                            switch (spin2.getSelectedItemPosition())
                            {
                                case 0:
                                    double us10 = Double.valueOf(e1.getText().toString());
                                    double e10 = (us10*1.1761523352505);
                                    result.setText(String.valueOf(e10));
                                    break;
                                case 1:
                                    double us11 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us11));
                                    break;
                                case 2:
                                    double us12 = Double.valueOf(e1.getText().toString());
                                    double in12 = (us12*75.374780941628);
                                    result.setText(String.valueOf(in12));
                                    break;
                                case 3:
                                    double us13 = Double.valueOf(e1.getText().toString());
                                    double ae13 = (us13*4.320028698117);
                                    result.setText(String.valueOf(ae13));
                                    break;
                                case 4:
                                    double us14 = Double.valueOf(e1.getText().toString());
                                    double eg14 = (us14*20.901991225904);
                                    result.setText(String.valueOf(eg14));
                                    break;
                                case 5:
                                    double us15 = Double.valueOf(e1.getText().toString());
                                    double idr15 = (us15* 1371.158392435);
                                    result.setText(String.valueOf(idr15));
                                    break;
                                case 6:
                                    double us16 = Double.valueOf(e1.getText().toString());
                                    double sau16 = (us16*4.410865295273);
                                    result.setText(String.valueOf(sau16));
                                    break;
                                case 7:
                                    double eur17 = Double.valueOf(e1.getText().toString());
                                    double pk117 = (eur17*123.88226950355);
                                    result.setText(String.valueOf(pk117));
                                    break;
                            }

                          break;
                        case 2:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:
                                    double usa20 = Double.valueOf(e1.getText().toString());
                                    double u20 = (usa20 * 0.01560405643051);
                                    result.setText(String.valueOf(u20));
                                    break;
                                case 1:
                                    double us21 = Double.valueOf(e1.getText().toString());
                                    double e21 = (us21 * 0.013267036898912);
                                    result.setText(String.valueOf(e21));
                                    break;
                                case 2:
                                    double us22 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us22));
                                    break;
                                case 3:
                                    double us23 = Double.valueOf(e1.getText().toString());
                                    double ae23 = (us23 * 0.057313980142278);
                                    result.setText(String.valueOf(ae23));
                                    break;
                                case 4:
                                    double us34 = Double.valueOf(e1.getText().toString());
                                    double eg34 = (us34 * 0.2773074888548);
                                    result.setText(String.valueOf(eg34));
                                    break;
                                case 5:
                                    double us35 = Double.valueOf(e1.getText().toString());
                                    double idr35 = (us35 * 18.191208986688);
                                    result.setText(String.valueOf(idr35));
                                    break;
                                case 6:
                                    double us36 = Double.valueOf(e1.getText().toString());
                                    double sau36 = (us36 * 0.058519112628519);
                                    result.setText(String.valueOf(sau36));
                                    break;
                                case 7:
                                    double ind36 = Double.valueOf(e1.getText().toString());
                                    double pk23 = (ind36 * 1.6435506406245);
                                    result.setText(String.valueOf(pk23));
                            }

                        break;
                        case 3:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:
                                    double us1 = Double.valueOf(e1.getText().toString());
                                    double us = (us1 *   0.27225567639472 );
                                    result.setText(String.valueOf(us));
                                    break;
                                case 1:
                                    double us16 = Double.valueOf(e1.getText().toString());
                                    double e = (us16 *  0.23147994374109 );
                                    result.setText(String.valueOf(e));
                                    break;
                                case 2:
                                    double us2 = Double.valueOf(e1.getText().toString());
                                    double in = (us2 *17.447750051865);
                                    result.setText(String.valueOf(in));
                                    break;
                                case 3:
                                    double us93 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us93));
                                    break;
                                case 4:
                                    double us4 = Double.valueOf(e1.getText().toString());
                                    double eg1 = (us4 *4.8383917530489);
                                    result.setText(String.valueOf(eg1));
                                    break;
                                case 5:
                                    double us5 = Double.valueOf(e1.getText().toString());
                                    double idr = (us5 *  317.39566754097);
                                    result.setText(String.valueOf(idr));
                                    break;
                                case 6:
                                    double us6 = Double.valueOf(e1.getText().toString());
                                    double pk31 = (us6*1.0210268503993 );
                                    result.setText(String.valueOf(pk31));
                                    break;
                                case 7:
                                    double aed= Double.valueOf(e1.getText().toString());
                                    double pk3 = (aed*28.676260775199 );
                                    result.setText(String.valueOf(pk3));
                                    break;
                            }

                            break;
                        case 4:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:
                                    double us40 = Double.valueOf(e1.getText().toString());
                                    double e40 = (us40 *0.056269870297949);
                                    result.setText(String.valueOf(us40));
                                    break;
                                case 1:
                                    double us1 = Double.valueOf(e1.getText().toString());
                                    double e = (us1 * 0.047842331823425 );
                                    result.setText(String.valueOf(e));
                                    break;
                                case 2:
                                    double us2 = Double.valueOf(e1.getText().toString());
                                    double in = (us2 *  3.6061052809273 );
                                    result.setText(String.valueOf(in));
                                    break;
                                case 3:
                                    double us3 = Double.valueOf(e1.getText().toString());
                                    double ae = (us3 *  0.20668024646203 );
                                    result.setText(String.valueOf(ae));
                                    break;
                                case 4:
                                    double us44 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us44));
                                    break;
                                case 5:
                                    double us5 = Double.valueOf(e1.getText().toString());
                                    double idr = (us5 *65.599414793349 );
                                    result.setText(String.valueOf(idr));
                                    break;
                                case 6:
                                    double us6 = Double.valueOf(e1.getText().toString());
                                    double sau = (us6 * 0.21102608108488);
                                    result.setText(String.valueOf(sau));
                                    break;
                                case 7:
                                    double eg7 = Double.valueOf(e1.getText().toString());
                                    double pk8 = (eg7* 5.9268166446276 );
                                    result.setText(String.valueOf(pk8));
                                    break;
                            }

                            break;
                        case 5:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:
                                    double us50= Double.valueOf(e1.getText().toString());
                                    double e50 = (us50 *  0.00085778006519129 );
                                    result.setText(String.valueOf(e50));
                                    break;
                                case 1:
                                    double us1 = Double.valueOf(e1.getText().toString());
                                    double e = (us1 * 0.00072931034482759 );
                                    result.setText(String.valueOf(e));
                                    break;
                                case 2:
                                    double us2 = Double.valueOf(e1.getText().toString());
                                    double in = (us2 *  0.054971607479842);
                                    result.setText(String.valueOf(in));
                                    break;
                                case 3:
                                    double us3 = Double.valueOf(e1.getText().toString());
                                    double ae = (us3 *0.0031506416194888);
                                    result.setText(String.valueOf(ae));
                                    break;
                                case 4:
                                    double us4 = Double.valueOf(e1.getText().toString());
                                    double eg = (us4 * 0.015244038428547);
                                    result.setText(String.valueOf(eg));
                                    break;
                                case 5:
                                    double us55 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us55));
                                    break;
                                case 6:
                                    double us6 = Double.valueOf(e1.getText().toString());
                                    double sau = (us6 *  0.0032168896894836);
                                    result.setText(String.valueOf(sau));
                                    break;
                                case 7:
                                    double iq = Double.valueOf(e1.getText().toString());
                                    double pk7 = (iq*0.090348620689655 );
                                    result.setText(String.valueOf(pk7));
                                    break;
                            }


                            break;
                        case 6:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:
                                    double us1 = Double.valueOf(e1.getText().toString());
                                    double us = (us1 *  0.266648890074);
                                    result.setText(String.valueOf(us));
                                    break;
                                case 1:
                                    double us16 = Double.valueOf(e1.getText().toString());
                                    double e = (us16 *  0.22671288580761);
                                    result.setText(String.valueOf(e));
                                    break;
                                case 2:
                                    double us2 = Double.valueOf(e1.getText().toString());
                                    double in = (us2 * 17.088434104393);
                                    result.setText(String.valueOf(in));
                                    break;
                                case 3:
                                    double us3 = Double.valueOf(e1.getText().toString());
                                    double eg = (us3 *0.97940617292181 );
                                    result.setText(String.valueOf(eg));
                                    break;
                                case 4:
                                    double us4 = Double.valueOf(e1.getText().toString());
                                    double eg1 = (us4 *4.73875074995);
                                    result.setText(String.valueOf(eg1));
                                    break;
                                case 5:
                                    double us5 = Double.valueOf(e1.getText().toString());
                                    double idr = (us5 *  310.85927604826);
                                    result.setText(String.valueOf(idr));
                                    break;
                                case 6:
                                    double us6 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(us6));
                                    break;
                                case 7:
                                    double aed= Double.valueOf(e1.getText().toString());
                                    double pk3 = (aed*28.676260775199 );
                                    result.setText(String.valueOf(pk3));
                                    break;
                            }


                            break;
                        case 7:
                            switch (spin2.getSelectedItemPosition()) {
                                case 0:
                                    double us70 = Double.valueOf(e1.getText().toString());
                                    double e70 = (us70 * 0.0094941135641432);
                                    result.setText(String.valueOf(e70));
                                    break;
                                case 1:
                                    double us1 = Double.valueOf(e1.getText().toString());
                                    double e = (us1 *  0.0080721801756415);
                                    result.setText(String.valueOf(e));
                                    break;
                                case 2:
                                    double us2 = Double.valueOf(e1.getText().toString());
                                    double in = (us2 *  0.60843881246033);
                                    result.setText(String.valueOf(in));
                                    break;
                                case 3:
                                    double us3 = Double.valueOf(e1.getText().toString());
                                    double ae = (us3 *  0.034872050015142);
                                    result.setText(String.valueOf(ae));
                                    break;
                                case 4:
                                    double us4 = Double.valueOf(e1.getText().toString());
                                    double eg = (us4 * 0.16872463920517);
                                    result.setText(String.valueOf(eg));
                                    break;
                                case 5:
                                    double us5 = Double.valueOf(e1.getText().toString());
                                    double idr = (us5 *  11.068237593078 );
                                    result.setText(String.valueOf(idr));
                                    break;
                                case 6:
                                    double us6 = Double.valueOf(e1.getText().toString());
                                    double sau = (us6 * 0.035605299393928);
                                    result.setText(String.valueOf(sau));
                                    break;
                                case 7:
                                    double r77 = Double.valueOf(e1.getText().toString());

                                    result.setText(String.valueOf(r77));
                                    break;
                            }


                            break;



                    }
                }
            }

        });




    }
    public void currency(View v)
    {

        finish();
    }




}
