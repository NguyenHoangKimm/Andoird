package com.example.bt_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SelectListener {

    RecyclerView recyclerView;
    ArrayList<com.example.bt_recyclerview.MyModel> myModelList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myModelList = new ArrayList<>();
        myModelList.add(new MyModel("NguyenHoangKim", 19));
        myModelList.add(new MyModel("NguyenKimHoang", 20));
        myModelList.add(new MyModel("Bruce", 26));
        myModelList.add(new MyModel("Stark", 35));
        myModelList.add(new MyModel("Steve", 104));
        myModelList.add(new MyModel("Natasha", 24));
        myModelList.add(new MyModel("Rock", 40));
        myModelList.add(new MyModel("Imtiaj", 26));
        myModelList.add(new MyModel("Sajib", 25));
        myModelList.add(new MyModel("Muntasir", 25));

        customAdapter = new CustomAdapter(this, myModelList, this);
        recyclerView.setAdapter(customAdapter);
    }

    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this, "Bạn chọn: " + myModel.getName(), Toast.LENGTH_SHORT).show();
    }
}
