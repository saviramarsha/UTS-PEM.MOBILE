package com.example.ilmuanislam.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.example.ilmuanislam.R;
import com.example.ilmuanislam.adapter.MainAdapter;
import com.example.ilmuanislam.data.MainData;
import com.example.ilmuanislam.model.MainModel;
import com.example.ilmuanislam.support.ItemClickSupport;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;
    private SearchView srcView;
    private TextView titleMain;
    private ArrayList<MainModel> list = new ArrayList<>();
    Animation one, two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srcView = findViewById(R.id.searchView);
        srcView.setQueryHint("Cari Ilmuan");
        titleMain = findViewById(R.id.txt_main);
        rvMain = findViewById(R.id.rv_main);
        rvMain.setHasFixedSize(true);

        list.addAll(MainData.getListData());
        showRecyclerList();

        // load animation
        one = AnimationUtils.loadAnimation(this, R.anim.one);
        two = AnimationUtils.loadAnimation(this, R.anim.two);

        // run anim
        srcView.startAnimation(two);
        titleMain.startAnimation(two);
        rvMain.startAnimation(one);


    }

    private void showRecyclerList() {
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(rvMain);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvMain.setLayoutManager(linearLayoutManager);
        MainAdapter listMainAdapter = new MainAdapter(this);
        listMainAdapter.setListMain(list);
        rvMain.setAdapter(listMainAdapter);

        ItemClickSupport.addTo(rvMain).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                // Menyimpan data ke dalam model
                MainModel mainModel = new MainModel();
                mainModel.setName(list.get(position).getName());
                mainModel.setYear(list.get(position).getYear());
                mainModel.setDesc(list.get(position).getDesc());
                mainModel.setPhoto(list.get(position).getPhoto());

                // Berpindah halaman dengan membawa data yang sudah disimpan di dalam model
                startActivity(new Intent(MainActivity.this, DetailActivity.class).putExtra(DetailActivity.EXTRA_KEY, mainModel));
            }
        });
    }


}
