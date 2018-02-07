package com.example.asus.sengonkos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_kos);

        productList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new Product(
                        1,
                        "Kos A",
                        "Alamat Kos A",
                        "wanita",
                        R.drawable.kosa));

        productList.add(
                new Product(
                        1,
                        "Kos B",
                        "Alamat Kos B",
                        "wanita",
                        R.drawable.kosb));

        productList.add(
                new Product(
                        1,
                        "Kos C",
                        "Alamat Kos C",
                        "wanita",
                        R.drawable.kosc));

        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
