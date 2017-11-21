package com.example.toki.calculator_easy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {
    EditText editText1,editText2;
    TextView textView1,textView2;
    Button button1,button2,button3,button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);
        button1=findViewById(R.id.add);
        button2=findViewById(R.id.sub);
        button3=findViewById(R.id.mul);
        button4=findViewById(R.id.div);
        textView2=findViewById(R.id.tv1);


    }

    public void add(View view)
    {
        float a = Integer.parseInt(editText1.getText().toString());
        float b = Integer.parseInt(editText2.getText().toString());
        String i = String.valueOf(a + b);
        textView2.setText(i);
    }
      public void sub(View view)
        {
            float a = Integer.parseInt(editText1.getText().toString());
        float b = Integer.parseInt(editText2.getText().toString());
        String i = String.valueOf(a-b);
        textView2.setText(i);
    }
    public void mul(View view)
    {
        float a = Integer.parseInt(editText1.getText().toString());
        float b = Integer.parseInt(editText2.getText().toString());
        String i = String.valueOf(a*b);
        textView2.setText(i);
    }
    public void div(View view)
    {
        float a = Integer.parseInt(editText1.getText().toString());
        float b = Integer.parseInt(editText2.getText().toString());
        float i = (a/b);
        String j = String.valueOf(i);
        textView2.setText(j);
    }
}
