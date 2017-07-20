package com.sun.idc3.survey;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by IDC2 on 7/20/17.
 */

public class SurveryAdapter extends RecyclerView.Adapter<SurveyViewHolder>{
    Context context;
    ArrayList<SurveyDataHolder> surveyDataHolders;

    public SurveryAdapter(Context context, ArrayList<SurveyDataHolder> surveyDataHolders){
        this.context = context;
        this.surveyDataHolders = surveyDataHolders;
    }

    @Override
    public SurveyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewGroup mainGroup = (ViewGroup) layoutInflater.inflate(R.layout.survey_list_detail, parent, false);
        SurveyViewHolder groupListViewHolder = new SurveyViewHolder(mainGroup);
        return groupListViewHolder;
    }

    @Override
    public void onBindViewHolder(SurveyViewHolder holder, int position) {
        SurveyDataHolder surveyDataHolder = surveyDataHolders.get(position);
        holder.claimNumber.setText(surveyDataHolder.claimNo);
        holder.policyNumber.setText(surveyDataHolder.policyNo);
        holder.vehicleRegNumber.setText(surveyDataHolder.vehicleRegNo);
        if (surveyDataHolder.status.equals("Completed")){
            holder.status.setBackground(Color.GREEN);
        }else{
            holder.status.setBackground(Color.RED);
        }
    }

    @Override
    public int getItemCount() {
        return surveyDataHolders.size();
    }
}
