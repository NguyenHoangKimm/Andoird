package com.example.computershop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PCFragment extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pc, container, false);

        recyclerView = view.findViewById(R.id.recyclerPC);

        list.add(new Product(R.drawable.laptop, "PC Gaming RTX3060", "22.000.000đ"));
        list.add(new Product(R.drawable.laptop, "PC Gaming RTX4060", "25.000.000đ"));

        adapter = new ProductAdapter(getContext(), list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}
