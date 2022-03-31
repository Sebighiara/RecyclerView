package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Button addButton = findViewById(R.id.addButton);
        Button deleteButton = findViewById(R.id.deleteButton);

        ListAdapter adapter = new ListAdapter();
        recyclerView.setAdapter(adapter);

        addButton.setOnClickListener(view -> {
            DataModel model = new DataModel();
            model.setTitleOne("Title 1");
            model.setTitleTwo("Title 2");
            model.setDeleteButton("Delete");
            adapter.addData(model);
        });


    }
}