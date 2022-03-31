package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainViewModel mainViewModel = new ViewModelProvider(this)
                .get(MainViewModel.class);


        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Button addButton = findViewById(R.id.addButton);

        ListAdapter adapter = new ListAdapter();
        OnAdapterClickListener listener = position -> {
            List<DataModel> newList = mainViewModel.removeOnPosition(position);
            adapter.setData(newList);
        };

        adapter.setListener(listener);
        recyclerView.setAdapter(adapter);

        adapter.setData(mainViewModel.getList());


        addButton.setOnClickListener(view -> {
            DataModel model = new DataModel();
            model.setTitleOne("Title " + mainViewModel.counter);
            model.setTitleTwo("Title " + mainViewModel.counter);
            model.setDeleteButton("Delete");
            mainViewModel.counter += 1;
            mainViewModel.addData(model);
            adapter.setData(mainViewModel.getList());
        });


    }
}