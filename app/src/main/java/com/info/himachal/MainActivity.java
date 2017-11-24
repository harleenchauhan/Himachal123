package com.info.himachal;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    String titles[] = {"Temple","Lakes", "Tourist places", "Traking places", "Resturant","Hotels"};

    GridView grid;
    int images[] = {R.drawable.hs, R.drawable.la,R.drawable.mainto1,R.drawable.track1, R.drawable.rest1, R.drawable.hotel1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridView) findViewById(R.id.grid);
        imageView = (ImageView) findViewById(R.id.imageView);
        MyAdapter adapter = new MyAdapter(getApplicationContext(), titles, images);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), Secondactivity.class);
                i.putExtra("name", grid.getItemAtPosition(position).toString());
                //Toast.makeText(MainActivity.this,grid.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }





    class MyAdapter extends ArrayAdapter {
        int imagearray[];
        String titlearray[];



         MyAdapter(Context contx, String[] titles, int[] imgs) {
             super(contx, R.layout.example_custview_row, R.id.textView, titles);

             imagearray = imgs;
             titlearray = titles;

         }


        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflator = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflator.inflate(R.layout.example_custview_row, parent, false);

            ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
            TextView mytitle = (TextView) row.findViewById(R.id.textView);


            myImage.setImageResource(imagearray[position]);
            mytitle.setText(titlearray[position]);



            return row;
        }
    }
}