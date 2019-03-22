package attendance.guddukp.com.attendance;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {
     private EditText rt_pass;
     private EditText confirm_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        rt_pass=(EditText)findViewById(R.id.rt_pass);
        confirm_pass=(EditText)findViewById(R.id.Confirm_Pass);
        bindActivity();
    }

    private void bindActivity() {
        //Register button
        findViewById(R.id.rt_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register_Activity.this, "Sign Up Recived", Toast.LENGTH_SHORT).show();
            }
        });
        //log In Button.
        findViewById(R.id.rt_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register_Activity.this, "Move on Log In page", Toast.LENGTH_SHORT).show();
            }
        });
        //Visibility Toggle
        findViewById(R.id.rb_show_pass).setOnTouchListener(new View.OnTouchListener() {
                                                               @Override
                                                               public boolean onTouch(View v, MotionEvent event) {
                                                                   if (event.getAction() == MotionEvent.ACTION_DOWN) {
                                                                       rt_pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                                                                       v.setBackgroundResource(R.drawable.baseline_visibility_off_black_18dp);
                                                                       return true;
                                                                   } else if (event.getAction() == MotionEvent.ACTION_UP) {
                                                                       rt_pass.setInputType(InputType.TYPE_CLASS_TEXT |
                                                                               InputType.TYPE_TEXT_VARIATION_PASSWORD);
                                                                       v.setBackgroundResource(R.drawable.baseline_visibility_black_18dp);
                                                                       return true;
                                                                   }

                                                                   return false;
                                                               }
                                                           }
        );
        //Visibility Toggle Confirm pass
        findViewById(R.id.rb_show_confirm_pass).setOnTouchListener(new View.OnTouchListener() {
                                                               @Override
                                                               public boolean onTouch(View v, MotionEvent event) {

                                                                   if (event.getAction() == MotionEvent.ACTION_DOWN) {
                                                                       confirm_pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                                                                       v.setBackgroundResource(R.drawable.baseline_visibility_off_black_18dp);
                                                                       return true;
                                                                   } else if (event.getAction() == MotionEvent.ACTION_UP) {
                                                                       confirm_pass.setInputType(InputType.TYPE_CLASS_TEXT |
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
