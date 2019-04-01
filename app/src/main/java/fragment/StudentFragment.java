package fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import attendance.guddukp.com.attendance.AddstudentActivity;
import attendance.guddukp.com.attendance.R;
import attendance.guddukp.com.attendance.Teacher_mainActivity;


public class StudentFragment extends Fragment{


    private static final String Tag =StudentFragment.class.toString() ;

    public StudentFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_student, container, false);
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AddstudentActivity.class);
                startActivity(in);
            }
        });
        return v;
    }



}
