package com.example.cypher.teepee;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Teepee extends Activity
{
    private ListView houseView;
    private ListAdapter customAdapter;
    private ArrayList<House> houses;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //ActionBar actionBar = getActionBar();
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.WHITE));


            houses = new ArrayList<>();

            int[] pics = new int[5];
            //370 * 200
            pics[0] = R.drawable.house_one_finished;
            pics[1] = R.drawable.house_two_finished;
            pics[2] = R.drawable.house_three_finished;
            pics[3] = R.drawable.house_four_finished;
            pics[4] = R.drawable.house_five_finished;

            for (int i = 0; i < 5; i++)
            {
                houses.add(new House(pics[i%5], "Heading text", "Line one of text Line one of text", "Line two of text Line two of text"));
            }

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_teepee);
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu)
        {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_teepee, menu);
            return true;
        }

        @Override
        protected void onResume ()
        {
            super.onResume();
            customAdapter = new CustomList(Teepee.this, houses);
            houseView = (ListView) findViewById(R.id.listView);
            houseView.setAdapter(customAdapter);
            houseView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                {
                    Intent intent = new Intent(getApplicationContext(), PropertyDetails.class);
                    startActivity(intent);
                }
            });
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item)
        {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings)
            {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        public void clicked(View v)
        {
            Intent intent = new Intent(getApplicationContext(), PropertyDetails.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
        }
    }
