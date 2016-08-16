package com.example.hwhong.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button zero, one, two, three, four, five, six, seven, eight, nine, clear, add,
            multiply, divide, minus, equals;
    TextView textView;
    //View.OnClickListener onClickListener;

    public String sign, total;
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        clear = (Button) findViewById(R.id.clear);
        add = (Button) findViewById(R.id.add);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        minus = (Button) findViewById(R.id.minus);
        equals = (Button) findViewById(R.id.equals);

        textView = (TextView) findViewById(R.id.textView);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        clear.setOnClickListener(this);

        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);

        equals.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zero:
                textView.append("0");
                break;
            case R.id.one:
                textView.append("1");
                break;
            case R.id.two:
                textView.append("2");
                break;
            case R.id.three:
                textView.append("3");
                break;
            case R.id.four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.six:
                textView.append("6");
                break;
            case R.id.seven:
                textView.append("7");
                break;
            case R.id.eight:
                textView.append("8");
                break;
            case R.id.nine:
                textView.append("9");
                break;
            case R.id.clear:
                textView.setText("");
                break;
            case R.id.add:
                tempDouble = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                sign = "+";
                break;
            case R.id.minus:
                tempDouble = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                sign = "-";
                break;
            case R.id.multiply:
                tempDouble = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                sign = "*";
                break;
            case R.id.divide:
                tempDouble = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                sign = "/";
                break;
            case R.id.equals:
                tempDouble2 = Double.parseDouble(textView.getText().toString());

                //operation on the signs arithmetic
                switch (sign) {
                    case "+":
                        textView.setText(Double.toString(tempDouble+tempDouble2));
                        break;
                    case "-":
                        textView.setText(Double.toString(tempDouble-tempDouble2));
                        break;
                    case "*":
                        textView.setText(Double.toString(tempDouble*tempDouble2));
                        break;
                    case "/":
                        if (tempDouble2 == 0) {
                            Toast.makeText(MainActivity.this, "Cannot divide by Zero",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            textView.setText(Double.toString(tempDouble / tempDouble2));
                        }
                        break;
                }
                sign = "";
                break;
        }
    }
}
