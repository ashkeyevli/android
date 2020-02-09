package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btn_zero,btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine;
private Button btn_plus, btn_minus, btn_mult, btn_divide, btn_del,btn_c, btn_square,btn_root,btn_equal,btn_dot;
private double number=0,number1=0;
private TextView numberInput;
private String delText;
public char action;
private String get;


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


    }

  /*  public static String removezero(String str){
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "")
        return sb.toString();
    }*/
    public void onClick(View view) {
        get=numberInput.getText().toString();
        try {

          //  if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0'){
           //     checkzero=false;

          //  }
          //  if(numberInput.length()>1)
             //   checkzero=true;







           if (numberInput.getText().toString().equals("Infinity") || numberInput.getText().toString().equals("Wrong operation") || numberInput.getText().toString().equals("NaN")) {
                numberInput.setText("Wrong operation");
                checkNumber = false;
                delete = false;
            }

                switch (view.getId()) {
                    case R.id.btn_zero: {

                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if(checkNumber && checkzero)
                            numberInput.append("0");
                        break;

                    }
                    case R.id.btn_one: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("1");
                        break;
                    }
                    case R.id.btn_two: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("2");
                        break;
                    }
                    case R.id.btn_three: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("3");
                        break;
                    }
                    case R.id.btn_four: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("4");
                        break;
                    }
                    case R.id.btn_five: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("5");
                        break;
                    }
                    case R.id.btn_six: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("6");
                        break;
                    }
                    case R.id.btn_seven: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("7");
                        break;
                    }
                    case R.id.btn_eight: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (checkNumber && checkzero)
                            numberInput.append("8");
                        break;
                    }
                    case R.id.btn_nine: {
                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

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
                        }
                        break;
                    }
                    case R.id.btn_equal: {
                        checkNumber = false;
                        check = false;



                        number1 = Double.valueOf(numberInput.getText().toString());
                        if (number1 == 0&& action == '/') {
                            numberInput.setText("Cannot divide by 0");

                        } else {
                            numberInput.setText(String.valueOf(action(number, number1)));
                            number = number1;
                            checkAction = false;

                            break;
                        }
                    }

                    case R.id.btn_dot: {

                        if(numberInput.length()==1&&numberInput.getText().toString().charAt(0)=='0') {

                            numberInput.setText("");
                        }

                        if (check && checkNumber) {

                            numberInput.setText(numberInput.getText() + "0.");

                            check = false;
                            checkzero = true;
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

            default:
                return 0;
        }
    }




        }
