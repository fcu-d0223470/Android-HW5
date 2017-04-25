package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

        albumlist.add(new AlbumItem("Grizzlies",95,R.drawable.gz,"Spurs",116,R.drawable.ss));
        albumlist.add(new AlbumItem("Rockets",94,R.drawable.rt,"Warriors",121,R.drawable.ws));

        AlbumArrayAdapter adapter = new AlbumArrayAdapter(this,albumlist);
        lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);

    }
}

