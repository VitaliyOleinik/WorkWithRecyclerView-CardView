package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView; // for connection class with layout
    private RecyclerView.Adapter adapter; // bridge of recView and data
    private RecyclerView.LayoutManager layoutManager; // controlled place of elements in recycleView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recycleViewItems = new ArrayList<>();
        recycleViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp,
                "Happy", "Life is fun!"));
        recycleViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp,
                "Sad", "Life is sad!"));
        recycleViewItems.add(new RecyclerViewItem(R.drawable.ic_sentiment_neutral_black_24dp,
                "Neutral", "Life is life!"));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true); // for optimization
        adapter = new RecyclerViewAdapter((recycleViewItems));
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
