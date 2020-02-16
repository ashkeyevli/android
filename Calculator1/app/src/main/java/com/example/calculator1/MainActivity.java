package com.example.calculator1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btn_zero,btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine;
private Button btn_plus, btn_minus, btn_mult, btn_divide, btn_del,btn_c, btn_square,btn_root,btn_equal,btn_dot;
private Button btn_percent, btn_sin,btn_cos,btn_tan,btn_cot, btn_ln,btn_log,btn_fact,btn_power,btn_powersqrt;
private double number=0,number1=0;
private TextView numberInput;
private String delText;
public char action;





private boolean check=true, checkNumber=true, checkAction=true, delete=true, checkzero=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberInput = findViewById(R.id.inputoutputtext);
        btn_zero=findViewById(R.id.btn_zero);
        btn_one=findViewById(R.id.btn_one);
        btn_two=findViewById(R.id.btn_two);
        btn_three=findViewById(R.id.btn_three);
        btn_four=findViewById(R.id.btn_four);
        btn_five=findViewById(R.id.btn_five);
        btn_six=findViewById(R.id.btn_six);
        btn_seven=findViewById(R.id.btn_seven);
        btn_eight=findViewById(R.id.btn_eight);
        btn_nine=findViewById(R.id.btn_nine);
        btn_plus=findViewById(R.id.btn_plus);
        btn_minus=findViewById(R.id.btn_minus);
        btn_mult=findViewById(R.id.btn_mult);
        btn_divide=findViewById(R.id.btn_divide);
        btn_del=findViewById(R.id.btn_del);
        btn_c=findViewById(R.id.btn_c);
        btn_square=findViewById(R.id.btn_square);
        btn_root=findViewById(R.id.btn_root);
        btn_equal=findViewById(R.id.btn_equal);
        btn_dot=findViewById(R.id.btn_dot);
        btn_percent=findViewById(R.id.btn_percent);
        btn_sin=findViewById(R.id.btn_sin);
        btn_cos=findViewById(R.id.btn_cos);
        btn_tan=findViewById(R.id.btn_tan);
        btn_cot=findViewById(R.id.btn_cot);
        btn_ln=findViewById(R.id.btn_ln);
        btn_log=findViewById(R.id.btn_log);
        btn_fact=findViewById(R.id.btn_fact);
        btn_power=findViewById(R.id.btn_power);
        btn_powersqrt=findViewById(R.id.btn_powersqrt);
        if(savedInstanceState!=null){
            number=savedInstanceState.getDouble("number");
            number1=savedInstanceState.getDouble("number1");
            action=savedInstanceState.getChar("action");
            checkAction=savedInstanceState.getBoolean("checkAction");
            checkNumber=savedInstanceState.getBoolean("checkNumber");
            check=savedInstanceState.getBoolean("check");
            delete=savedInstanceState.getBoolean("delete");
            numberInput.setText(savedInstanceState.getString("numberInput"));
        }


    }


    public void onClick(View view) {

        try {
           if (numberInput.getText().toString().equals("Infinity") || numberInput.getText().toString().equals("Wrong operation") || numberInput.getText().toString().equals("NaN")) {
                numberInput.setText("Wrong operation");
                checkNumber = false;
                delete = false;
            }
               switch (view.getId()) {
                    case R.id.btn_zero: {

                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("0");
                        break;

                    }
                    case R.id.btn_one: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("1");
                        break;
                    }
                    case R.id.btn_two: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("2");
                        break;
                    }
                    case R.id.btn_three: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("3");
                        break;
                    }
                    case R.id.btn_four: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("4");
                        break;
                    }
                    case R.id.btn_five: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("5");
                        break;
                    }
                    case R.id.btn_six: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("6");
                        break;
                    }
                    case R.id.btn_seven: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("7");
                        break;
                    }
                    case R.id.btn_eight: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("8");
                        break;
                    }
                    case R.id.btn_nine: {
                        if (numberInput.length() == 1 && numberInput.getText().toString().charAt(0) == '0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("9");
                        break;
                    }
                    case R.id.btn_plus: {
                        check = true;
                        checkNumber = true;
                        checkAction = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        numberInput.setText("");
                        action = '+';
                        break;

                    }
                    case R.id.btn_minus: {
                        checkAction = true;
                        check = true;
                        checkNumber = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        numberInput.setText("");
                        action = '-';
                        break;
                    }
                    case R.id.btn_mult: {

                        check = true;
                        checkNumber = true;
                        checkAction = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        numberInput.setText("");
                        action = '×';
                        break;
                    }
                    case R.id.btn_power: {
                        check = true;
                        checkNumber = true;
                        checkAction = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        numberInput.setText("");
                        action='p';
                        break;

                    }
                    case R.id.btn_divide: {
                        check = true;
                        checkNumber = true;
                        checkAction = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }

                        numberInput.setText("");
                        action = '/';
                        break;
                    }
                    case R.id.btn_del: {
                        if (delete) {
                            delText = numberInput.getText().toString();
                            if (delText.length() > 0) {
                                delText = delText.substring(0, delText.length() - 1);
                                numberInput.setText(delText);
                            }
                        }
                        break;
                    }
                    case R.id.btn_c: {
                        checkNumber = true;
                        checkAction = true;
                        check = true;
                        delete = true;
                        number = 0;
                        number1 = 0;
                        numberInput.setText("");
                        break;
                    }
                    case R.id.btn_square: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        numberInput.setText(String.valueOf(Math.pow(number, 2)));

                        break;
                    }
                    case R.id.btn_root: {
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        if (number >= 0) {
                            numberInput.setText(String.valueOf(Math.sqrt(number)));
                        } else {
                            numberInput.setText("Wrong action");
                            delete=false;
                        }
                        break;
                    }

                    case R.id.btn_equal: {

                        checkNumber = false;

                        check = false;
                        number1 = Double.valueOf(numberInput.getText().toString());
                        if (number1 == 0 && action == '/') {
                            numberInput.setText("Cannot divide by 0");
                            delete=false;

                        }
                        else if(number1>323&&action=='p'){
                            numberInput.setText("Too big Number for power operation");
                            delete=false;
                        }
                        else {
                            numberInput.setText(String.valueOf(action(number, number1)));
                            number = number1;
                            checkAction = false;
                            break;
                        }


                    }

                    case R.id.btn_dot: {
                        if (check && checkNumber) {
                            numberInput.setText(numberInput.getText() + ".");
                            check = false;
                            checkzero = true;
                        }
                        break;
                    }


                    case R.id.btn_percent: {
                        check = true;
                        checkNumber = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        numberInput.setText(String.valueOf(number1 / 100));
                        break;
                    }

                    case R.id.btn_sin: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        if (number1 == 30) {
                            numberInput.setText("0.5");
                        } else {
                            numberInput.setText(String.valueOf(Math.sin(Math.toRadians(number1))));
                        }
                        break;
                    }
                    case R.id.btn_cos: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        if (number1 == 60) {
                            numberInput.setText("0.5");
                        } else if (number1 == 90) {
                            numberInput.setText("0");
                        } else {
                            numberInput.setText(String.valueOf(Math.cos(Math.toRadians(number1))));
                        }
                        break;
                    }
                    case R.id.btn_tan: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        if (number1 == 90) {
                            numberInput.setText("not defined");
                            checkNumber=false;
                            delete=false;
                        } else {
                            numberInput.setText(String.valueOf(Math.tan(Math.toRadians(number1))));
                        }
                        break;
                    }
                    case R.id.btn_cot: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        if (number1 == 0) {
                            numberInput.setText("not defined");
                            delete=false;
                            checkNumber=false;
                        } else {
                            numberInput.setText(String.valueOf(1 / (Math.tan(Math.toRadians(number1)))));
                        }
                        break;
                    }
                    case R.id.btn_ln: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        if(number1<1){
                            numberInput.setText("Not a number");
                            delete=false;
                            checkNumber=false;
                        }
                        else {

                            numberInput.setText(String.valueOf(Math.log(number1)));
                        }
                        break;

                    }
                    case R.id.btn_log: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        if(number1<1){
                            numberInput.setText("Not a number");
                            delete=false;
                            checkNumber=false;

                        }
                        else {

                            numberInput.setText(String.valueOf(Math.log10(number1)));
                        }
                        break;

                    }
                    case R.id.btn_fact: {
                        checkNumber = true;
                        check = true;
                        if (numberInput.getText().toString().length() != 0) {
                            number1 = Double.valueOf(numberInput.getText().toString());
                        }
                        int i;
                        long fact=1;
                        if(number1<20) {
                            for (i = 1; i <= number1; i++) {
                                fact = fact * i;
                            }

                        numberInput.setText(String.valueOf(fact));
                        }
                        else{
                            numberInput.setText("too big number for factorial");
                        delete=false;
                        checkAction=false;
                       checkNumber=false;
                        check=false;}
                        break;

                    }
                    case R.id.btn_powersqrt:{
                        checkNumber=true;
                        check=true;
                        checkAction=true;
                        if (numberInput.getText().toString().length() != 0) {
                            number = Double.valueOf(numberInput.getText().toString());
                        }
                        if (number >= 0) {
                            numberInput.setText("");
                            action='s';
                            break;
                        } else {
                            numberInput.setText("Wrong action");
                            delete=false;
                        }
                        break;

                    }


                }

        } catch (Exception e) {
            numberInput.setText("Wrong operation");
        }
    }

    public double action(double number, double number1){

        switch(action){
            case '+':
                return number + number1;
            case '-':
                return number - number1;
            case '×':
                return number * number1;
            case '/':
                return number / number1;
            case 'p':
                return Math.pow(number,number1);


            case 's': {
                double dres = Math.pow(number, 1.0 / number1);

                double ires = Math.round(dres);
                double diff = Math.abs(dres - ires);
                if (diff < Math.ulp(10.0)) {
                    return ires;
                }
                else{
                    return dres;


                }
            }
            default:
                return 0;

            }

        }

    @Override
      protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("numberInput",numberInput.getText().toString());
        outState.putDouble("number",number);
        outState.putDouble("number1",number1);
        outState.putBoolean("check",check);
        outState.putBoolean("checkNumber",checkNumber);
        outState.putBoolean("delete",delete);
        outState.putBoolean("checkAction",checkAction);
        outState.putChar("action",action);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("numberInput");
        savedInstanceState.getDouble("number");
        savedInstanceState.getDouble("number1");
        savedInstanceState.getBoolean("checkNumber");
        savedInstanceState.getBoolean("check");
        savedInstanceState.getChar("action");
        savedInstanceState.getBoolean("delete");
        savedInstanceState.getBoolean("checkAction");



    }




        }
