package activity;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import attendance.guddukp.com.attendance.R;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
    }

    void bind() {
        //Submit Button
        findViewById(R.id.bt_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar.make(v, "Log In Recieved", Snackbar.LENGTH_INDEFINITE).setAction("OKAY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();*/
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        //Forgot password
        findViewById(R.id.forgot_pass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Clicked Forgot_pass",Snackbar.LENGTH_INDEFINITE).setAction("Click here", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "changed password", Toast.LENGTH_SHORT).show();

                    }
                }).show();
            }
        });

        //Visibility Toggle
        showHidePass(R.id.et_pass,R.id.ib_show_pass);
    }

    public void showHidePass(int p,int i){

        final EditText pass = findViewById(p);

        findViewById(i).setOnTouchListener(new View.OnTouchListener() {

                                               @Override
                                               public boolean onTouch(View v, MotionEvent event) {
                                                   if (event.getAction() == MotionEvent.ACTION_DOWN) {
                                                       pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                                                       v.setBackgroundResource(R.drawable.baseline_visibility_off_black_18dp);
                                                       return true;
                                                   } else if (event.getAction() == MotionEvent.ACTION_UP) {
                                                       pass.setInputType(InputType.TYPE_CLASS_TEXT |
                                                               InputType.TYPE_TEXT_VARIATION_PASSWORD);
                                                       v.setBackgroundResource(R.drawable.baseline_visibility_black_18dp);
                                                       return true;
                                                   }

                                                   return false;
                                               }
                                           }
        );
    }




}
