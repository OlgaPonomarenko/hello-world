package com.example.ponomarenko.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public void onSumButtonClick (View v)
    {
        //EditText elementNumber1 = (EditText)findViewById(R.id.numOneID);
        //EditText elementNumber2 = (EditText)findViewById(R.id.numTwoID);
        TextView elementText = (TextView)findViewById(R.id.resultID);

        //int number1 = Integer.parseInt(elementNumber1.getText().toString());
        //int number2 = Integer.parseInt(elementNumber2.getText().toString());
        //int result = number1 + number2;

        String textValue = "hjhgf 5876,90 hhjkhh";

        String [] masOfStrings = textValue.split("");

        String resultValue = "";

        for(int i = 1; i < masOfStrings.length; i++)
        {
            if (isNumber(masOfStrings[i]))
                resultValue += masOfStrings[i];

            if( masOfStrings[i].equals(".") || masOfStrings[i].equals(","))
                resultValue += ".";
        }

        elementText.setText(resultValue);

        //double element = Double.parseDouble(textValue);

        //elementText.setText(textValue);

        //elementText.setText(masOfStrings[1]);

        //elementText.setText(Integer.toString(sizeOfMas));

        //elementText.setText(Double.toString(element));

    }
}
