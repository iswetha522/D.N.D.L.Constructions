package com.example.swetha.dndlconstructions;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by swetha on 23/09/16.
 */
public class Projects extends Activity {
    ListView list;
    String[] web = {
            "Colors Park",
            "Temple Tree Park"
    };

    Integer[] imageId = {
            R.drawable.colors_logo,
            R.drawable.temple_logo
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.projects);

        Lists adapter = new Lists(Projects.this,web,imageId);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Projects.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();



            }
        });
    }
}
