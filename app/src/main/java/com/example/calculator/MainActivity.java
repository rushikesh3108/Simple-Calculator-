package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
    buttonadd,buttonsub,buttonmul,buttondiv,buttonclear,buttonequals,button0;
    float value1,value2;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.num1);
        button2=findViewById(R.id.num2);
        button3=findViewById(R.id.num3);
        button4=findViewById(R.id.num4);
        button0=findViewById(R.id.num0);
        button5=findViewById(R.id.num5);
        button6=findViewById(R.id.num6);
        button7=findViewById(R.id.num7);
        button8=findViewById(R.id.num8);
        button9=findViewById(R.id.num9);
        button10=findViewById(R.id.dot);
        buttonadd=findViewById(R.id.add);
        buttonsub=findViewById(R.id.sub);
        buttonmul= findViewById(R.id.multiply);
        buttondiv=findViewById(R.id.div);
        buttonclear=findViewById(R.id.clear);
        buttonequals=findViewById(R.id.equals);
        editText=findViewById(R.id.n1);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText==null){
                    editText.setText("");
                }
                else {
                    value1=Float.parseFloat(editText.getText()+"");
                    Addition=true;
                    editText.setText(null);

                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+"");
                Subtract=true;
                editText.setText(null);
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+"");
                Division=true;
                editText.setText(null);
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+"");
                Multiplication=true;
                editText.setText(null);
            }
        });
        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    value2=Float.parseFloat(editText.getText()+"");
                if(Addition==true){
                   editText.setText(value1 + value2 + "");
                   Addition=false;
                }

                else if (Subtract==true){
                    editText.setText(value1 - value2 + "");
                    Subtract=false;
                }
                else if (Multiplication==true){
                    editText.setText(value1 * value2 + "");
                    Multiplication=false;
                }
                else if (Division==true){
                    editText.setText(value1 / value2 + "");
                    Division=false;

                }


            }
        });

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
    }
}
