package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText totalBillBox;
    private EditText tipPercentBox;

    private EditText costOfMealBox;
    private RadioButton singleButton;
    private RadioButton multiButton;
    private RadioGroup RadioG1;
    private EditText numPeopleBox;
    private EditText totalPerBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalBillBox = findViewById(R.id.totalBillBox);
        tipPercentBox = findViewById(R.id.tipPercentBox);

        costOfMealBox = findViewById(R.id.costOfMealBox);
        singleButton = findViewById(R.id.singleButton);
        multiButton = findViewById(R.id.multiButton);
        numPeopleBox = findViewById(R.id.numPeopleBox);
        totalPerBox = findViewById(R.id.totalPerBox);
        RadioG1 = findViewById(R.id.radioGroup);

        RadioG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup RadioG1, int multiButton) {
               // RadioG1.
               // calculateMeal(v);
            }
        });


    }

    public void calculateMeal(View v){
        String input1 = totalBillBox.getText().toString();
        String input2 = tipPercentBox.getText().toString();

        double totValue = Double.parseDouble(input1);
        double tipValue = Double.parseDouble(input2);

        double mealValue = totValue + (totValue*(tipValue/100));
        costOfMealBox.setText(String.format("%.2f", mealValue));



        String input3 = numPeopleBox.getText().toString();

        double num = Double.parseDouble(input3);
       double pp = mealValue / num;
      // totalPerBox.setText(String.format("%.2f", mealValue));






    }





}
