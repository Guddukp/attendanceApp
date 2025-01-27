package fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import attendance.guddukp.com.attendance.AddstudentActivity;
import attendance.guddukp.com.attendance.AddteacherActivity;
import attendance.guddukp.com.attendance.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherFragment extends Fragment {


    public TeacherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_teacher, container, false);
        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AddteacherActivity.class);
                startActivity(in);
            }
        });
        return v;
    }

}
