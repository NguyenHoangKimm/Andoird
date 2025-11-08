package com.example.bt_recyclerview;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtAge;

    public CustomViewHolder(View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.txtName);
        txtAge = itemView.findViewById(R.id.txtAge);
    }
}
