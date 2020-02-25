package com.mercy.adypu.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    int[] images;
    String[] names;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

       recyclerView = findViewById(R.id.recyclerView);
       images = new int[]{R.drawable.jellybean, R.drawable.jag, R.drawable.ferrari, R.drawable.img };
        names = new String[]{"jelly bean", "jag", "ferrari", "img"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( RecyclerActivity.this);

        VersionAdapter adapter = new VersionAdapter(RecyclerActivity.this, getList(images, names) );
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private List<AndroidVersion> getList(int[] images,String[] names){
        List<AndroidVersion> list= new ArrayList<>();

        for(int i=0; i<images.length; i++){
            AndroidVersion version=new AndroidVersion();
            version.setImage(images[i]);
            version.setName(names[i]);
            list.add(version);
        }
        return list;
    }
}
