package com.example.swetha.dndlconstructions;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by swetha on 24/09/16.
 */
public class ProjectDescLists extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public ProjectDescLists(Activity context, String[] web, Integer[] imageId){
        super(context,R.layout.list_single_project_desc, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_single_project_desc, null,true);
        TextView txtTitle = (TextView)rowView.findViewById(R.id.project_desc_txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.project_desc_img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }

}
