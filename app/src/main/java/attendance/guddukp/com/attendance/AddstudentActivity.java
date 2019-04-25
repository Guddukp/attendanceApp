package attendance.guddukp.com.attendance;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class AddstudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstudent);

        findViewById(R.id.bt_add_student_r).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAndRequestResponse(((TextView)findViewById(R.id.et_roll_S)).getText().toString(),((TextView)findViewById(R.id.et_name_S)).getText().toString(), ((TextView)findViewById(R.id.et_email_S)).getText().toString(), ((TextView)findViewById(R.id.et_CONTACT_S)).getText().toString());
            }
        });
    }

    private void sendAndRequestResponse(String roll, String name, String email, String number) {

        RequestQueue mRequestQueue;
        StringRequest mStringRequest;
        String url = "https://theguysite.000webhostapp.com/addstudent.php?id="+roll+"&name="+name+"&email="+email+"&no="+number;

        mRequestQueue = Volley.newRequestQueue(this);

        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if(response.toString().toLowerCase().equals("success")){
                    onBackPressed();
                }else {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();//display the response on screen
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        mRequestQueue.add(mStringRequest);
    }
}
