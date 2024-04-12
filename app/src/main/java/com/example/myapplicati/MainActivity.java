package com.example.myapplicati;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num_Texta;
    EditText num_Textb;
    TextView res;
    float num_a, num_b;
    Button b_add, b_minus, b_mult, b_div, b_sqrt,b_pow,b_sin,b_cos,b_tg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num_Texta = findViewById(R.id.edit_a);
        num_Textb = findViewById(R.id.edit_b);
        res = findViewById(R.id.text_result);

        b_add = findViewById(R.id.b_add);
        b_minus = findViewById(R.id.b_minus);
        b_mult = findViewById(R.id.b_mult);
        b_div = findViewById(R.id.b_div);
        b_sqrt = findViewById(R.id.b_sqrt);
        b_pow = findViewById(R.id.b_pow);
        b_sin = findViewById(R.id.b_sin);
        b_cos = findViewById(R.id.b_cos);
        b_tg = findViewById(R.id.b_tg);

    }
    public void b_act(View v)
    {

        try
        {
            num_a = Float.parseFloat(num_Texta.getText().toString());

            num_b = Float.parseFloat(num_Textb.getText().toString());

        }
        catch (Exception ex)
        {
            res.setText("Произошла ошибка");
            return;
        }
        float n_res = 0;
        if (v ==b_add)
            n_res = num_a+num_b;

        if(v == b_minus)
            n_res = num_a-num_b;
        if (v == b_mult)
            n_res = num_a*num_b;

        if(v == b_div)
        {
            if (num_b != 0) {
                n_res = num_a / num_b;
            } else {
                res.setText("На ноль делить нельзя");
                return;
            }
        }
        if(v == b_sqrt)
        {
            if(num_a >= 0)
            {
                n_res = (float)Math.sqrt(num_a);

            }
            else
            {
                res.setText("Ошибка! Корень меньше, чем 0 нельзя!!");
                return;
            }
        }
        if (v == b_pow)
        {
            if(num_b >= 0)
            {
                n_res = (float)Math.pow(num_a,num_b);
            }
            else
            {
                res.setText("Ошибка! Степень не может быть отрицательной!");
                return;
            }
        }
        if (v == b_sin)
        {
            n_res = (float) Math.sin(num_a);
        }
        if (v == b_cos)
        {
            n_res = (float) Math.cos(num_a);
        }
        if (v == b_tg)
        {
            n_res = (float) Math.tan(num_a);
        }

        res.setText(String.valueOf(n_res));
    }

}