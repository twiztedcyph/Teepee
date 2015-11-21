package com.example.cypher.teepee;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Cypher on 20/11/2015.
 */
public class CustomList extends ArrayAdapter<House>
{
    private ArrayList<House> houses;
    private static int count;

    public CustomList(Context context, ArrayList<House> houses)
    {
        super(context, R.layout.custom_list_layout, houses);

        this.houses = houses;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        count++;

        View v = convertView;

        if (v == null)
        {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.custom_list_layout, null);
        }

        House house = houses.get(position);

        if (count >houses.size())
        {
            count = 0;
        }


        ImageView imageView = (ImageView) v.findViewById(R.id.houseImage);


        imageView.setImageResource(house.getImageId());


        return v;
    }
}
