package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView Recyclerview;
private List <String> dataList = new ArrayList<>();
MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Recyclerview = findViewById(R.id.recyvlerView);
        Recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(dataList);
        Recyclerview.setAdapter(adapter);
        dataList.add("Elemento 1");
        dataList.add("Elemento 2");
        dataList.add("Elemento 3");
        adapter.notifyDataSetChanged();

    }
}