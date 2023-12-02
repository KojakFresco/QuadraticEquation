package com.example.QuadraticEquation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText a_coeff;
    private EditText b_coeff;
    private EditText c_coeff;
    private Button btn;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a_coeff = findViewById(R.id.a_coeff);
        b_coeff = findViewById(R.id.b_coeff);
        c_coeff = findViewById(R.id.с_coeff);
        btn = findViewById(R.id.button);
        text = findViewById(R.id.textView6);
    }

    public void quadraticEquation(View v) {
        double a = Double.parseDouble(a_coeff.getText().toString());
        double b = Double.parseDouble(b_coeff.getText().toString());
        double c = Double.parseDouble(c_coeff.getText().toString());
        double d = b*b - 4*a*c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            text.setText("x1 = " + x1 + "   x2 = " + x2);
        } else if (d == 0) {
            double x = -b/(2*a);
            text.setText("x = " + x);
        } else {
            text.setText("Нет корней в действительных числах");
        }
    }

}