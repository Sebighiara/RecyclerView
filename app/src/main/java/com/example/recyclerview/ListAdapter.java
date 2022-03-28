package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    private List<DataModel> dataModelList = new ArrayList<>();

    public void setData(List<DataModel> data) {
        dataModelList.addAll(data);
        notifyDataSetChanged();
    }

    public void addData(DataModel model) {
        dataModelList.add(model);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(viewType, parent, false));
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.recyclerview_item_layout;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.bind(dataModelList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

}


class ListViewHolder extends RecyclerView.ViewHolder {

    TextView titleOne;
    TextView titleSecond;
    ImageView imageView;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        titleOne = itemView.findViewById(R.id.recycler_title_one);
        titleSecond = itemView.findViewById(R.id.recycler_title_two);
        imageView = itemView.findViewById(R.id.recycler_image);
    }

    public void bind(DataModel dataModel, int position) {
        titleOne.setText(dataModel.getTitleOne());
        titleSecond.setText(dataModel.getTitleTwo());

        Glide.with(imageView)
                .load("https://www.denofgeek.com/wp-content/uploads/2019/04/3515432-endgamedek-1.jpg?fit=1200%2C675")
                .circleCrop()
                .into(imageView);

    }

}