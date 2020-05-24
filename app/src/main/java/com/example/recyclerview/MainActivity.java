package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecycleViewItem> recycleViewItems = new ArrayList<>();
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_satisfied_black_24dp,
                "Happy", "Life is fun!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp,
                "Sad", "Life is sad!"));
        recycleViewItems.add(new RecycleViewItem(R.drawable.ic_sentiment_neutral_black_24dp,
                "Neutral", "Life is life!"));
    }
}
