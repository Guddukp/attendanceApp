package com.example.guddupatel.myapplication2.Activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.guddupatel.myapplication2.R;

public class Log_In extends AppCompatActivity {

    private static final String Tag = Log_In.class.getSimpleName();
    private LinearLayout rootLayout;
    private ProgressBar progressBar;
    private EditText email,password;
    private Spinner loginType;
    private Button login,forgotpassword,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        bindActivity();
        appRunning();
    }

    private void appRunning() {
        Log.e(Tag, "App is Runnin");
    }

    private void bindActivity() {

        rootLayout = findViewById(R.id.rootLayout);
        progressBar=findViewById(R.id.progressBar);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        loginType=findViewById(R.id.spinner);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=email.getText().toString();
                if(str.length()==0)
                {
                    Toast.makeText(Log_In.this, "Enter email Id", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    email.setText(str);
                }

            }
        });

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=password.getText().toString();
                if(str.length()==0)
                {
                    Toast.makeText(Log_In.this, "Enter the password", Toast.LENGTH_SHORT).show();
                }
                else {
                    email.setText(str);
                }
            }
        });

    }

    public void SignUp(View view) {

        Snackbar.make(view, "SignUp", Snackbar.LENGTH_SHORT)
                .setAction("clickme", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Log_In.this, "Signup is Succesfull", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
        signup=findViewById(R.id.signUp);
    }

    public void Login(View view) {
        Snackbar.make(view, "LogIn", Snackbar.LENGTH_SHORT).show();
        login=findViewById(R.id.logIn);
    }

    public void Forgot(View view) {
        forgotpassword=findViewById(R.id.forgotPassword);
         forgotpassword.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(Log_In.this, "ForgoetPassword", Toast.LENGTH_SHORT).show();
             }
         });
    }
}
