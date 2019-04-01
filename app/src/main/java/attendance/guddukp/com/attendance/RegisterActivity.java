package attendance.guddukp.com.attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import attendance.guddukp.com.attendance.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        bindActivity();
    }

    private void bindActivity() {
        //Register button
        findViewById(R.id.bt_register_r).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Sign Up Recived", Toast.LENGTH_SHORT).show();
            }
        });

        //Visibility Toggle Confirm pass
        showHidePass(R.id.et_pass_r, R.id.ib_show_pass_r);
        showHidePass(R.id.et_rePass_r, R.id.ib_show_confirm_pass_r);
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