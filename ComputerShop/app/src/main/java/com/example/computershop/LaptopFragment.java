package com.example.computershop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LaptopFragment extends Fragment {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_laptop, container, false);

        recyclerView = view.findViewById(R.id.recyclerLaptop);

        list.add(new Product(R.drawable.ic_launcher_foreground, "Laptop Dell", "15.000.000đ"));
        list.add(new Product(R.drawable.ic_launcher_foreground, "Laptop Asus", "18.000.000đ"));
        list.add(new Product(R.drawable.ic_launcher_foreground, "Laptop HP", "16.500.000đ"));

        adapter = new ProductAdapter(getContext(), list);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        return view;
    }
}
