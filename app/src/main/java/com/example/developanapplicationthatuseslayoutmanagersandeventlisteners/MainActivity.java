package com.example.developanapplicationthatuseslayoutmanagersandeventlisteners;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        output = findViewById(R.id.textView);
        input = findViewById(R.id.editTextTextPersonName);
        output.setText("hello "+input.getText());
    }
}