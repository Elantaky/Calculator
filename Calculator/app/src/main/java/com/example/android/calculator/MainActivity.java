package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    float first;
    float second;
    float result;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = (TextView) findViewById(R.id.textveiw);
        Button zero = (Button) findViewById(R.id.button0);
        Button one = (Button) findViewById(R.id.button1);
        Button two = (Button) findViewById(R.id.button2);
        Button three = (Button) findViewById(R.id.button3);
        Button four = (Button) findViewById(R.id.button4);
        Button five = (Button) findViewById(R.id.button5);
        Button six = (Button) findViewById(R.id.button6);
        Button seven = (Button) findViewById(R.id.button7);
        Button eight = (Button) findViewById(R.id.button8);
        Button nine = (Button) findViewById(R.id.button9);
        Button plus = (Button) findViewById(R.id.buttonpl);
        Button sub = (Button) findViewById(R.id.buttons);
        Button mul = (Button) findViewById(R.id.buttonml);
        Button div = (Button) findViewById(R.id.buttond);
        Button delete = (Button) findViewById(R.id.buttonC);
        Button equal = (Button) findViewById(R.id.buttoneq);
        Button dot = (Button) findViewById(R.id.buttondot);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textview.setText(textview.getText() + "1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "9");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + ".");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(textview.getText() + "0");

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Float.parseFloat(textview.getText().toString());
                textview.setText(null);
                ope = 1;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Float.parseFloat(textview.getText().toString());
                textview.setText(null);
                ope = 2;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Float.parseFloat(textview.getText().toString());
                textview.setText(null);
                ope = 3;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Float.parseFloat(textview.getText().toString());
                textview.setText(null);
                ope = 4;
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textview.setText(null);
                first=0;
                second=0;
                result=0;

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Integer.parseInt(textview.getText().toString());
                if (second == 0.0 && ope==4) {
                    textview.setText("Div by zero error!!");
                } else switch (ope) {
                    case 1:
                        result = first + second;
                        textview.setText("" + result);
                        break;
                    case 2:
                        result = first * second;
                        textview.setText("" + result);
                        break;
                    case 3:
                        result = first - second;
                        textview.setText("" + result);
                        break;
                    case 4:
                        result = first / second;
                        textview.setText("" + result);
                        break;
                }


        }
    });


}
}
