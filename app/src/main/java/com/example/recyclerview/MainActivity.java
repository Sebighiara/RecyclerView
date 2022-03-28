package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.list_recycler_view);
        ListAdapter adapter = new ListAdapter();
        recyclerView.setAdapter(adapter);


        DataModel modelOne = new DataModel();
        modelOne.setTitleOne("Title one");
        modelOne.setTitleTwo("Title two");
        adapter.addData(modelOne);

        DataModel modelTwo = new DataModel();
        modelTwo.setTitleOne("component two");
        modelTwo.setTitleTwo("component two");
        adapter.addData(modelTwo);


        DataModel modelThree = new DataModel();
        modelThree.setTitleOne("component three");
        modelThree.setTitleTwo("component three");
        adapter.addData(modelThree);


    }
}