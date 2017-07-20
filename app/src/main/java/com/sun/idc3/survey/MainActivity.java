package com.sun.idc3.survey;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SurveyDataHolder surveyDataHolder = new SurveyDataHolder("asdasd","adsad","adad","adad","adad","adsd","adssa");
        ArrayList<SurveyDataHolder>  surveyDataHolders =  new ArrayList<>();
        surveyDataHolders.add(surveyDataHolder);
        SurveryAdapter surveryAdapter = new SurveryAdapter(getApplication(),surveyDataHolders);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(surveryAdapter);

    }


}
