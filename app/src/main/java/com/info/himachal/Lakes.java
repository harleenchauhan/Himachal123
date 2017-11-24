package com.info.himachal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;

public class Lakes extends AppCompatActivity {
    ListView list2;
    TextView textView7;
    ImageView imageView6;
    HashMap<String, String> templename1;
    String titles[] = {"Brighu Lake", "Chandra Lake", "Dal Lake", "Dashairand dhankarLake", "Gobindsagar", "Kareri",
            "Nako Lake", "Prashar Lake", "Renuka Lake", "Rewalsar Lake", "Surajtal"};
   /*int images[] = {R.drawable.brighulake,R.drawable.chandra1,R.drawable.dallake1, R.drawable.baijnathtemple,R.drawable.chamundakangara
            ,R.drawable.masroor_temple, R.drawable.bhagsutemple, R.drawable.kunalpathri, R.drawable.nagani};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);

        /*
            list2 = (ListView) findViewById(R.id.list);

           MyAdapter adapter1=new MyAdapter(getApplicationContext(),titles,images);
            list2.setAdapter(adapter1);
            list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent i2= new Intent(getApplicationContext(),baglamukhi.class);
                    i2.putExtra("S",list2.getItemAtPosition(i).toString());
                    startActivity(i2);
                }
            });
        }




        class MyAdapter extends ArrayAdapter {
            int imagearray[];
            String titlearray[];

            MyAdapter(Context contx, String titles1[], int images[]) {
                super(contx, R.layout.example_custview_row, R.id.textView7, titles1);

                imagearray = images;
                titlearray = titles1;

            }

            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflator = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = inflator.inflate(R.layout.listview, parent, false);

                ImageView myImage = (ImageView) row.findViewById(R.id.imageView6);
                TextView mytitle = (TextView) row.findViewById(R.id.textView7);


                myImage.setImageResource(imagearray[position]);
                mytitle.setText(titlearray[position]);


                return row;
            }
        }

    }*/

    }
}


