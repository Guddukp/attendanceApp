package attendance.guddukp.com.attendance;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import fragment.AttendanceFragment;
import fragment.CourseFragment;
import fragment.StudentFragment;
import fragment.TeacherFragment;

public class AdminActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        bind();
    }
    private void bind(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.admin, menu);
        return true;
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_student_a) {
            StudentFragment studentFragment=new StudentFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame,studentFragment)
                    .addToBackStack(null)
                    .commit();
        } else if (id == R.id.nav_teacher) {
            TeacherFragment teacherFragment=new TeacherFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame,teacherFragment)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_attendance) {
             AttendanceFragment attendanceFragment=new AttendanceFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, attendanceFragment)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_course) {
            CourseFragment courseFragment=new CourseFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame,courseFragment)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_logout) {
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
