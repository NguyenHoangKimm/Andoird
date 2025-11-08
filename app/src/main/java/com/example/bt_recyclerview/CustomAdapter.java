package com.example.bt_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    Context context;
    List<MyModel> myModelList;
    SelectListener listener;

    public CustomAdapter(Context context, List<MyModel> myModelList, SelectListener listener) {
        this.context = context;
        this.myModelList = myModelList;
        this.listener = listener;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        MyModel item = myModelList.get(position);
        holder.txtName.setText(item.getName());
        holder.txtAge.setText(String.valueOf(item.getAge()));

        // Gắn sự kiện click
        holder.itemView.setOnClickListener(v -> listener.onItemClicked(item));
    }

    @Override
    public int getItemCount() {
        return myModelList.size();
    }
}
