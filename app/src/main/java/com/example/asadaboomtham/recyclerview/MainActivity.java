package com.example.asadaboomtham.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] Book_name, Book_price;
    int[] Img_res = {R.drawable.english, R.drawable.grammar, R.drawable.spider, R.drawable.travel, R.drawable.superman
    ,R.drawable.overwatch};
    ArrayList<DataProvider> arrayList = new ArrayList<DataProvider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Book_name = getResources().getStringArray(R.array.book_name);
        Book_price = getResources().getStringArray(R.array.book_price);
        int i = 0;
        for (String name : Book_name) {


            DataProvider dataProvider = new DataProvider(Img_res[i], name, Book_price[i]);
            arrayList.add(dataProvider);
            i++;
        }
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
