package attendance.guddukp.com.attendance;

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

public class AddcourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourse);

        findViewById(R.id.bt_add_student_r).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAndRequestResponse(((TextView)findViewById(R.id.et_course_code_c)).getText().toString(),((TextView)findViewById(R.id.et_name_S)).getText().toString(), ((TextView)findViewById(R.id.et_CONTACT_t)).getText().toString());
            }
        });

    }

    private void sendAndRequestResponse(String code, String name, String number) {

        RequestQueue mRequestQueue;
        StringRequest mStringRequest;
        String url = "https://theguysite.000webhostapp.com/addcourse.php?id="+code+"&name="+name+"&no="+number;

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