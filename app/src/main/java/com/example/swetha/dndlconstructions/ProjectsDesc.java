package com.example.swetha.dndlconstructions;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by swetha on 24/09/16.
 */
public class ProjectsDesc extends Activity {
    ListView list;
    String[] web = {
            "Plans",
            "Views",
            "Brochure"
    };

    Integer[] imageId = {
            R.drawable.download,
            R.drawable.our_views,
            R.drawable.our_brochures
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_desc);

        ProjectDescLists adapter = new ProjectDescLists(ProjectsDesc.this,web,imageId);
        list = (ListView)findViewById(R.id.project_desc_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(ProjectsDesc.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}

