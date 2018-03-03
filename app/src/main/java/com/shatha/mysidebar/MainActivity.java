package com.shatha.mysidebar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items> newitem = new ArrayList<Items>();
    ListView list;
    private DrawerLayout ndrawable;
    private RelativeLayout rdrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        newitem.add(new Items("Login", "", R.drawable.logi));
        newitem.add(new Items("Bookings", "", R.drawable.iih));
        newitem.add(new Items("country", "", R.drawable.eart));
        newitem.add(new Items("privacy", "", R.drawable.privacy));
        newitem.add(new Items("About us", "", R.drawable.k));
        newitem.add(new Items("Contact Us", "", R.drawable.letters));
        newitem.add(new Items("Rate us", "", R.drawable.sta));
        ndrawable = (DrawerLayout) findViewById(R.id.activity_main);

        rdrawable = (RelativeLayout) findViewById(R.id.drawerpane);
        list = (ListView) findViewById(R.id.mylistview);
        Drawableadapter adapter2 = new Drawableadapter(this, newitem);
        list.setAdapter(adapter2);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectitem(i);
            }
        });
    }




    private void selectitem(int position) {
        Fragment fragment = new layoutfrag();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        if (position == 0) {

            fragment = new Location();

            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        } else if (position == 1) {
            fragment = new layoutfrag();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();

        } else if (position == 2) {
            fragment = new loc();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        }
        else if (position == 3) {
            fragment = new Country();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        }

        else if (position == 4) {
            fragment = new Aboutas();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        }
        else if (position == 5) {
            fragment = new Contectas();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        }
        else if (position == 5) {
            fragment = new F();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        }

        else if (position == 6) {
            fragment = new F();
            fragmentManager.beginTransaction()
                    .replace(R.id.maincontent, fragment)
                    .commit();
        }
            list.setItemChecked(position, true);
            setTitle(newitem.get(position).mtitel);
            ndrawable.closeDrawer(rdrawable);

        }

    public void bureg(View view) {
        Fragment fragment=new forfrog2();
        android.app.FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainlayout,fragment)
                .commit();
    }

    public void bulog(View view) {
        Fragment fragment=new Forfrog();
        android.app.FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainlayout,fragment)
                .commit();
    }

    public void bufight(View view) {
        Fragment fragment=new flights();
        android.app.FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.maincontent,fragment)
                .commit();
    }
}




