package com.example.recyclerview;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    private List<DataModel> dataModelList = new ArrayList<>();
    public int counter = 0;

    public void addData(DataModel model) {
        dataModelList.add(model);
    }

    public List<DataModel> getList() {
        return dataModelList;
    }

    public List<DataModel> removeOnPosition(int position){
        dataModelList.remove(position);
        return dataModelList;
    }

}
