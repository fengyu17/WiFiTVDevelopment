package com.geeya.wifitv.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.geeya.wifitv.R;
import com.geeya.wifitv.ui.interf.IMain;

import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, IMain {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_camara:
                break;
            case R.id.nav_gallery:
                break;
            case R.id.nav_slideshow:
                break;
            case R.id.nav_share:
                break;
            case R.id.nav_send:
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int radioButtonID = group.getCheckedRadioButtonId();
                Log.i("OnCheck", radioButtonID + "");
                switch (radioButtonID) {
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                        MainActivity.this.startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, MainActivity.class);
                        MainActivity.this.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, MainActivity.class);
                        MainActivity.this.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, MainActivity.class);
                        MainActivity.this.startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, MainActivity.class);
                        MainActivity.this.startActivity(intent5);
                        break;
                }
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
}
