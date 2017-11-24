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
import android.widget.Switch;
import android.widget.TextView;


import java.util.HashMap;


public class Secondactivity extends AppCompatActivity {
    String titles[] = {"BAGLAMUKHI TEMPLE", "JWALAMUKHI TEMPLE", "BRIJESHWARI TEMPLE", "BAIJNATH TEMPLE", "CHAMUNDA DEVI","MASROOR TEMPLE",
                        "BHAGSUNAG TEMPLE","KUNAL PATHRI","NAGNI TEMPLE"};
    String title2[] = {"Dal Lake", "Kareri", "Maharanapratap Sagar"};
    String title3[] = {"Bir and Billing", "Kangra Fort", "MaharanaRanjeet sagar sanctuary","McleodGanj City","Triund Track",
                        "PlampurTea Garden","Gopalpur Zoo"};
    String title4[] = {"Triund Track","Indrapasstrek"};
    String title5[] = {"Kumarsweets And FastFood","Atithi Restaurant","Annapurna Bhojanalya","Royal Hotel And Restaurant"};
    String title6[] = {"Hotel The Grand Raj","Kangra Rodeway Hotel","Hotel The Woodz","The Pavilion","Kay Kay Resort",
                        "Hotel Wood Castle"};
    int images[] = {R.drawable.baglamukhi1,R.drawable.jwalaji,R.drawable.kangra, R.drawable.baijnathtemple,R.drawable.chamundakangara1
            ,R.drawable.masroortemple1, R.drawable.bhagsutemple, R.drawable.kunalpathri, R.drawable.nagani};

    int images1[] = {R.drawable.dallake1,R.drawable.kararilake,R.drawable.maharanapratapsagar1};
    int images3[] = {R.drawable.birandbilling,R.drawable.kangrafort,R.drawable.maharanapratapsagarsanctuary,R.drawable.mc,
                     R.drawable.triund1,R.drawable.palampurteagarden,R.drawable.gopalpurzoo};
    int images4[] ={R.drawable.triund1,R.drawable.indrapasstrek1};
    int images5[] ={R.drawable.kumarsweetsandfastfood,R.drawable.atithirestaurant,R.drawable.annapurnabhojanalya
            ,R.drawable.royalhotelrestaurant};
    int images6[] ={R.drawable.thegrandraj,R.drawable.kangrarodewayhotel,R.drawable.hotelthewoodz,R.drawable.pavilion1,
                    R.drawable.kaykayresort1,R.drawable.hotelthewoodz};

    ListView list;
    TextView textView7;
    ImageView imageView6;
    HashMap<String,String> templename1;
    HashMap<String,String> templename2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        list = (ListView) findViewById(R.id.list);
        Intent   i = getIntent();
        String s = i.getStringExtra("name");
        switch(s)
        {
            case"Temple":
                MyAdapter adapter1 = new MyAdapter(getApplicationContext(), titles, images);
                list.setAdapter(adapter1);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i2 = new Intent(getApplicationContext(), baglamukhi.class);
                        i2.putExtra("S", list.getItemAtPosition(i).toString());
                        startActivity(i2);
                    }
                });
            break;
            case "Lakes":
                MyAdapter adapter2=new MyAdapter(getApplicationContext(),title2,images1);
                list.setAdapter(adapter2);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i2= new Intent(getApplicationContext(),baglamukhi.class);
                        i2.putExtra("S",list.getItemAtPosition(i).toString());
                        startActivity(i2);
                    }
                });
                break;
            case "Tourist places":
                MyAdapter adapter3=new MyAdapter(getApplicationContext(),title3,images3);
                list.setAdapter(adapter3);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i2= new Intent(getApplicationContext(),baglamukhi.class);
                        i2.putExtra("S",list.getItemAtPosition(i).toString());
                        startActivity(i2);
                    }
                });
                break;
            case "Traking places":
                MyAdapter adapter4=new MyAdapter(getApplicationContext(),title4,images4);
                list.setAdapter(adapter4);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i2= new Intent(getApplicationContext(),baglamukhi.class);
                        i2.putExtra("S",list.getItemAtPosition(i).toString());
                        startActivity(i2);
                    }
                });
                break;
            case "Resturant":
                MyAdapter adapter5=new MyAdapter(getApplicationContext(),title5,images5);
                list.setAdapter(adapter5);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i2= new Intent(getApplicationContext(),baglamukhi.class);
                        i2.putExtra("S",list.getItemAtPosition(i).toString());
                        startActivity(i2);
                    }
                });
                break;
            case "Hotels":
                MyAdapter adapter6=new MyAdapter(getApplicationContext(),title6,images6);
                list.setAdapter(adapter6);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent i2= new Intent(getApplicationContext(),baglamukhi.class);
                        i2.putExtra("S",list.getItemAtPosition(i).toString());
                        startActivity(i2);
                    }
                });
                break;
        }






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

}




