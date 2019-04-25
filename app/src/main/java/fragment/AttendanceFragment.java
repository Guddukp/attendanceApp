package fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import attendance.guddukp.com.attendance.AddcourseActivity;
import attendance.guddukp.com.attendance.AddteacherActivity;
import attendance.guddukp.com.attendance.CheckattendanceActivity;
import attendance.guddukp.com.attendance.R;


public class AttendanceFragment extends Fragment {


    public AttendanceFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_attendance, container, false);
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), CheckattendanceActivity .class);
                startActivity(in);
            }
        });
        return v;
    }


}
