package com.example.recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;//middlemen between data and recycler
    private  RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList =new ArrayList<>();//stores object from class

        exampleList.add(new ExampleItem(R.drawable.node,"Clicked at Studio"));//passing object
        exampleList.add(new ExampleItem(R.drawable.oner,"Clicked at India"));
        exampleList.add(new ExampleItem(R.drawable.twor,"Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.threer,"Clicked at Russia"));
        exampleList.add(new ExampleItem(R.drawable.fourr,"Clicked at USA"));
        exampleList.add(new ExampleItem(R.drawable.fiver,"Clicked at Switzerland"));
        exampleList.add(new ExampleItem(R.drawable.sixr,"Clicked at Italy"));

        //config for RV
        recyclerView=findViewById(R.id.recyclerView);
        //Performance
        recyclerView.setHasFixedSize(true);


        layoutManager=new LinearLayoutManager(this);
        adapter=new ExampleAdapter(exampleList);//passing example list to constructor in example adapter

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);







    }
}