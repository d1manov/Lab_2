package com.example.lab_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.PersistableBundle;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView operation;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operation = findViewById(R.id.operation);
        result = findViewById(R.id.result);
    }
    public void clickActionAddition(final View view) {
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        float a = Float.parseFloat(number1.getText().toString());
        float b = Float.parseFloat(number2.getText().toString());
        String r = "= " + String.format("%.2f", a + b);
        operation.setText("+");
        result.setText(r);
    }
    public void clickActionSubtraction(final View view) {
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        float a = Float.parseFloat(number1.getText().toString());
        float b = Float.parseFloat(number2.getText().toString());
        String r = "= " + String.format("%.2f", a - b);
        operation.setText("-");
        result.setText(r);
    }
    public void clickActionDivision(final View view) {
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        float a = Float.parseFloat(number1.getText().toString());
        float b = Float.parseFloat(number2.getText().toString());
        if (b == 0) {
            Toast.makeText(MainActivity.this, "На 0 делить нельзя !", Toast.LENGTH_LONG).show();
            operation.setText("/");
            result.setText("= ");
            return;
        }
        String r = "= " + String.format("%.2f", a / b);
        operation.setText("/");
        result.setText(r);
    }
    public void clickActionMultiplication(final View view) {
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        float a = Float.parseFloat(number1.getText().toString());
        float b = Float.parseFloat(number2.getText().toString());
        String r = "= " + String.format("%.2f", a * b);
        operation.setText("*");
        result.setText(r);
    }
    public void clickActionClear(final View view) {
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number1.setText("");
        number2.setText("");
        operation.setText("");
        result.setText("= ");
    }
}