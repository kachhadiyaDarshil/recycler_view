package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recycle);
        List<item> items= new ArrayList<>();

        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));
        items.add(new item("john","john@rku.ac.in",R.drawable.profileimage));


        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(getApplicationContext(),items));

    }
}