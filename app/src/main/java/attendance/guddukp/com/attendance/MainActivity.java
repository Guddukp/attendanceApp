package attendance.guddukp.com.attendance;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
private EditText et_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_pass=findViewById(R.id.et_pass);
        bind();
    }

    void bind() {
        //Submit Button
        findViewById(R.id.bt_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Log In Recieved", Snackbar.LENGTH_INDEFINITE).setAction("OKAY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
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

        //Register Button
        findViewById(R.id.bt_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Sign Up Recieved", Snackbar.LENGTH_INDEFINITE).setAction("OKAY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });

        //Visibility Toggle
        findViewById(R.id.ib_show_pass).setOnTouchListener(new View.OnTouchListener() {
               @Override
               public boolean onTouch(View v, MotionEvent event) {

                   if (event.getAction() == MotionEvent.ACTION_DOWN) {
                       et_pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                       v.setBackgroundResource(R.drawable.baseline_visibility_off_black_18dp);
                       return true;
                   } else if (event.getAction() == MotionEvent.ACTION_UP) {
                       et_pass.setInputType(InputType.TYPE_CLASS_TEXT |
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

