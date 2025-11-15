package com.example.computershop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class AccessoryFragment extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_accessory, container, false);

        recyclerView = view.findViewById(R.id.recyclerAccessory);

        list.add(new Product(R.drawable.mouse, "Chuột Logitech", "500.000đ"));
        list.add(new Product(R.drawable.keyboard, "Bàn phím cơ", "1.200.000đ"));
        list.add(new Product(R.drawable.headset, "Tai nghe gaming", "700.000đ"));

        adapter = new ProductAdapter(getContext(), list);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        return view;
    }
}
