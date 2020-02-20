package com.mercy.adypu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText editText4, editText5;
    TextView textView, textView3, textView4, textView6;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        editText4=findViewById(R.id.editText4);
        editText5=findViewById(R.id.editText5);




    }
}
