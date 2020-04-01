package com.chamiviews.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText firstNumber,secondNumber;
    TextView answer;
    String num1,num2;
    Double number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnAdd);
        firstNumber=findViewById(R.id.txt1);
        secondNumber=findViewById(R.id.txt2);
        answer=findViewById(R.id.txtAnswer);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               num1=firstNumber.getText().toString();
               num2=secondNumber.getText().toString();

               try{
                   number1=Double.parseDouble(num1);
                   number2=Double.parseDouble(num2);
                   answer.setText((number1+number2)+"");
               }catch(Exception e){
                   answer.setText("Error");
               }

            }




        });

    }
}
