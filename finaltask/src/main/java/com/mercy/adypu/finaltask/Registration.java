package com.mercy.adypu.finaltask;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText edtUsername, edtPassword, edtName, edtConfirm, edtMail;
    TextView txtReg;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtName = findViewById(R.id.edtName);
        edtMail = findViewById(R.id.edtMail);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignup = findViewById(R.id.btnSignup);
        btnLogin = findViewById(R.id.btnLogin);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("callFrom", "login");

                Intent intent = new Intent(Registration.this, Login.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void checkvalidations(){

        if (edtName.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter first name", Toast.LENGTH_SHORT).show();
        }

        else if (edtMail.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter email id", Toast.LENGTH_SHORT).show();
        }
        else if (edtPassword.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
        }
        else if (edtPassword.getText().toString().length()<6){
            Toast.makeText(this, "Enter valid password", Toast.LENGTH_SHORT).show();
        }
        else if (edtPassword.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter confirm password", Toast.LENGTH_SHORT).show();
        }
        else if (!edtConfirm.getText().toString().equals(edtPassword.getText().toString())){
            Toast.makeText(this, "Enter not password match", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent=new Intent(Registration.this,Registration.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }

    }
}
