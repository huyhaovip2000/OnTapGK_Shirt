package com.example.listernershirt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv_Shirt;
    private AoAdapter aoAdapter;
    private ArrayList<Ao> aoArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_Shirt= findViewById(R.id.rcv_Shirt);

        aoArrayList = new ArrayList<>();
        aoArrayList.add(new Ao("Google 1", "$120", R.drawable.google1));
        aoArrayList.add(new Ao("Google 2", "$121", R.drawable.code1));
        aoArrayList.add(new Ao("Google 3", "$123", R.drawable.google1));
        aoArrayList.add(new Ao("Google 4", "$124", R.drawable.google1));
        aoArrayList.add(new Ao("Google 5", "$125", R.drawable.computer_engineer1));
        aoArrayList.add(new Ao("Google 6", "$126", R.drawable.yellow_google1));

        aoAdapter = new AoAdapter(this, aoArrayList);
        rcv_Shirt.setAdapter(aoAdapter);
        rcv_Shirt.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rcv_Shirt.setLayoutManager(gridLayoutManager);


    }
}