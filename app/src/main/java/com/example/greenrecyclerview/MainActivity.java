package com.example.greenrecyclerview;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private GreenAdapter mAdapter;
    private RecyclerView mNumbersList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumbersList=(RecyclerView)findViewById(R.id.rv_numbers);
        mNumbersList.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        mNumbersList.setLayoutManager(linearLayoutManager);
        mAdapter=new GreenAdapter(num_list_item);
        mNumbersList.setAdapter(mAdapter);

    }
}
