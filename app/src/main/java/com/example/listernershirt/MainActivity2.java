package com.example.listernershirt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView rcv_Shirt;
    private AoAdapter aoAdapter;
    private ArrayList<Ao> aoArrayList;
    TextView tvName, tvGia;
   ImageButton imageButton02;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvName = (TextView) findViewById(R.id.tvName_02);
        tvGia = (TextView) findViewById(R.id.tvGia_02);
//        imageView = (ImageButton) findViewById(R.id.imageView02);
        imageButton02 = (ImageButton) findViewById(R.id.imageButton02);

        tvName.setText(getIntent().getStringExtra("name"));
        tvGia.setText(getIntent().getStringExtra("gia"));
        imageButton02.setImageResource(getIntent().getIntExtra("imagebutton", 0));
//        imageView.setImageResource(getIntent().getIntExtra("imagebutton", 0)); // u ma sao no k thay tv cua m ay


    }
}